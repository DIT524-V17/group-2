package com.group02.guard;
/**
 * @author Gabriel Bulai
 * A thread that allows sending the location in the background, once the location is changed.
 * @version 1.0.0 GB
 */

import android.os.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientThread extends Thread {

    String dstAddress;
    int dstPort;
    MapsActivity.ClientHandler handler;
    Socket socket;
    PrintWriter printWriter;
    BufferedReader bufferedReader;
    private boolean running;

    /**
     * Thread's constructor
     *
     * @param addr = Ip Address, port, handler = class used to send debugging messages
     */
    public ClientThread(String addr, int port, MapsActivity.ClientHandler handler) {
        super();
        dstAddress = addr;
        dstPort = port;
        this.handler = handler;
    }

    //method to set the thread to run
    public void setRunning(boolean running) {
        this.running = running;
    }

    //send the message if problems are encountered(still to implement)
    private void sendState(String state) {
        handler.sendMessage(
                Message.obtain(handler,
                        MapsActivity.ClientHandler.UPDATE_STATE, state));
    }

    //send the location to the outputStream
    public void txMsg(String msgToSend) {
        if (printWriter != null) {
            printWriter.println(msgToSend);
        }
    }

    //operations made by the thread while is running.
    @Override
    public void run() {
        //sendState("connecting...");

        running = true;

        try {
            //creates a socket with an Ip address and a port
            socket = new Socket(dstAddress, dstPort);
            // sendState("connected");

            //open an output stream channel with which we send messages TO the server
            OutputStream outputStream = socket.getOutputStream();
            printWriter = new PrintWriter(outputStream, true);

            //open an output stream channel with which we send messages FROM the server
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader =
                    new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            while (running) {

                //bufferedReader block the code
                String line = bufferedReader.readLine();
                if (line != null) {
                    handler.sendMessage(
                            Message.obtain(handler,
                                    MapsActivity.ClientHandler.UPDATE_MSG, line));
                }
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
        //send a message(future debugging purposes
        handler.sendEmptyMessage(MapsActivity.ClientHandler.UPDATE_END);
    }
}
