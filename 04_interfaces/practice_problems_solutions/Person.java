public class Person implements Comparable<Person>
{
   private String name;
   private int age;
   
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   public int compareTo(Person p)
   {
      if(age == p.getAge())
      {
         return name.compareTo(p.getName());
      }
      else
      {
         return age - p.getAge();
      }   
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   @Override
   public String toString()
   {
      return String.format("Name: %s  Age: %d", name, age);
   }
}