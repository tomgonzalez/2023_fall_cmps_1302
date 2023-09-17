public class Toy extends Good implements Taxable
{
   private int minimumAge;

   public Toy(String idNumber, double price, int minimumAge)
   {
      super(idNumber,price);
      this.minimumAge = minimumAge;
   }
      
   public double calculateTax()
   {
      return 0.06 * price;
   }
   
   public String description()
   {
      return String.format("Item %s is a toy for ages %d and up with " +
         "a price of $%.2f plus $%.2f tax.", idNumber, minimumAge, price, calculateTax());
   }
}