package com.group02.guard;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by doctorgaby on 24/04/2017.
 */

public class ClientReceiveThread extends Thread {
    private static final String TAG = "received";
    public String otherLine;
    String dstAddress;
    int dstPort;
    Socket socket;
    PrintWriter printWriter;
    BufferedReader bufferedReader;
    private boolean running;

    public ClientReceiveThread(String addr, int port) {
        super();
        dstAddress = addr;
        dstPort = port;
    }

    //method to set the thread to run
    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        //sendState("connecting...");

        running = true;

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

                //bufferedReader block the code


                //String [] otherLined = otherLine.split(" ");
                Log.i(TAG, otherLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
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

