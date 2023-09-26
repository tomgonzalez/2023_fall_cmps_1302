import java.io.*;

public class TestFile
{
   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
   {
      try(FileInputStream fis = new FileInputStream("processed_payroll.bin");
          ObjectInputStream ois = new ObjectInputStream(fis))
      {
         Employee employee = (Employee)(ois.readObject());
         while(employee != null)
         {
            System.out.println(employee);
            employee = (Employee)(ois.readObject());
         }   
      }
      catch(EOFException e)
      {
         return;
      }    
   }
}