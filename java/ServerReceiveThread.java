import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
//this class receives and prints in a file the coordinates of the phone
public class ServerReceiveThread extends Thread{
        Socket socket;
        public ServerReceiveThread(Socket socket) {
            this.socket = socket;
    }
    public void run(){
        try{
            InputStream inputStream = socket.getInputStream();
            //create an output printer to send back the coordinates to the phone
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
           
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            String phoneStringCoords;
            while((phoneStringCoords = bufferedReader.readLine()) != null){
            	Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("/home/pi/repo/group-2/GPSfollowing/coords_phone.txt"), "UTF-8"));
                System.out.println(phoneStringCoords);
                phoneStringCoords.equals(bufferedReader.readLine());
                //
                writer.write(phoneStringCoords);
                writer.close();
            }
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    }