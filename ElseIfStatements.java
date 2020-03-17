
/**
 * MCQ 3.4 test corrections
 *
 * @Chrsitina Espinosa
 * @03/16/2020
 */
public class ElseIfStatements
{
    public static void Compare()
    {
      //3.4: else if Statements
      //Both the following code segments produce the same values for x and y
      //Segemnt 1
      int x = 0;
      int y = 0;
      int result = 0;
        if (x>y)
        {
            result = x - y;
            System.out.print(result);
        }
        else if (x<y)
        {
            result = y - x;
            System.out.print(result);
        }
        else
        {
            System.out.print(result);
        }
      //Segment 2
        if (x<y)
        {
            System.out.print(y-x);
        }
        else
        {
            System.out.print(x-y);
        }
    }
}
