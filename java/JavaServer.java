import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServer {

    public static void main(String[] args) {
        System.out.println("Server start");
        System.out.println("Runtime Java: " 
                + System.getProperty("java.runtime.version"));
        
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        //run the python code to get the coordinates

        //ProcessBuilder pb = new ProcessBuilder("python", "getCoordinatesSmartCar.py.py");
        //Process process = Runtime.getRuntime().exec("../Python/python getCoordinatesSmartCar.py");

        try {
            serverSocket = new ServerSocket(8000);
            System.out.println("Server port: " 
                    + serverSocket.getLocalPort());
            
            clientSocket = serverSocket.accept();
            
            //Client connected
            InputStream inputStream = clientSocket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            
            OutputStream outputStream = clientSocket.getOutputStream();
            printWriter = new PrintWriter(outputStream, true);

            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                printWriter.println(line);  //echo back to sender
            };
            
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }finally{
            
            if(printWriter != null){
                printWriter.close();
                System.out.println("printWriter closed");
            }
            
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                    System.out.println("bufferedReader closed");
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
            
            if(clientSocket != null){
                try {
                    clientSocket.close();
                    System.out.println("clientSocket closed");
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
            
            if(serverSocket != null){
                try {
                    serverSocket.close();
                    System.out.println("serverSocket closed");
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
            
        }
        
    }
    
}