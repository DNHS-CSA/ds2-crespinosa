
/**
 * MCQ 3.6 test corresctions
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class BooleanExpressions
{
    public static boolean DeMorgansLaw ()
    {
        int j = 0;
        int k = 1;
        int m = 2;
        if (!((j == k) && (k > m)))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        if ((j != k) || (k <= m))
        {
           System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
      return true;
    }
}
