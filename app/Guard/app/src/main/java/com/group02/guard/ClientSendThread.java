package com.group02.guard;
/**
 * @author Gabriel Bulai
 * A thread that allows sending the location in the background, once the location is changed.
 * @version 1.0.0 GB
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientSendThread extends Thread {

    String dstAddress;
    int dstPort;
    Socket socket;
    PrintWriter printWriter;
    BufferedReader bufferedReader;
    private boolean running;

    /**
     * Thread's constructor
     *
     * @param addr = Ip Address, port, handler = class used to send debugging messages
     */
    public ClientSendThread(String addr, int port) {
        super();
        dstAddress = addr;
        dstPort = port;
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
            //creates a socket with an Ip serverAddress and a port
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
