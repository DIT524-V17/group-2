#include <SimpleTimer.h>
#include <Smartcar.h>
#include <NewPing.h>
#include <LSM303.h>
#include <Wire.h>

#define TRIGGER_PIN_RIGHT_FRONT  51  // Arduino pin tied to trigger pin on the ultrasonic sensor
#define ECHO_PIN_RIGHT_FRONT     50  // Arduino pin tied to echo pin on the right ultrasonic sensor
#define TRIGGER_PIN_LEFT_FRONT  43 
#define ECHO_PIN_LEFT_FRONT     42  
#define TRIGGER_PIN_MID_FRONT  49 
#define ECHO_PIN_MID_FRONT     48
#define TRIGGER_PIN_SIDE_LEFT  35
#define ECHO_PIN_SIDE_LEFT     34
#define TRIGGER_PIN_SIDE_RIGHT  33 
#define ECHO_PIN_SIDE_RIGHT     32 
#define TRIGGER_PIN_BACK  23 
#define ECHO_PIN_BACK     22 
#define MAX_DISTANCE 200 // Maximum distance we want to ping for

NewPing sonarRightFront(TRIGGER_PIN_RIGHT_FRONT, ECHO_PIN_RIGHT_FRONT, MAX_DISTANCE);
NewPing sonarLeftFront(TRIGGER_PIN_LEFT_FRONT, ECHO_PIN_LEFT_FRONT, MAX_DISTANCE);
NewPing sonarMidFront(TRIGGER_PIN_MID_FRONT, ECHO_PIN_MID_FRONT, MAX_DISTANCE);
NewPing sonarSideLeft(TRIGGER_PIN_SIDE_LEFT, ECHO_PIN_SIDE_LEFT, MAX_DISTANCE);
NewPing sonarSideRight(TRIGGER_PIN_SIDE_RIGHT, ECHO_PIN_SIDE_RIGHT, MAX_DISTANCE);
NewPing sonarBack(TRIGGER_PIN_BACK, ECHO_PIN_BACK, MAX_DISTANCE);

Car car;
LSM303 compass;
SimpleTimer batteryTimer;
SimpleTimer sensorTimer;
ShieldMotors motors;

int motorSpeedRight;
int motorSpeedLeft;
String input; //input from Bluetooth module (from phone application) 
String inputRPi; //input from USB (from Raspberry Pi)

//distance to obstacle for particular sensor
int distanceRightFront = 0;    
int distanceLeftFront = 0;
int distanceMidFront = 0;
int distanceSideLeft = 0;
int distanceSideRight = 0;
int distanceBack = 0;

//Variables for looping sensors
int i = 0;
int j = 0;

//Prefix for sensor value
String b = "BB";
String sfm = "FM";
String sfr = "FR";
String sfl = "FL";
String sr = "SR";
String sl = "SL";
String sb = "SB";

int mode;
int angleGPS;
int speedGPS;

//Compass variables
float heading = 0;
float tempHeading = 0;
int turn = 0;

void setup() {
  Serial3.begin(9600);
  Serial.begin(9600);
  car.begin();
  Wire.begin();

  /*
  compass.init();
  compass.enableDefault();
  compass.m_min = (LSM303::vector<int16_t>){-32767, -32767, -32767}; //Compass calibration values
  compass.m_max = (LSM303::vector<int16_t>){+32767, +32767, +32767};
  **/
  
  batteryTimer.setInterval(5000, sendVoltage); //Sets the interval to send the voltage every 5 second
  sensorTimer.setInterval(500, sendSensorValues);
}

void loop() {
  batteryTimer.run();
  handleInput();
  //handleInputRpi();
  sendSensorValues();
  if(mode == 1) { //GPS following mode
    GPSfollowing();
  }else{  //Manual control mode
    moveManual();
  }
}

void moveManual() {
  if(motorSpeedLeft > 0 && motorSpeedRight > 0){              //If the car gets input to go forward
    if(!obstacleDetectionFront()){                            //If there is no obstacles in front of the car
      motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);  //Sets input speed
    }else{
      motors.setMotorSpeed(0, 0);                             //Sets speed to 0 since obstacle in front detected
    }
  }
  else if(motorSpeedLeft < 0 && motorSpeedRight < 0){
    if(!obstacleDetectionRear()){
      motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);
    }else{
      motors.setMotorSpeed(0, 0);
    }
  }else{
    motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);    //When input is neither forwards nor backwards
  }
}

void handleInput() { 
  if (Serial3.available()) {  //Handle serial input if there is any
    input = Serial3.readStringUntil('\n');
    if(input.startsWith("R")){
      motorSpeedRight = input.substring(1).toInt(); //Sets the motorspeed value for the right engines
    }else if(input.startsWith("L")){
      motorSpeedLeft = input.substring(1).toInt();
    }else if(input.startsWith("M")){
      mode = 0;
    }
  }
}

void handleInputRPi(){
  if (Serial.available()) { //Handle serial input from Raspberry Pi
    inputRPi = Serial.readStringUntil('\n');
    if(inputRPi.startsWith("G")){ //Activates GPS mode 
      mode = 1;
    }
    else if(input.startsWith("M")){ //Activates manual control mode
      mode = 0;
    }
  }
}

void GPSfollowing(){ //Execute the maneuvering commands send by the RPi
  getHeading(); //Gets heading from compass

  if (Serial.available()) { //Handle serial input from Raspberry Pi
    inputRPi = Serial.readStringUntil('\n');
  }
  if (inputRPi.startsWith("A")){
    angleGPS = inputRPi.substring(1).toInt();
    rotateOnSpot(angleGPS); //Turn to specific degree
  }
  else if (inputRPi.startsWith("S")){
    speedGPS = inputRPi.substring(1).toInt();
    motors.setSpeed(speedGPS);  //Set speed
  }
}

void getHeading(){ //Gets heading from compass
  compass.read();
  heading = compass.heading((LSM303::vector<int>){0, 0, 1});
}

void rotateOnSpot(int targetDegrees) { //Method rotates the car to a certain heading, targetDegrees, and stops
  tempHeading = heading; //used to calculate what way to turn for shortest angle
  
  if(tempHeading < targetDegrees){
    tempHeading += 360;
  }
  turn = tempHeading - targetDegrees;

  if (turn < 180) { //If turn is less than 180, rotate counter clockwise
    car.setMotorSpeed(-50, 80); // left motors spin backward, right motors spin forward
  }else {
    car.setMotorSpeed(80, -50); // left motors spin forward, right motors spin backward
  }

  //The car will stop rotating when targetDegrees is between the current heading -/+ 1 degree
  while (!(heading < (targetDegrees + 1) && heading > (targetDegrees - 1))) {
    getHeading();
  }
  car.stop(); //we have reached the target, so stop the car
}

void sendVoltage() {
  if(motorSpeedLeft == 0 && motorSpeedRight == 0){ //Sends the voltage only when the engines are not working (the voltage drops significantly while engines are running)
    Serial3.println(b + analogRead(A0)); //Sends the voltage value to the phone  
  }
}

void sendSensorValues() { //Loops through the sensors and sends their distance with prefix via BT to mobile phone
  if(j == 0){
    distanceMidFront = sonarMidFront.ping_in(); 
    Serial3.println(sfm + distanceMidFront); 
    j++; //Increment the loop variable
  }else if (j == 1){
    distanceLeftFront = sonarLeftFront.ping_in();
    Serial3.println(sfl + distanceLeftFront);
    j++;
  }else if (j == 2){
    distanceRightFront = sonarRightFront.ping_in();
    Serial3.println(sfr + distanceRightFront);
    j++;
  }else if (j == 3){
    distanceSideLeft = sonarSideLeft.ping_in();
    Serial3.println(sl + distanceSideLeft);
    j++;
  }else if (j == 4){
    distanceSideRight = sonarSideRight.ping_in();
    Serial3.println(sr + distanceSideRight);
    j++;
  }else if (j == 5){
    distanceBack = sonarBack.ping_in();
    Serial3.println(sb + distanceBack);
    j = 0;
  }
}

boolean obstacleDetectionFront(){ //Loops through the sensors in front of the car, returns true if obstacle is detected
  if(i == 0){
    distanceMidFront = sonarMidFront.ping_in(); //Receives distance to potential obstacle in front of sensor
    if(distanceMidFront < 18 && distanceMidFront > 0){                                                                                                         
      return true;  //Returns true if obstacle within distance 18
    }
  i++;
  }
  else if (i == 1){
    distanceRightFront = sonarRightFront.ping_in();
    if(distanceRightFront < 9 && distanceRightFront > 0){                                                                                                                                    
      return true;
    }
  i++;
  }else if (i == 2){
    distanceLeftFront = sonarLeftFront.ping_in();  
    if(distanceLeftFront < 9 && distanceLeftFront > 0){                                                                                                                                    
      return true;
    }
  i = 0;
  }
  return false;
}

boolean obstacleDetectionRear(){ 
  distanceBack = sonarBack.ping_in(); //Gets distance to obstacle detected by rear ultrasonic sensor
  if(distanceBack < 18 && distanceBack > 0){
    return true; //Returns true if obstacle within distance 18
  }
  return false;
}
