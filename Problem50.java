public class Problem50
{
    public static void main(String[] args) 
    {
        int longChain = 0;
        int longNum = 0;

        ArrayList<Integer> prime = new ArrayList<Integer>();
        primes.add(2);
        int p = 3;
        while (p<1000000)
        {
            primes.add(p);
            p = nextPrime(p);
        }
    }

    public static boolean isPrime(int n)
    {
        if(n == 2) 
        {
			return true;
		}
        if(n == 1 || n % 2 == 0) 
        {
			return false;
		}
        for(int i = 3; i * i <= n; i += 2) 
        {
            if(n % i == 0) 
            {
				return false;
			}
		}
		return true;
    }

    public static int nextPrime(int n) 
    {
		int i = n + 2;
        while(!isPrime(i)) 
        {
			i+=2;
		}
		return i;
	}
}