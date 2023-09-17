public class TestMeasurable
{
   public static void main(String[] args)
   {
      BankAccount bankAccount = new BankAccount(232383.22);
      System.out.printf("$%,.2f%n", bankAccount.getMeasure());
      
      Circle circle = new Circle(5.3);
      System.out.printf("%.2f%n", circle.getMeasure());
      
      Numbers numbers = new Numbers(new int[]{5, -4, 19});
      System.out.printf("%.2f%n", numbers.getMeasure());
   }
}