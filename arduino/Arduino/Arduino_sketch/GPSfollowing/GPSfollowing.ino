#include <SimpleTimer.h>
#include <Smartcar.h>
#include <NewPing.h>
#include <SoftwareSerial.h>

Gyroscope gyro;
Car car;
ShieldMotors motors;
SimpleTimer timer;


int speed;
int angle;
String input;
String e = "Joacim";

void setup() {
  Serial.begin(9600);
  Serial3.begin(9600);
  gyro.attach();
  car.begin(gyro);
}

void loop() {
  handleInput();
  Serial3.println(e);
}

void stopp(){
  car.setSpeed(0);
  }

void handleInput() { 
  if (Serial.available()) {                        //Handle serial input if there is any
    input = Serial.readStringUntil('\n');
    if(input.startsWith("S")){
      speed = input.substring(1).toInt(); //Sets the motorspeed value for the right engines
      String S = "sets speed: ";
      Serial3.println(S + angle);
      car.setSpeed(speed);   
    }
    if(input.startsWith("A")){
      angle = input.substring(1).toInt(); //Sets the motorspeed value for the right engines
      String A = "sets angle: ";
      Serial3.println(A + angle);
      car.rotate(angle);    
    }
    if(input.startsWith("T")){
      car.setSpeed(0);
      }
  }
}
