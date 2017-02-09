# CMake generated Testfile for 
# Source directory: /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test
# Build directory: /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build
# 
# This file includes the relevant testing commands required for 
# testing this directory and lists subdirectories to be tested as well.
add_test(ObstacleAvoider_test "ObstacleAvoider_test")
add_test(SR04_test "SR04_test")
add_test(ManualControl_test "ManualControl_test")
subdirs(arduino_mock)
