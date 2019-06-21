public class Problem47
{
    public static void main(String[] args) 
    {
        for (int i = 2; ; i++) 
        {
			if (hasFourPrimeFactors(i + 0) && hasFourPrimeFactors(i + 1) && hasFourPrimeFactors(i + 2) && hasFourPrimeFactors(i + 3))
				System.out.println(Integer.toString(i));
		}
    }

    public static boolean hasFourPrimeFactors(int n)
    {
        return countDistinctPrimeFactors(n) == 4;
    }

    public static int countDistinctPrimeFactors(int j) 
    {
		int count = 0;
        for (int i = 2, end = sqrt(j); i <= end; i++) 
        {
            if (j % i == 0) 
            {
				do j /= i;
				while (j % i == 0);
				count++;
				end = sqrt(j);
			}
		}
		if (j > 1)
			count++;
		return count;
    }

    public static int sqrt(int x) 
    {
		if (x < 0)
			throw new IllegalArgumentException("Square root of negative number");
		int y = 0;
        for (int i = 1 << 15; i != 0; i >>>= 1) 
        {
			y |= i;
			if (y > 46340 || y * y > x)
				y ^= i;
		}
		return y;
	}
}