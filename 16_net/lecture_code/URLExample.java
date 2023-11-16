import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class URLExample
{
   public static void main(String[] args)
   {
      URL url = null;
      URLConnection connection = null;
      try
      {
         url = new URL("https://www.daltonstate.edu");
         connection = url.openConnection();           
      }
      catch(MalformedURLException e)
      {
         System.out.printf("URL: %s not found.%n", e.getMessage());
         return; 
      }
      catch(IOException e)
      {
         System.out.printf("IOException: %s%n", e.getMessage());
         return;
      }

      String contentType = connection.getContentType();
      
      System.out.printf("Content type:  %s%n", contentType);
         
      if(contentType != null && !contentType.startsWith("text"))
      {
         System.out.println("Content type is not text.");
         return;
      }
      
      try(InputStream inputStream = connection.getInputStream();
          InputStreamReader isr = new InputStreamReader(inputStream);
          BufferedReader br = new BufferedReader(isr))
      {   
         
         String line = br.readLine();       
         while(line != null)
         {
            System.out.println(line);
            line = br.readLine();
         }   
      }
      catch(IOException e)
      {
         System.out.printf("IOException: %s%n", e.getMessage());
         return;
      }
   }
}