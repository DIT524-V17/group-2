import java.io.IOException;
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
            new ServerReceiveThread(socket).start();
            new ServerSendThread(socket).start();
            System.out.println("Number of connected clients " + count);
        }
    }

//ArrayList<DataOutputStream> clients = new ArrayList<DataOutputStream>();
//DataOutputStream os = new DataOutputStream(clientSocket.getOutputStream());
//clients.add(os);
          
}