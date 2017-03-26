#include <SimpleTimer.h>
#include <Smartcar.h>
#include <NewPing.h>
#include <SoftwareSerial.h>


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

#define MAX_DISTANCE 200 // Maximum distance we want to ping for (in centimeters)

NewPing sonarRightFront(TRIGGER_PIN_RIGHT_FRONT, ECHO_PIN_RIGHT_FRONT, MAX_DISTANCE);
NewPing sonarLeftFront(TRIGGER_PIN_LEFT_FRONT, ECHO_PIN_LEFT_FRONT, MAX_DISTANCE);
NewPing sonarMidFront(TRIGGER_PIN_MID_FRONT, ECHO_PIN_MID_FRONT, MAX_DISTANCE);
NewPing sonarSideLeft(TRIGGER_PIN_SIDE_LEFT, ECHO_PIN_SIDE_LEFT, MAX_DISTANCE);
NewPing sonarSideRight(TRIGGER_PIN_SIDE_RIGHT, ECHO_PIN_SIDE_RIGHT, MAX_DISTANCE);
NewPing sonarBack(TRIGGER_PIN_BACK, ECHO_PIN_BACK, MAX_DISTANCE);

Car car;
SimpleTimer timer;
ShieldMotors motors;

int motorSpeedRight;
int motorSpeedLeft;
String input;
int distanceRightFront = 0;    //distance to obstacle for the right sensor
int distanceLeftFront = 0;    //distance to obstacle for the left sensor
int distanceMidFront = 0;
int distanceSideLeft = 0;
int distanceSideRight = 0;
int distanceBack = 0;
int i = 0;
int j = 0;
String b = "B";
String sfm = "FM";
String sfr = "FR";
String sfl = "FL";
String sr = "R";
String sl = "L";
String sb = "SB";

void setup() {
  Serial3.begin(9600);
  car.begin();
  timer.setInterval(5000, sendVoltage); //Sets the interval to send the voltage every 5 second
}

void loop() {
  timer.run();
  handleInput();
  sendSensorValues();
  if(motorSpeedLeft > 0 && motorSpeedRight > 0){  //If the car gets input to go forward
    if(!obstacleDetectionFront()){  //If there is no obstacles in front of the car
      motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight); //Sets input speed
    }else{
    motors.setMotorSpeed(0, 0); //Sets speed to 0 since obstacle in front detected
    }
  }

  else if(motorSpeedLeft < 0 && motorSpeedRight < 0){
    if(!obstacleDetectionRear()){
      motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);
    }else{
    motors.setMotorSpeed(0, 0);
    }
  }
  else{
    motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);  //When input is neither forwards nor backwards
  }
}

void handleInput() { 
  if (Serial3.available()) { //handle serial input if there is any
    input = Serial3.readStringUntil('\n');
    if (input.startsWith("R")){
      motorSpeedRight = input.substring(1).toInt(); //Sets the motorspeed value for the right engines
    }else if (input.startsWith("L")){
      motorSpeedLeft = input.substring(1).toInt();
    }
  }
}

void sendVoltage() {
  if(motorSpeedLeft == 0 && motorSpeedLeft == 0) //Sends the voltage only when the engines are not working (the voltage drops significantly while engines are running)
    Serial3.println(b + analogRead(A0)); //Sends the voltage value to the phone  
}

void sendSensorValues() {
  if(j == 0){
    distanceMidFront = sonarMidFront.ping_in();
    Serial3.println(sfm + distanceMidFront);
    j++;
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
      return true;  //Obstacle detected within 18 inches
    }
    i++;
  }
  else if (i == 1){
    distanceRightFront = sonarRightFront.ping_in(); //updates the distance according to the right ultrasonic sensor
    if(distanceRightFront < 9 && distanceRightFront > 0){                                                                                                                                    
      return true;
    }
    i++;
    }
  else if (i == 2){
    distanceLeftFront = sonarLeftFront.ping_in();  
    if(distanceLeftFront < 9 && distanceLeftFront > 0){                                                                                                                                    
      return true;
    }
     i = 0;
  }
  return false;
}

boolean obstacleDetectionRear(){
  distanceBack = sonarBack.ping_in();
  if(distanceBack < 18 && distanceBack > 0){
    return true;
  }
  return false;
}
