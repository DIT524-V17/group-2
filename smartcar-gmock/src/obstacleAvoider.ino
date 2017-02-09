#include <Smartcar.h>

#define TRIGGER_PIN  41  // Arduino pin tied to trigger pin on the ultrasonic sensor
#define ECHO_PIN     40  // Arduino pin tied to echo pin on the ultrasonic sensor
#define MA
#define MAX_DISTANCE 200 // Maximum distance we want to ping for (in centimeters)

SR04 sonar;
Car car;
Gyroscope gyro;

void handleInput();

int fSpeed = 70;          //70% of the full speed forward
const int bSpeed = -70;   //70% of the full speed backward
const int lDegrees = -75; //degrees to turn left
const int rDegrees = 75;  //degrees to turn right
char input;               //input char from Bluetooth
int distance = 0;         //distance to obstacle

void setup() {
  Serial.begin(9600);  //change if you do not want to use Bluetooth
  sonar.attach(TRIGGER_PIN, ECHO_PIN);
  gyro.attach();
  gyro.begin();
  car.begin(); //initialize the car using the encoders and the gyro
}

void loop() {
  distance = sonar.getDistance();                                                             //updates the distance according to the ultrasonic sensor
  if((distance < 16 && distance > 0) && input != 'b' && input != 'l' && input != 'r'){    //stops the car if going forward and obstacle detected within a of distance 15 cm
    fSpeed = 0;                                                                           //changes fSpeed to 0
    car.setSpeed(fSpeed);                                                                 //updates the current speed (i.e. stops the car)
  }else{
    fSpeed = 70;                                                                          //changes the speed back
  }
  handleInput();
}

void handleInput() { //handle serial input if there is any
  if (Serial.available()) {
    input = Serial.read(); //read everything that has been received so far and log down the last entry
    switch (input) {
      case 'l': //rotate counter-clockwise going forward
        car.setSpeed(fSpeed);
        car.setAngle(lDegrees);
        break;
      case 'r': //turn clock-wise
        car.setSpeed(fSpeed);
        car.setAngle(rDegrees);
        break;
      case 'f': //go ahead
        car.setSpeed(fSpeed);
        car.setAngle(0);
        break;
      case 'b': //go back
        car.setSpeed(bSpeed);
        car.setAngle(0);
        break;
      default: //if you receive something that you don't know, just stop
        car.setSpeed(0);
        car.setAngle(0);
    }
  }
}
