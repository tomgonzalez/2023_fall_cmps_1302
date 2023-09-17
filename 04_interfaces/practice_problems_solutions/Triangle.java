public class Triangle extends Shape implements SidedObject
{
   public Triangle(double width, double height)
   {
      this.width = width;
      this.height = height;
   }
   
   public double getArea()
   {
      area = width * height / 2.0;
      return area;
   }
   
   public void displaySides()
   {
      System.out.println("A triangle has three sides.");
   }
}