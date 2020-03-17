
/**
 * MCQ 4.4 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class MissingHeader
{
    public static void InnerForLoop()
   {
       for (int k = 0; k < 4; k++)
       {
         //the proper loop header that should go here is as follows
         for (int h = k; h >= 0; h--)
         {
             System.out.print(k);
         }
         System.out.println();
       }
   }
}
