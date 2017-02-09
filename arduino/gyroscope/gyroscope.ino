#include <Smartcar.h>

Gyroscope gyro(10); // use your calibrated offset instead of 10

void setup() {
  Serial.begin(9600);
  gyro.attach();
  gyro.begin();
}

void loop() {
  gyro.update();
  Serial.println(gyro.getAngularDisplacement());
}

