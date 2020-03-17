
/**
 * MCQ 4.3 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class MysteryMethod
{
   public static int mystery (String string1, String string2)
   {
       String temp = string1;
       int position = 0;
       int result = 0;
       while (temp.indexOf(string2) >= 0)
       {
           position = temp.indexOf(string2);
           result++;
           temp = temp.substring(position + 1);
       }
       return result;
   }
   //the code below appears in another method but in the same MysteryMethod class
   //as a result, the integer 2 is printed
   public static void applied()
   {
     System.out.println(mystery("Mississippi", "si"));
   }
}
