public class Problem37
{
    public static void main(String[] args) 
    {
        int sum = 0; 
        for (int count = 0, n = 10; count < 11; n++) 
        {
            if (isTruncatablePrime(n + "")) 
            {
                sum += n;
                count++;
            }
        }
        System.out.println(sum);
    }

    public static boolean isTruncatablePrime(int n) 
    {
        for (long i = 10; i <= n; i *= 10) 
        {
			if (!isPrime(n % (int)i))
				return false;
        }
        for (; n != 0; n /= 10) 
        {
			if (!isPrime(n))
				return false;
		}
    }

    public static boolean isPrime(long z)
    {
        if (z == 2)
        {
            return true;
        }
        for (int i = 2; i < z; i++)
        {
            if (z%i == 0)
            {
                return false; 
            }
        }
        return true;
    }
}