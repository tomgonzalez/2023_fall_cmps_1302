public abstract class Good
{
   protected String idNumber;
   protected double price;
  
   public Good(String idNumber, double price)
   {
      this.idNumber = idNumber;
      this.price = price;
   }
   
   public abstract String description();
}