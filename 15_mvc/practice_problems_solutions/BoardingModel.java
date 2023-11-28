public class BoardingModel
{
   private int days;
   private double weight;
   private double cost;
   
   public BoardingModel(int days, double weight, double cost)
   {
      this.days = days;
      this.weight = weight;
      this.cost = cost;
   }
   
   public void setDays(int days)
   {
      this.days = days;
   }
   
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   public void setCost(double cost)
   {
      this.cost = cost;
   }
}