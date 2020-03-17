
/**
 * MCQ test corrections for 5.6
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class BoolTest
{
    private int one;
    public BoolTest(int newOne)
    {
        one = newOne;
    }
    public int getOne()
    {
        return one;
    }
    public boolean isGreater(BoolTest other)
    {
        //all the following statements execute the isGreater method properly
        return one > other.one;
        //return one > other.getOne();
        //return getOne() > other.one;
    }
    
}
