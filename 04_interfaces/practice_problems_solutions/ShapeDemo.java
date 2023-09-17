public class ShapeDemo
{
   public static void main(String[] args)
   {
     /* Array type must be Shape in order to store both Triangle
        and Rectangle objects. */
      Shape[] shapes = { new Square(3.2, 5.6),
         new Triangle(9.2, 0.78),
         new Square(0.3, 6.89),
         new Triangle(123.8, 99.2)};
      
      for(Shape shape : shapes)
      {
         System.out.printf("The area is %.2f.%n", shape.getArea());
         
         /* shape.displaySides(); will not work so each object will
            have to be recast from Shape to either Triangle or Rectangle */
         if(shape instanceof Triangle)
         {
            ((Triangle)shape).displaySides();
         }
         else
         {
            ((Square)shape).displaySides();
         }           
      }   
   }
}