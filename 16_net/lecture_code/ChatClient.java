import java.net.Socket;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.UnknownHostException;

public class ChatClient
{  
   public static void main(String[] args)
   {
      String serverAddress = "127.0.0.1";
      int serverPort = 4444;
      System.out.println("Establishing connection ...");
      try(Socket socket = new Socket(serverAddress, serverPort);
          BufferedReader streamIn = new BufferedReader(new InputStreamReader(System.in));
          DataOutputStream streamOut = new DataOutputStream(socket.getOutputStream()))
      {
         System.out.printf("Connected:  %s%n", socket.toString());
         String line = "";
         while(!line.equals("bye"))
         {
            line = streamIn.readLine();
            streamOut.writeUTF(line);
            streamOut.flush();
         }
      } 
      catch(UnknownHostException e)
      {
         System.out.printf("Unknown Host:  %s%n", e.getMessage());
         return;
      }
      catch(IOException e)
      {
         System.out.printf("IOException:  %s%n", e.getMessage());      
         return;
      }         
   }   
}