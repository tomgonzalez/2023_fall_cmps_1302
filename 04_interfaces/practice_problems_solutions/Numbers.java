public class Numbers implements Measurable
{
   private int[] numbers;
   
   public Numbers(int[] numbers)
   {
      this.numbers = numbers;
   }
   
   public double getMeasure()
   {
      if(numbers != null && numbers.length > 0)
      {
         int sum = 0;
         for(int number : numbers)
         {
            sum += number;
         }
      
         return sum / (double)numbers.length;
      }
      else
      {
         return 0.0;
      }   
   }
}