package com.group02.guard;

import android.os.Message;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author Gabriel Bulai
 * A thread that allows receiving the car location in the background.
 * @version 1.0.0 GB
 */

public class ClientReceiveThread extends Thread {
    private static final String TAG = "received";
    public String otherLine;
    String dstAddress;
    int dstPort;
    Socket socket;
    PrintWriter printWriter;
    BufferedReader bufferedReader;
    Message msg;

    public ClientReceiveThread(String addr, int port) {
        super();
        dstAddress = addr;
        dstPort = port;
    }


    @Override
    public void run() {

        try {
            //creates a socket with an Ip address and a port
            socket = new Socket(dstAddress, dstPort);
            // sendState("connected");


            //open an output stream channel with which we receive messages FROM the server
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader =
                    new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            while ((otherLine = bufferedReader.readLine()) != null) {

                Log.i(TAG, otherLine);
            }
            msg = Message.obtain();
            msg.obj = "Server disconnected";
            MapsActivity.handler.sendMessage(msg);
        } catch (IOException e) {
            e.printStackTrace();
            msg = Message.obtain();
            msg.obj = "Server not connected";
            MapsActivity.handler.sendMessage(msg);
        } finally {
            //close the buffered Reader
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //close the print Writer
            if (printWriter != null) {
                printWriter.close();
            }
            //close the socket
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

