
/**
 * MCQ 2.9 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class MathClass
{
    public static void UsingTheMathClass()
    {
      //2.9: Using the Math Class
      //By implementing (int) (Math.random()*4+1), the following code works as intended
      
      int val = (int) (Math.random()*4+1);
      val *= 2;
      System.out.println(val);
    }
}
