public class Problem46
{
    
	public static boolean isGoldbach(int n) 
    {
        for(int i = 1; 2 * i * i < n; i++) 
        {
            for(int j = 3; j <= n - 2; j+=2) 
            {
                if(isPrime(j) && j + 2 * i * i == n) 
                {
					return true;
				}
			}
		}
		return false;
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
}