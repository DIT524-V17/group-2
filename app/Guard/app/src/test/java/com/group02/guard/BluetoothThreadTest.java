package com.group02.guard;

import android.os.Handler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.InputStream;
import java.io.OutputStream;


/**
 * Created by jeberlen on 2017-03-06.
 */
public class BluetoothThreadTest {
    //Field socket of type BluetoothSocket - was not mocked since Mockito doesn't mock a Final class
    @Mock
    OutputStream outStream;
    @Mock
    InputStream inStream;
    @Mock
    Handler readHandler;
    @Mock
    Handler writeHandler;
    @InjectMocks
    Thread bluetoothThread;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRun() throws Exception {
        bluetoothThread.run();
    }

    @Test
    public void testCurrentThread() throws Exception {
        Thread result = BluetoothThread.currentThread();
        Assert.assertEquals(new Thread(), result);
    }

    @Test
    public void testYield() throws Exception {
        BluetoothThread.yield();
    }

    @Test
    public void testSleep() throws Exception {
        BluetoothThread.sleep(0L);
    }

    @Test
    public void testSleep2() throws Exception {
        BluetoothThread.sleep(0L, 0);
    }

    @Test
    public void testStart() throws Exception {
        bluetoothThread.start();
    }

    @Test
    public void testStop() throws Exception {
        bluetoothThread.stop();
    }

    @Test
    public void testStop2() throws Exception {
        bluetoothThread.stop(new Throwable());
    }

    @Test
    public void testInterrupt() throws Exception {
        bluetoothThread.interrupt();
    }

    @Test
    public void testInterrupted() throws Exception {
        boolean result = BluetoothThread.interrupted();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testIsInterrupted() throws Exception {
        boolean result = bluetoothThread.isInterrupted();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testDestroy() throws Exception {
        bluetoothThread.destroy();
    }

    @Test
    public void testIsAlive() throws Exception {
        boolean result = bluetoothThread.isAlive();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testSuspend() throws Exception {
        bluetoothThread.suspend();
    }

    @Test
    public void testResume() throws Exception {
        bluetoothThread.resume();
    }

    @Test
    public void testSetPriority() throws Exception {
        bluetoothThread.setPriority(0);
    }

    @Test
    public void testGetPriority() throws Exception {
        int result = bluetoothThread.getPriority();
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSetName() throws Exception {
        bluetoothThread.setName("name");
    }

    @Test
    public void testGetName() throws Exception {
        String result = bluetoothThread.getName();
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    public void testActiveCount() throws Exception {
        int result = BluetoothThread.activeCount();
        Assert.assertEquals(2, result);
    }

    @Test
    public void testEnumerate() throws Exception {
        int result = BluetoothThread.enumerate(new Thread[]{new Thread()});
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCountStackFrames() throws Exception {
        int result = bluetoothThread.countStackFrames();
        Assert.assertEquals(2, result);
    }

    @Test
    public void testJoin() throws Exception {
        bluetoothThread.join(0L);
    }

    @Test
    public void testJoin2() throws Exception {
        bluetoothThread.join(0L, 0);
    }

    @Test
    public void testJoin3() throws Exception {
        bluetoothThread.join();
    }

    @Test
    public void testDumpStack() throws Exception {
        BluetoothThread.dumpStack();
    }

    @Test
    public void testSetDaemon() throws Exception {
        bluetoothThread.setDaemon(true);
    }

    @Test
    public void testIsDaemon() throws Exception {
        boolean result = bluetoothThread.isDaemon();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testCheckAccess() throws Exception {
        bluetoothThread.checkAccess();
    }

    @Test
    public void testToString() throws Exception {
        String result = bluetoothThread.toString();
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    public void testHoldsLock() throws Exception {
        boolean result = BluetoothThread.holdsLock(new Object());
        Assert.assertEquals(true, result);
    }

    @Test
    public void testGetId() throws Exception {
        long result = bluetoothThread.getId();
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testGetState() throws Exception {
        Thread.State result = bluetoothThread.getState();
        Assert.assertEquals(Thread.State.BLOCKED, result);
    }

}
