public class Problem53
{
    public static void main(String[] args) 
    {
        
    }

    public static BigInteger factorial(int n, int r)
    {
        BigInteger factorial = BigInteger.ONE;
		for(int i = r; i <= n; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
    }
}