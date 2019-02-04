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
                int numerator1 = numerator % 10;
                int numerator2 = numerator / 10; 
                int denominator1 = denominator % 10;
                int denominator2 = denominator / 10;
                if (numerator2 == denominator1 && numerator1 * j == i * denominator2 || numerator1 == denominator2 && numerator2 * i == j * denominator1)
                    numerator *= j;
                    denominator *= i;
            }
        }
        System.out.println(denominator/gcdThing(numerator,denominator));
    }

    private static int gcdThing(int a, int b) 
    {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}