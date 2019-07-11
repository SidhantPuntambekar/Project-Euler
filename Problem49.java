import java.util.Arrays;

public class Problem49
{
    public static void main(String[] args) 
    {
		int[] primes = listPrimes(10000, 1488);
		String concatenated = "";
		for (int i = 0; i <primes.length; i++)
		{
			for (int j = 0; j < primes.length; j++)
			{
				int k = primes[j] + (primes[j] - primes[i]);
				if (k < 10000 && Arrays.binarySearch(primes, k) > -1)
				{
					if (isPermutation(primes[i], primes[j]) && isPermutation(primes[i], k))
					{
						concatenated = String.valueOf(primes[i]) + String.valueOf(primes[j]) + String.valueOf(k);
						break;
					}
				}
			}
			if(concatenation.length() > 0)
				break;
		}
		System.out.println(concatenated);
    }

	public static int[] listPrimes(int n, int lowerBound)
	{
		boolean[] isPrime = new boolean[n];
		if(n >= 2)
			isPrime[2] = true;
		for(int i = 3; i < n; i += 2)
		{
			isPrime[i] = true;
		}
		for(int i = 3; i < Math.sqrt(n); i += 2) 
		{
			if(isPrime[i]) 
			{
				for(int j = i * 2; j < n; j += i) 
				{
					isPrime[j] = false;
				}
			}
		}
		int count = 0; 
		for (int i = lowerBound, j = 0; i < n; i++)
		{
			if(isPrime[i])
			{
				primes[j] = i;
				j++;
			}
		}
		return primes;
	}

    public static boolean isPermutation(int n, int m) 
    {
		String sn = String.valueOf(n);
		String sm = String.valueOf(m);
		char[] cn = sn.toCharArray();
		char[] cm = sm.toCharArray();
		Arrays.sort(cn);
		Arrays.sort(cm);
		sn = new String(cn);
		sm = new String(cm);
		return sn.equals(sm);
	}
}