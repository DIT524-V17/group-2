#include <Smartcar.h>

SR04 ultrasonicSensor;
const int TRIGGER_PIN = 6; //D6
const int ECHO_PIN = 5; //D5

void setup() {
  Serial.begin(9600);
  ultrasonicSensor.attach(TRIGGER_PIN, ECHO_PIN);
}

void loop() {
  Serial.println(ultrasonicSensor.getDistance());
  delay(100);
}
