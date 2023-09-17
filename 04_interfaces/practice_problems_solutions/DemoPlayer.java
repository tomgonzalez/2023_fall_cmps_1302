public class DemoPlayer
{
   public static void main(String[] args)
   {
      Child child = new Child();
      child.play();
      
      Musician musician = new Musician();
      musician.play();
      
      Actor actor = new Actor();
      actor.play();
   }
}