public class Problem27
{
    public static void main(String[] args)
    {
        int Num = 0;
        int A = 0;
        int B = 0;
        for (int a = -1000; a <= 1000; a++) 
        {
            for (int b = -1000; b <= 1000; b++) 
            {
                int num = longestPrimeQuadratic(a, b);
                if (num > Num) 
                {
                    Num = num;
                    A = a;
                    B = b;
                }
            }
        }
        System.out.println(A * B);

    }

    public static int longestPrimeQuadratic(int x, int y)
    {
        for (int i = 0; ; i++) 
        {
            int n = i * i + i * x + y;
            if (n < 0 || !isPrime(n))
                return i;
        }
            
    }

    public static boolean isPrime(int z)
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
}