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
        for (long i=2; i<z; i++) 
        { 
            if (z%i == 0) 
              return false;
        }
          return true;
        
    } 

    public static void main(String [] args)
    {
        System.out.println(PrimeNums());
        System.out.println(isPrime(486847));
    }
}