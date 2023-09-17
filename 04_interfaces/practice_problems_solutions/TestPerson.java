import java.util.Arrays;

public class TestPerson
{
   public static void main(String[] args)
   {
      Person[] people = {new Person("Alice", 51),
         new Person("Bob", 17),
         new Person("Bevilacqua",17),
         new Person("Gunter", 32),
         new Person("Xavier", 22),
         new Person("Guardiola", 32),
         new Person("Bobert", 17),
         new Person("Enrico Pollazo",17),
         new Person("Greg", 32),
         new Person("Pep", 2),
         new Person("Diane", 32)};

      System.out.println(Arrays.toString(people));
      
      Arrays.sort(people);
      
      System.out.println(Arrays.toString(people));                  
   }
}