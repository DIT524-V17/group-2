void setup() {
  Serial.begin(9600);  //change if you do not want to use Bluetooth
}

void loop() {
  sendVoltage();                                                                          
}

void sendVoltage() { 
  Serial.println(analogRead(A0), 5); // prints out the voltage measured with 5 decimals (corresponds to resolution (0.00489V (5V/1023))
}

