public class Problem44
{
    public static void main(String[] args) 
    {
        long difference = 0;
        int i = 2;
        while(true)
        {
            long pentagonalI = Pentagonal(i);
            if (difference != 0 && pentagonalI - Pentagonal(i - 1) > difference) 
            {
				break;
            }
            for (int j = i-1; j >= 1; j--)
            {
                long pentagonalJ = Pentagonal(j);
                if (difference != 0 && pentagonalJ-pentagonalI >= difference)
                {
                    break;
                }
                else if((difference == 0 || pentagonalI - pentagonalJ < difference) && isPentagonal(pentagonalI + pentagonalJ) && isPentagonal(pentagonalI - pentagonalJ)) 
                {    
                    difference = pentagonalI - pentagonalJ;
                }
                i++;
            }
        }
        System.out.println(difference);
    }

    public static long Pentagonal(int n)
    {
        return (long) n * (n*3-1)/2;
    }
    public static boolean isPentagonal(long n)
    {
        return (Math.sqrt(n * 24 + 1) % 6 == 5);
    }
}