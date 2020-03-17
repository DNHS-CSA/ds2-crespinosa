
/**
 * MCQ 4.1 test corrections 
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class WhileLoop
{
    public static void loops()
    {
        int a = 1;
        String result = "";
        while (a<20)
        {
            result += a;
            a += 5;
        }
        System.out.println(result);
    }
}
