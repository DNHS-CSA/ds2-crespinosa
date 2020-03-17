;
/**
 * MCQ 3.7 test corrections.
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class ComparingObjects
{
    public static void animals()
    {
      //3.7 comparing objects 
      //After executing this code, C is printed 
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
        {
            System.out.print("A");
        }
        else if (second == third)
        {
            System.out.print("B");
        }
        else if (first.equals(second))
        {
            System.out.print("C");
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
    }
}
