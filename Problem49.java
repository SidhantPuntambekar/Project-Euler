public class Problem49
{
    public static void main(String[] args) 
    {
        
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