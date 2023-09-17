public class Book extends Good implements Taxable
{
   private String author;

   public Book(String idNumber, double price, String author)
   {
      super(idNumber,price);
      this.author = author;
   }
      
   public double calculateTax()
   {
      return 0.06 * price;
   }
   
   public String description()
   {
      return String.format("Item %s is a book written by %s with " +
         "a price of $%.2f plus $%.2f tax.", idNumber, author, price, calculateTax());
   }
}