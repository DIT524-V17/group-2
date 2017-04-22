import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static final int port = 8000;
public static void main(String[] args) throws IOException {
    new Server().runServer();
}

    public void runServer() throws IOException{
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server port: " 
                + serverSocket.getLocalPort());
        while(true){
            int count = 0;
            Socket socket = serverSocket.accept();
            count++;
            new ServerThread(socket).start();
            System.out.println("Number of connected clients " + count);
        }
    }
//future implementation of list of clients
//ArrayList<DataOutputStream> clients = new ArrayList<DataOutputStream>();
//DataOutputStream os = new DataOutputStream(clientSocket.getOutputStream());
//clients.add(os);
          
    public class ServerThread extends Thread{
        Socket socket;
        public ServerThread(Socket socket) {
            this.socket = socket;
    }
    public void run(){
        try{
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("/home/administrator/Java/coordinates.txt", false), "UTF-8"));
               
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                writer.write(line);
                writer.append("\n");
            }
            writer.append("finish");
            writer.close();
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    }
}
