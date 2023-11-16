public class PrintNumber implements Runnable
{
   private int number;
   private int times;
   
   public PrintNumber(int number, int times)
   {
      this.number = number;
      this.times = times;
   }
   
   public void run()
   {
      for(int i = 0; i < times; i++)
      {
         System.out.print(number);
      }
   }
}