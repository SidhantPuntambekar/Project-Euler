public class Problem3
{
    private static long x = 600851475143L;
    
    public static long PrimeNums()
    {
        for (long z = (int) Math.sqrt(x); z >= 1; z--)
        {
            if (x%z == 0)
                return z;
        }
        return x;
    }

    public static boolean isPrime(long z)
    {
        if (z == 2)
        {
            return true;
        }
        for (long i=3; i<z; i+=2) 
        { 
            if (z%i == 0) 
              return false;
        }
          return true;
        
    } 

    public static void main(String [] args)
    {
        for (long i = (long) Math.sqrt(x) - 1; i>=2; i = i - 2)
        {
            if (isPrime(i) && x%i == 0) 
            {
                System.out.println(i);
                break;
            }     
        }
    }
}