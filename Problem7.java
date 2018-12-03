public class Problem7
{
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

    public static void main (String[] args)
    {
        int count = 0;
        for (int i = 2; i <=100000000; i++)
        {
            if (isPrime(i))
            {
                count++;
            }
            if (count == 10001)
            {
                System.out.println(i);
                break;
            }
        }
    }
}