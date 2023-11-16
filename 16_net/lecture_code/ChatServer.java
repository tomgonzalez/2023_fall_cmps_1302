import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;

public class ChatServer
{         
   public static void main(String[] args)
   {
      int port = 4444;
      System.out.printf("Binding to port %d ...", port);
      try(ServerSocket server = new ServerSocket(port);
          Socket socket = server.accept();
          DataInputStream stream = new DataInputStream(new BufferedInputStream(socket.getInputStream())))
      {
         System.out.println("Server started: " + server);
         System.out.println("Waiting for a client ...");
         String line = "";
         while(!line.equals("bye"))
         {
            line = stream.readUTF();
            System.out.println(line);
         }
      }
      catch(IOException e)
      {
         System.out.printf("IOException:  %s%n", e.getMessage());       
         return;
      }   
   }
}