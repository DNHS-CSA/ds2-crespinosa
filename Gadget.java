
/**
 * MCQ 5.7 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class Gadget
{
    private static int status = 0;

    public Gadget()

    {

        status = 10;

    }

    public static void setStatus(int s)

    {

        status = s;
    
    }
    
    public static void NewGadget()
    {
        //The code segment creates two Gadget objects a and b. 
        //The class Gadget’s static variable status is set to 10, then to 3, 
        //and then back to 10.
        Gadget a = new Gadget();

        Gadget.setStatus(3);

        Gadget b = new Gadget();
    }
}
