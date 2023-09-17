public class Circle implements Measurable
{
   private double radius;
   
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   public double getMeasure()
   {
      return Math.PI * Math.pow(radius, 2.0);
   }
}