public class Problem35
{
    public static void main(String[] args) 
    {
        int count = 0; 
        for (long i = 0; i < 10000000; i++)
        {
            if (isCircularPrime(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isCircularPrime(long y)
    {   
        String possibleCircularPrime = Long.toString(y);
        for (int i = 0; i < possibleCircularPrime.length(); i++) 
        {
			if (!isPrime(Long.parseLong(possibleCircularPrime.substring(i) + possibleCircularPrime.substring(0, i))))
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