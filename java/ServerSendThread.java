import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class ServerSendThread extends Thread{
        Socket socket;
        public ServerSendThread(Socket socket) {
            this.socket = socket;
    }
    public void run(){
    	String carStringCoords = null;
        BufferedReader inputCoords = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        OutputStream os = null;
        boolean running = true;
        try{
        	//DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            //PrintWriter Output = new PrintWriter(socket.getOutputStream(), true);
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
          //read car coordinates from file
                        
            while(running){
                inputCoords =  new BufferedReader(new FileReader("/home/pi/repo/group-2/GPSfollowing/coords_smartcar.txt"));
                carStringCoords = inputCoords.readLine();
                System.out.println(carStringCoords);
                bw.write(carStringCoords + "\n");
                bw.flush();
                Thread.sleep(3000);
                continue;
                //send now the coordinates that we read line by line to the phone
            }
             bw.close();
             inputCoords.close();
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}