public class Problem15
{
    public static long binomCoefficient(int a, int b)
    {
        if (b > (a-b))
        {
            b = a - b;
        }
        long c = 1;
		for (int i = 0; i < b; i++)
		{
			c = c * (a - i);
			c = c / (i + 1);			
		}
		return c;
    }

    public static void main(String[] args)
    {
        System.out.println(binomCoefficient(40, 20));
    }
}