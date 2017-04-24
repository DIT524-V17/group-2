###### DIT524 - Group 02
# Testing your code [Android]
## How we do it?
We are doing UI-testing with espresso. Root analysis will be conducted on errors and failures.

### Espresso
    Espresso is included in Android studio by default.
To test your code you need to go to Run -> Record Espresso Test, afterwards you just select your emulated device (if possible do not choose your physical device, to keep safe). When your activity has started you can just use it and try all of your functionalities, if you want to add an element of randomness you can use the Monkey that sends your application psuedo-random events. 

    Bash/PowerShell
    Go to your terminal (any workspace is fine).
    Write:
    adb shell monkey -p com.group02.guard -v 100
    This will give you 100 psuedo-random events. 
    Also make sure to read the tests created, and write your own. 

### JUnit4
JUnit4 will be the standard we use for testing, just write these tests for critical methods, we should not put to much time into this.  

### Instrumented tests
To analyse hardware quality, instrumented unit tests shall be carried out.
For each major update of hardware functionality, the requirements is based on manufacturers specifications. 
#### Where to store data from the tests?
In Documentation/Instrumented Test. 


