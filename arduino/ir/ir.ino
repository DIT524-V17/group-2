#include <Smartcar.h>

//for distances between 12 and 78 centimeters
GP2Y0A21 sideFrontIR;
const int SIDE_FRONT_PIN = A0; //use analog pins only

void setup() {
  Serial.begin(9600);
  sideFrontIR.attach(SIDE_FRONT_PIN);
}

void loop() {
  Serial.println(sideFrontIR.getDistance());
  delay(100);
}

