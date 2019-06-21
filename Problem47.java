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
        for (int i = 2, end = (int) Math.sqrt(j); i <= end; i++) 
        {
            if (j % i == 0) 
            {
				do j /= i;
				while (j % i == 0);
				count++;
				end = Math.sqrt(j);
			}
		}
		if (j > 1)
			count++;
		return count;
	}
}