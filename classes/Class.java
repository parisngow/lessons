import com.sun.org.apache.xpath.internal.SourceTree;

/* syntax for creating classes
   'public' to be declared in a file named Person.java (therefore, don't aDD IF CREATING ANOTHER CLASS IN FILE)
        -classes should be declared in separate file
        -Bc it is declared in this file, class 'Person' cannot be called anywhere else but this file
 */
class Person {
    // "fields"
    String firstName;
    String lastName;
    int age;
}


public class Class {
    public static void main(String[] args)
    {
        String[] person1 = {"Ophelia", "Ailehpo", "18"};
        /*syntax for declaring object 'person', creating an instance of a class
          creates 'blank slate', nothing assigned to the attributes/'fields' yet, assigns to variable 'person2'
          can create multiple 'people' by assigning variables new Person();
         */
        Person person2 = new Person();
        person2.firstName = "John";
        person2.lastName = "Smith";
        person2.age = 30;

        Person person3 = new Person();
        person3.firstName = "Calum";
        person3.lastName = "Hood";
        person3.age = 22;


        System.out.println("name: " + person1[0] + " " + person1[1]);
        System.out.println("age: " + person1[2]);

        //call & print out fields from object
        System.out.println("name: " + person2.firstName + " " + person2.lastName);
        System.out.println("age: " + person2.age);

        System.out.println("name: " + person3.firstName + " " + person3.lastName);
        System.out.println("age: " + person3.age);
    }
}

/* NOTES-
   objects hold information for a specific 'thing' (attributes, methods etc.)
    (better than an array bc they're subject to one data type, not very effective for holding info in the long run)
   ex. humans = class, general information, have 'universal' attributes (name, age, height etc.)
       individual human = object, focused on individual, have specific attributes (Jerry, 30, 5'8 etc.)
   should not define class within another class.
   able to store objects within arrays
 */

