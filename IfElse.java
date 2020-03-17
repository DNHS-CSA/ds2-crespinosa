
/**
 * MCQ 3.3 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
import java.util.Scanner;
public class IfElse
{
    public static String IfElseStatements()
    {
      //3.3: if-else Statements
      //The following code does not work as intended
      //one can prove this by using temp = 30
      int temp = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the temperature in degrees Fahrenheit?");
      temp = scan.nextInt();
      //System.out.println(temp); 
      String weather;
        if (temp <= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "cool";
        }
        else
        {
            weather = "warm";
        }
        System.out.println(weather);
        return weather;
    }
    
    
}
