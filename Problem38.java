import java.util.Arrays;
public class Problem38
{
    public static void main(String[] args) 
    {
        int max = -1; 
        String concatenated = "";
        for (int i = 2; i <= 9; i++)
        {
            for (int j = 1; j < Math.pow(10, 9/i); j++)
            {
                concatenated = "";
                for (int k = 1; k <= i; k++)
                {
                    concatenated += i * j;
                }
                if (isPandigital(concatenated))
                {
                    max = Math.max(Integer.parseInt(concatenated), max);
                }
            }
        }
        System.out.println(concatenated);
    }

    public static boolean isPandigital(String x) 
    {
		if (x.length() != 9)
			return false;
		char[] temp = x.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals("123456789");
	}
}