public class Square extends Shape implements SidedObject
{
   public Square(double width, double height)
   {
      this.width = width;
      this.height = height;
   }
   
   public double getArea()
   {
      area = width * height;
      return area;
   }
   
   public void displaySides()
   {
      System.out.println("A square has four sides.");
   }  
}