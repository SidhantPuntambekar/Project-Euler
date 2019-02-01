import java.util.Arrays;
public class Problem32
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i < 10000; i++)
        {
            if (PandigitalProducts(i))
                sum += i;
        }
        System.out.println(sum);
    }

    private static boolean PandigitalProducts(int n) 
    {
        for (int i = 1; i <= n; i++) 
        {
			if (n % i == 0 && isPandigital("" + n + i + n/i))
				return true;
		}
		return false;
	}
	
	
    private static boolean isPandigital(String s) 
    {
		if (s.length() != 9)
			return false;
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals("123456789");
	}
}