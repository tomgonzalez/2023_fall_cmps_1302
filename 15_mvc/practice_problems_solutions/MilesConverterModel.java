import java.util.ArrayList;

public class MilesConverterModel
{
   private double miles;
   private double feet;
   private ArrayList<String> calculations;
   
   public MilesConverterModel()
   {
      calculations = new ArrayList<>();
   }
   
   public void setMiles(double miles)
   {
      this.miles = miles;
      this.feet = 5280 * this.miles;
      calculations.add(0, String.format("There are %,.2f feet in %,.2f miles.", this.feet, this.miles));
   }
   
   @Override
   public String toString()
   {
      String out = "";
      for(String string : calculations)
      {
         out += string + "\n";
      }
      return out;
   }
}