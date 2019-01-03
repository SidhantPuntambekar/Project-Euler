import java.math.BigInteger;
public class Problem16
{
    public static String PowerSum()
    {
        String temp = BigInteger.ONE.shiftLeft(1000).toString();
        int sum = 0;
        for (int i = 0; i < temp.length(); i++)
        {
            sum += temp.charAt(i) - '0';
        }
        return Integer.toString(sum);
    }

    public static void main(String[] args)
    {
        System.out.println(PowerSum());
    }
}