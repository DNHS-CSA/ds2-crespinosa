
/**
 * MCQ 5.4 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class Help
{
    //the following code does not work as expected because the getH method should have a 
    //return type of int
    private int h;

    public Help(int newH)

    {

        h = newH;

    }

    public double getH()

    {

        return h; //should be int

    }
}
