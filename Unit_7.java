import java.util.ArrayList;
/**
 * Unit 7 MCQ from AP Classroom corrections
 *
 * @Christina Espinosa
 * @04/19/20
 */
public class Unit_7
{
    public static void main (String[] args)
    {
       /** Question 2 */
       //two ways to create an ArrayList that can store Integer values 
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       ArrayList<Integer> nums = new ArrayList();
       
       /** Question 6 */
       //[4, 2, 0] is printed as a result of the following code
       ArrayList<Integer> vals = new ArrayList<Integer>();
       vals.add(vals.size(), vals.size());
       vals.add(vals.size() - 1, vals.size() + 1);
       vals.add(vals.size() - 2, vals.size() + 2);
       System.out.println(vals.toString());
    }
}
