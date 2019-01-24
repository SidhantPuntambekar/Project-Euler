import java.math.BigInteger;
public class Problem25
{
    public static void main(String[] args)
    {
        BigInteger term1 = BigInteger.valueOf(1); 
        BigInteger term2 = BigInteger.valueOf(1);   
        int index = 2;

        while (term2.toString().length() < 1000)
        {
            BigInteger sum = term1.add(term2);
            term1 = term2;
            term2 = sum;
        }
        System.out.println(sum);
    }
}