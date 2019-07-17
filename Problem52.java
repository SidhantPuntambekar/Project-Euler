import java.util.Arrays;

public class Problem52
{
    public static void main(String[] args) 
    {
        
    }

    public static boolean sameDigits(int n)
    {
        char[] ch = Integer.toString(n).toCharArray();
        Arrays.sort(ch);
    }
}
