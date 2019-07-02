public class Problem37
{
    public static void main(String[] args) 
    {
        int sum = 0;
        int count = 0;
        for(int i = 11; count < 11; i+=2) 
        {
            if(isPrime(i) && isTruncatable(i)) 
            {
				sum += i;
				count++;
			}
		}
		System.out.println(sum);
    }

    public static boolean isTruncatablePrime(int n) 
    {
        for (int i = 10; i <= num; i *= 10) 
        {
            if (!isPrime(num % i)) 
            {
				return false;
			}
		}
        for(int i = num; i > 0; i /= 10) 
        {
            if(!isPrime(i)) 
            {
				return false;
			}
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