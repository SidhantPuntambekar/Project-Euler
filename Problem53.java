import java.math.BigInteger;

public class Problem53
{
    public static void main(String[] args) 
    {
        int count = 0;
        for (int i = 1; i <= 100; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                BigInteger f = factorial(i, j + 1).divide(factorial(i - j, 2));
                if(f.compareTo(new BigInteger("1000000")) > 0) 
                {
					count++;
				}
            }
        }
        System.out.println(count);
    }

    public static BigInteger factorial(int n, int r)
    {
        BigInteger factorial = BigInteger.ONE;
        for(int i = r; i <= n; i++) 
        {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
    }
}