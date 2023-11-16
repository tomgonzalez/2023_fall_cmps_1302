public class TestPrintNumber
{
   public static void main(String[] args)
   {
      PrintNumber task1 = new PrintNumber(1, 100);
      PrintNumber task2 = new PrintNumber(2, 100);
      PrintNumber task3 = new PrintNumber(3, 100);
      
      Thread thread1 = new Thread(task1);
      Thread thread2 = new Thread(task2);
      Thread thread3 = new Thread(task3);

      thread1.start();
      thread2.start();
      thread3.start();           
   }
}