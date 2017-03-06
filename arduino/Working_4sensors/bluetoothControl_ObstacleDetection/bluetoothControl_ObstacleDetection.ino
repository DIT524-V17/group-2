#include <Smartcar.h>
#include <NewPing.h>

#define TRIGGER_PIN_RIGHT_FRONT  37  // Arduino pin tied to trigger pin on the right ultrasonic sensor
#define ECHO_PIN_RIGHT_FRONT     36  // Arduino pin tied to echo pin on the right ultrasonic sensor
#define TRIGGER_PIN_LEFT_FRONT  41  // Arduino pin tied to trigger pin on the left ultrasonic sensor
#define ECHO_PIN_LEFT_FRONT     40  // Arduino pin tied to echo pin on the left ultrasonic sensor
#define TRIGGER_PIN_MID_FRONT  39 
#define ECHO_PIN_MID_FRONT     38 
//#define TRIGGER_PIN_SIDE_LEFT  ?
//#define ECHO_PIN_SIDE_LEFT     ? 
//#define TRIGGER_PIN_SIDE_RIGHT  ? 
//#define ECHO_PIN_SIDE_RIGHT     ? 
#define TRIGGER_PIN_BACK  35 
#define ECHO_PIN_BACK     34 

#define MAX_DISTANCE 200 // Maximum distance we want to ping for (in centimeters)

NewPing sonarRightFront(TRIGGER_PIN_RIGHT_FRONT, ECHO_PIN_RIGHT_FRONT, MAX_DISTANCE);
NewPing sonarLeftFront(TRIGGER_PIN_LEFT_FRONT, ECHO_PIN_LEFT_FRONT, MAX_DISTANCE);
NewPing sonarMidFront(TRIGGER_PIN_MID_FRONT, ECHO_PIN_MID_FRONT, MAX_DISTANCE);
//NewPing sonarSideLeft(TRIGGER_PIN_SIDE_LEFT, ECHO_PIN_SIDE_LEFT, MAX_DISTANCE);
//NewPing sonarSideRight(TRIGGER_PIN_SIDE_RIGHT, ECHO_PIN_SIDE_RIGHT, MAX_DISTANCE);
NewPing sonarBack(TRIGGER_PIN_BACK, ECHO_PIN_BACK, MAX_DISTANCE);

Car car;

int fSpeed = 70;    //70% of the full speed forward
int bSpeed = -70;   //70% of the full speed backward
const int lDegrees = -75; //degrees to turn left
const int rDegrees = 75;  //degrees to turn right
char input;               //input char from Bluetooth
int distanceRightFront = 0;    //distance to obstacle for the right sensor
int distanceLeftFront = 0;    //distance to obstacle for the left sensor
int distanceMidFront = 0;
//int distanceSideLeft = 0;
//int distanceSideRight = 0;
int distanceBack = 0;


void setup() {
  Serial3.begin(9600);  //change if you do not want to use Bluetooth
  car.begin(); //initialize the car using the encoders and the gyro
}

void loop() {
  distanceRightFront = sonarRightFront.ping_in(); //updates the distance according to the right ultrasonic sensor
  distanceLeftFront = sonarLeftFront.ping_in();   //updates the distance according to the left ultrasonic sensor
  distanceMidFront = sonarMidFront.ping_in();
  //distanceSideLeft = sonarSideLeft.ping_in();
  //distanceSideRight = sonarSideLeft.ping_in();
  distanceBack = sonarBack.ping_in();
  
  if((distanceRightFront < 9 && distanceRightFront > 0 || distanceLeftFront < 9 && distanceLeftFront > 0 || distanceMidFront < 18 && distanceMidFront > 0) && input != 'b' && input != 'r' && input != 'l'){    //stops the car if going forward and obstacle detected within a of distance 15cm in front or 9cm slightly to the right or left                                                                                                                                          
    fSpeed = 0; //changes fSpeed to 0
    car.setSpeed(fSpeed); //updates the current speed (i.e. stops the car)    
  }
    else if((distanceBack < 18 && distanceBack > 0) && input == 'b'){  
      fSpeed = 0; //changes fSpeed to 0
      car.setSpeed(fSpeed); //updates the current speed (i.e. stops the car)    
  }
//  else if((distanceSideRight < 10 && distanceSideRight > 0) && input == 'f' && input != 'b' && input != 'l'){  
//    fSpeed = 0; //changes fSpeed to 0
//    car.setSpeed(fSpeed); //updates the current speed (i.e. stops the car)     
//  }
//  else if((distanceSideLeft < 10 && distanceSideLeft > 0) && input == 'f' && input != 'b' && input != 'r'){
//    fSpeed = 0; //changes fSpeed to 0
//    car.setSpeed(fSpeed); //updates the current speed (i.e. stops the car) 
//  }
  else{
    fSpeed = 70;  //always makes sure that the speed is 70 if the if statement above is met
  }
  handleInput();                                                                          
}

void handleInput() { //handle serial input if there is any
  if (Serial3.available()) {
    String input = Serial3.readStringUntil('\n');
    if (input.startsWith("m")) {
      int motorInput = input.substring(1).toInt();
    }else if (input.startsWith("t")){
      int angleInput = input.substring(1).toInt();
    }
    scale();
  }
}
void scale() {
  if (angleInput > 90 && angleInput < 180){
    motorSpeedRight = (angleInput - 90) / 90 * motorInput;
    motors.setMotorSpeed(motorInput, motorSpeedRight);
  }else if (angleInput < 90 && angleInput > 0){
    motorSpeedLeft = angleInput / 90 * motorInput;
    motors.setMotorSpeed(motorSpeedLeft, motorInput);
  }else if (motorInput == 0)
    if(angleInput < 90){
      motorSpeedRight = angleInput / 90 * 100;
      motorSpeedLeft = motorSpeedRight * -1;
      motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);
    }else{
      motorSpeedLeft = angleInput - 90 / 90 * 100;
      motorSpeedRight = motorSpeedLeft * -1;
      motors.setMotorSpeed(motorSpeedLeft, motorSpeedRight);
      }
    }
}
