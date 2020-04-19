import java.util.Arrays;
/**
 * MCQ corrections for Unit 6 of AP Classroom.
 *
 * @Christina Espinosa
 * @04/16/20
 */
public class Unit_6
{
    /**
     * Corrections for unit 6 question 2.
     */
    public static int[] transform(int[] a)
    {
        a[0]++;
        a[2]++;
        return a;
    }
    
    /**
     * Corrections for unit 6 question 3.
     */
    public static int checkString(String[] arr)
    {
        int count = 0;
        for (int k = 0; k < arr.length; k++)
        {
            if (arr[k].length() >= 3)
            {
                count++;
            }
        }
        return count;
    }
    
    public static void main (String[] args)
    {
        /** Question 2 */
        int[] arr = {0,0,0,0}; 
        //int [] arr = new int[4]; Both lines can be used to declare array
        arr = transform(arr);
        System.out.println("\nQuestion 2: "+Arrays.toString(arr));
        
        /** Question 3 */
        //both code segments compile without error
        //code segment 1
        checkString(new String[0]);
        //code segment 2
        String[] str = {"cat","dog"};
            checkString(str);
             
        /** Question 4 */
        int[] ar = {10, 20, 30, 40, 50};

        for(int x = 1; x < ar.length - 1; x++)
        {
            ar[x + 1] = ar[x] + ar[x + 1];
        }
        System.out.println("Question 4: "+Arrays.toString(ar));
        
        /** Question 5 */
        int[] a = {4, 3, 2, 1, 0};
        int total = 0;
        for (int k = 0; k <= total; k++)
        {
            if (a[k] % 2 == 0)
            {
                total += a[k];
            }
            else            
            {
                total -= a[k];
            }
        }
        System.out.print("Question 5: "+total);
    }
}

