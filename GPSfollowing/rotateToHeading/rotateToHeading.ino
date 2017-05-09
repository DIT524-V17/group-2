#include <Smartcar.h>
#include <Wire.h>
#include <LSM303.h>

LSM303 compass;
Car car;

float heading = 0;
float tempHeading = 0;
int turn = 0;
String input = "";
boolean stopCar = false;
String s = "s";

void setup() {
  car.begin();
  Serial.begin(9600);
  Serial3.begin(9600);
  Wire.begin();
  compass.init();
  compass.enableDefault();
  
  /*
  Calibration values; the default values of +/-32767 for each axis
  lead to an assumed magnetometer bias of 0. Use the Calibrate example
  program to determine appropriate values for your particular unit.
  */
  compass.m_min = (LSM303::vector<int16_t>){-32767, -32767, -32767};
  compass.m_max = (LSM303::vector<int16_t>){+32767, +32767, +32767};

  delay(1000);
  //rotateOnSpot(90); //rotate clockwise 90 degrees on spot
  //car.setMotorSpeed(motorSpeed, motorSpeed);
  delay(1000);
  //rotateOnSpot(270); //rotate counter clockwise 90 degrees on spot
}

void loop() {
  handleInput();
}

float getHeading(){
  compass.read();
  float heading = compass.heading((LSM303::vector<int>){0, 0, 1});
  Serial.print("Heading: "); Serial.println(heading);
  Serial3.print("Heading: "); Serial3.println(heading);
  return heading;
}

void rotateOnSpot(int targetDegrees) {
  heading = getHeading();
  tempHeading = heading; //used to calculate what way to turn for shortest angle
  
  if(tempHeading < targetDegrees){
    tempHeading += 360;
  }
  
  turn = tempHeading - targetDegrees;
  
  if (turn < 180) {
    car.setMotorSpeed(-45, 70); // left motors spin backward, right motors spin forward
  } else { //rotate counter clockwise
    car.setMotorSpeed(70, -45); // left motors spin forward, right motors spin backward
  }
  
  while (!(heading < (targetDegrees + 1) && heading > (targetDegrees - 1)) && stopCar) {
    handleInput();
    heading = getHeading();
  }
  Serial.print("Stopped on heading: "); Serial.println(heading);
  Serial3.print("Stopped on heading: "); Serial3.println(heading);
  car.stop(); //we have reached the target, so stop the car
}

void handleInput() { 
  if (Serial3.available()) { //handle serial input if there is any
    input = Serial3.readStringUntil(" ");
    if (input == s){
      Serial3.print("Stops");
      stopCar = false;
      //car.stop();
    }
    else{
      Serial3.print("rotates to " + input);
      stopCar = true;
      rotateOnSpot(input.toInt());
    }
  }
}
