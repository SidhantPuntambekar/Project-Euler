public class Problem10
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

    public static void main(String[] args)
    {
        int sum = 0;  
        for (int i = 3; i < 2000000; i+=2)
        {
            sum += i;
        }
        if (isPrime(sum))
        {
            System.out.println(sum);
        }
    }
}