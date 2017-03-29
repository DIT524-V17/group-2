###### DIT524 - Group 02
# Testing your code [Android]
## How we do it?
We are doing UI-testing with espresso, and unit-testing with JUnit4.

### Espresso
    Espresso is included in Android studio by default.
To test your code you need to go to Run -> Record Espresso Test, afterwards you just select your emulated device (if possible do not choose your physical device, to keep safe). When your activity has started you can just use it and try all of your functionalities, if you want to add an element of randomness you can use the Monkey that sends your application psuedo-random events. 

    Bash/PowerShell(not tested)
    Go to your terminal any workspace is fine.
    Write:
    adb shell monkey -p com.group02.guard -v 500
    This will give you 500 psuedo-random events, alot of them will not berecorded by Espresso. 

### JUnit4
JUnit4 will be the standard we use for testing, you can use the log from the Monkey to see some edge cases but this is something we will have to learn to write, hopefully soon we will have implemented a fully automated JUnit test case generator. 
