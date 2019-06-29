import java.math.BigInteger;
public class Problem33
{
    public static void main(String[] args)
    {
        int numerator = 1; 
        int denominator = 1;
        for (int i = 10; i < 100; i++)
        {
            for (int j = 10; j < i; j++)
            {
                int numerator1 = j % 10;
                int numerator2 = j / 10; 
                int denominator1 = i % 10;
                int denominator2 = i / 10;
                if (numerator2 == denominator1 && numerator1 * j == i * denominator2 || numerator1 == denominator2 && numerator2 * i == j * denominator1)
                    numerator *= j;
                    denominator *= i;
            }
        }
        System.out.println(denominator/gcdThing(numerator,denominator));
    }

    public static int gcdThing(int x, int y) 
    {
        if (x < 0 || y < 0)
			throw new IllegalArgumentException("Negative number");
		while (y != 0) {
			int z = x % y;
			x = y;
			y = z;
		}
		return x;
    }
}