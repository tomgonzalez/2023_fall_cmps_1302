public class Food extends Good implements Taxable
{
   private int calories;
   
   public Food(String idNumber, double price, int calories)
   {
      super(idNumber, price);
      this.calories = calories;
   } 
   
   public double calculateTax()
   {
      return 0.0;
   }
   
   public String description()
   {
      return String.format("Item %s is a food item with %d calories with " +
         "a price of $%.2f plus $%.2f tax.", idNumber, calories, price, calculateTax());
   }
}