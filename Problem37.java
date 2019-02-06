public class Problem37
{
    public static void main(String[] args) 
    {
        long sum = 0;
        for (int i = 0; i < 100000; i++)
        {
            if (isTruncatablePrime(i))
                sum += i;
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
        return true;    
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