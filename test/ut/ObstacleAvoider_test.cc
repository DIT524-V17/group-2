#include "gtest/gtest.h"
#include "gmock/gmock.h"
#include "arduino-mock/Serial.h"
#include "Smartcar.h" // The Smartcar library mocks


#include "../../src/obstacleAvoider.ino" // Our production code

using ::testing::_; // Needed to use the "anything matcher"
using ::testing::Return;

class SmartcarObstacleAvoiderFixture : public ::testing::Test
{
   public:
     CarMock* carMock;
     GyroscopeMock* gyroscopeMock;
     SR04Mock* SR04_mock;
     SerialMock* serialMock;
    // Run this before the tests
    virtual void SetUp()
    {
      carMock = carMockInstance();
      gyroscopeMock = gyroscopeMockInstance();
      SR04_mock = SR04MockInstance();
      serialMock = serialMockInstance();
    }
    // Run this after the tests
    virtual void TearDown()
    {
      releaseCarMock();
      releaseGyroscopeMock();
      releaseSR04Mock();
      releaseSerialMock();
    }
};

//-Check that handlesInput(check) works, see ManualControl_test.cc

//-Check that the sensors are attached attached (check)
TEST_F(SmartcarObstacleAvoiderFixture, initsAreCalled) {
    EXPECT_CALL(*carMock, begin());
    EXPECT_CALL(*gyroscopeMock, attach());
    EXPECT_CALL(*gyroscopeMock, begin(_));
    EXPECT_CALL(*SR04_mock, attach(_, _));
    EXPECT_CALL(*serialMock, begin(_));
    setup();
}
//-Check that the car stops when obstacles <15 cm in front when driving forward (check)
TEST_F(SmartcarObstacleAvoiderFixture, obstacleDetected_stop) {
  EXPECT_CALL(*SR04_mock, getDistance())
  .WillOnce(Return(5));
  EXPECT_CALL(*carMock, setSpeed(0));
  loop();
}

//-check that you can turn despite having an objected detected (check)
TEST_F(SmartcarObstacleAvoiderFixture, obstacleDetected_rotate) {
  EXPECT_CALL(*SR04_mock, getDistance())
      .WillOnce(Return(5));
  EXPECT_CALL(*serialMock, available())
      .WillOnce(Return(1));
  EXPECT_CALL(*serialMock, read())
      .WillOnce(Return('r'));
  EXPECT_CALL(*carMock, setAngle(75));
  loop();
}
//-check that you can reverse despite having an objected detected (check)
TEST_F(SmartcarObstacleAvoiderFixture, obstacleDetected_reverse) {
  EXPECT_CALL(*SR04_mock, getDistance())
      .WillOnce(Return(5));
  EXPECT_CALL(*serialMock, available())
      .WillOnce(Return(1));
  EXPECT_CALL(*serialMock, read())
      .WillOnce(Return('b'));
  EXPECT_CALL(*carMock, setSpeed(-70));
  loop();
}
//-Check that the ultrasonic returns values correctly (check)
/*TEST_F(SmartcarObstacleAvoiderFixture, testSR04_signal) {
  EXPECT_CALL(*SR04_mock, getMedianDistance(5));
  loop();
}
*/


int main(int argc, char* argv[]) {
    ::testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}
