


void setup() {
  Serial3.begin(9600);  //change if you do not want to use Bluetooth
  Serial.begin(9600);
}

void loop() {
  handleInput();                                                                          
}

void handleInput() { //handle serial input if there is any
  if (Serial3.available()) {
    Serial.print(Serial3.read()); //read everything that has been received so far and log down the last entry
    
  }
}
