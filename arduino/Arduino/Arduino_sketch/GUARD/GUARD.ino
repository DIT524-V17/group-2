#include <Smartcar.h>
#include <NewPing.h>
#include <SoftwareSerial.h>

#define TRIGGER_PIN_RIGHT_FRONT  51  // Arduino pin tied to trigger pin on the right ultrasonic sensor
#define ECHO_PIN_RIGHT_FRONT     50  // Arduino pin tied to echo pin on the right ultrasonic sensor

#define TRIGGER_PIN_LEFT_FRONT  43  // Arduino pin tied to trigger pin on the left ultrasonic sensor
#define ECHO_PIN_LEFT_FRONT     42  // Arduino pin tied to echo pin on the left ultrasonic sensor

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

void setup() {
  Serial3.begin(9600);
  car.begin();
}

void loop() {
  sendVoltage();
  handleInput();
  if(motorSpeedLeft > 0 && motorSpeedRight > 0){
    if(!obstacleDetectionFront()){
      motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);
    }else{
    motors.setMotorSpeed(0, 0);
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
    motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);
  }
}

void handleInput() { //handle serial input if there is any
  if (Serial3.available()) {
    input = Serial3.readStringUntil('\n');
    if (input.startsWith("R")){
      motorSpeedRight = input.substring(1).toInt();
    }else if (input.startsWith("L")){
      motorSpeedLeft = input.substring(1).toInt();
    }
  }
}


void sendVoltage() {
  String b = "B";
  Serial3.println(b + analogRead(A0)); // prints out the voltage measured with 5 decimals (corresponds to resolution (0.00489V (5V/1023));
}

boolean obstacleDetectionFront(){
  if(i == 0){
    distanceMidFront = sonarMidFront.ping_in();
    if(distanceMidFront < 18 && distanceMidFront > 0){                                                                                                                                    
      return true;
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
