void setup() {
  Serial.begin(9600);  //change if you do not want to use Bluetooth
}

void loop() {
  sendVoltage();                                                                          
}

void sendVoltage() {
  float sensorValue = analogRead(A0); // reads input from analog pin 0
  float voltage = sensorValue * (5.0 / 1023.0); // Converts the analog reading to voltage
  voltage *= 5; //Restores the actual voltage measured (divided by 5 from the voltage divider before entiring the Arduino) 
  Serial.println(voltage, 5); // prints out the voltage measured with 5 decimals (corresponds to resolution (0.00489V (5V/1023))
}

