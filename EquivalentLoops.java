
/**
 * MCQ 4.2 test correstions 
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class EquivalentLoops
{
    public static void ForLoops()
    {
        int total = 0;
        for (int k = 0; k <= 100; k += 2)
        {
            total += k;
        }
        //the loop below could be used to replace the above loop so that the original 
        //and the revised code segments store the same value in total
        for (int k = 1; k <= 101; k += 2)
        {
            total += k -1;
        }
    }
}
