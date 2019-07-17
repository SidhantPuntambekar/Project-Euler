import java.util.Arrays;

public class Problem52
{
    public static void main(String[] args) 
    {
        int i = 1;
        while (true)
        {
            if(sameDigits(i))
            {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    public static boolean sameDigits(int n)
    {
        char[] ch = Integer.toString(n).toCharArray();
        Arrays.sort(ch);
        for (int i = 2; i <= 6; i++)
        {
            char[] mc = Integer.toString(n * i).toCharArray();
			Arrays.sort(mc);
            if(!new String(ch).equals(new String(mc))) 
            {
				return false;
			}
        }
        return true;
    }
}
