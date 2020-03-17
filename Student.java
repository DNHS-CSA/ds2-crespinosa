
/**
 * MCQ 5.8 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class Student
{
    private String firstName;

    private String lastName;

    private int age;

    public Student(String firstName, String lastName, int age)

    {

        firstName = firstName;

        lastName = lastName;

        age = age;

    }

    public String toString()

    {

        return firstName + " " + lastName;

    }
    
    public static void newStudent()
    {
        //The code segment will compile, but the instance variables will not be 
        //initialized correctly because the variable names firstName, 
        //lastName, and age refer to the local variables inside the constructor.
        Student s = new Student("Priya", "Banerjee", -1);

        System.out.println(s);
    }
        
}
