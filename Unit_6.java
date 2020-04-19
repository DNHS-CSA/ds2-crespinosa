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
        System.out.println("\n\n"+Arrays.toString(arr));
        
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
        System.out.println(Arrays.toString(ar));
        
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
        System.out.print(+total+"\n");
        
        /** Question 8 */
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        //the below for loop produces the same output as the for loop above
        for (int x : numbers)
        {
            System.out.println(x);
        }
        
        /** Question 10 */
        /*The code below will cause an ArrayIndexOutOfBounds Exception
         * int[] arr = {1, 2, 3, 4, 5};
         * for (int x = 0; x < arr.length; x++)
         * {
         *     System.out.print(arr[x + 3]);
         *  }
         * The uncommented code segemnt below will print 45678 
         */
        int[] b = {1, 2, 3, 4, 5};
        for (int x : b)
        {
            System.out.print(x + 3);
        }
        
        /** Question 11 */
        boolean duplicates = false;
        int[] c = {5,5,6};
        for (int x = 0; x < c.length - 1; x++)
        {
            for (int y = x + 1; y < c.length; y++)
            {
                if (c[x] == c[y])
                {
                    duplicates = true;
                    System.out.println("\n"+true);
                }
            }
        }
        
        /** Question 12 */
        int [] numArr = {1, 3, 5, 7, 9};
        for (int k = 0; k < numArr.length / 2; k++)
        {
            int temp = numArr[k];
            numArr[k] = numArr[numArr.length - k - 1];
            numArr[numArr.length - k - 1] = temp;
        }   
            System.out.println(Arrays.toString(numArr));
            
        /** Question 13 */
        int[] values = {0, 2};
        int maximum = values[0];
        for (int k = 1; k < values.length; k++)
        {
            if (values[k] > maximum)
            {
                maximum = values[k];
            }
        }
            System.out.println(maximum);
    }
}

