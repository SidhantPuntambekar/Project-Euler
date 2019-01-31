import java.math.BigInteger;
import java.util.ArrayList;
public class Problem29
{
    public static void main(String[] args)
    {
        ArrayList<BigInteger> set = new ArrayList<BigInteger>();
        for (int a = 2; a <= 100; a++) 
        {
			for (int b = 2; b <= 100; b++)
                set.add(BigInteger.valueOf(a).pow(b));
        }
        System.out.println(set.size());

    }
}