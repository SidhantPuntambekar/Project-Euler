import java.math.BigInteger;
public class Problem20
{
    public static BigInteger factorial(Integer n) {
		BigInteger num = BigInteger.valueOf(1);
		for (Integer i = n; i > 0; i--) {
			num = num.multiply(BigInteger.valueOf(i));
		}
		return num;
	}

    public static void main(String[] args)
    {
        BigInteger factorial = factorial(100);
		char[] factorialArray = factorial.toString().toCharArray();
		BigInteger sum = BigInteger.valueOf(0);
		for (Integer i = 0; i < factorialArray.length; i++) {
			sum = sum.add(BigInteger.valueOf(Integer.parseInt(((Character) factorialArray[i]).toString())));
		}
		System.out.println(sum.toString());
    }
}