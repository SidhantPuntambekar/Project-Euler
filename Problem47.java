import java.util.math;
public class Problem47
{
    public static void main(String[] args) 
    {
        
    }

    public static int countDistinctPrimeFactors(int j) 
    {
		int count = 0;
        for (int i = 2, end = Math.sqrt(j); i <= end; i++) 
        {
            if (n % i == 0) 
            {
				do j /= i;
				while (j % i == 0);
				count++;
				end = Math.sqrt(n);
			}
		}
		if (j > 1)
			count++;
		return count;
	}
}