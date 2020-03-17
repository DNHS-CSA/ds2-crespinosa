
/**
 * MCQ 5.3 test corrections
 *
 * @Christina Espinosa
 * @03/16/2020
 */
public class SubstringFound
{
    public boolean substringFound(String phrase, String key, int index)
    {
        //precondition to be used: 0 <= index < phrase.length() - key.length();
        String part = phrase.substring(index, index + key.length());
        return part.equals(key);
    }
}
