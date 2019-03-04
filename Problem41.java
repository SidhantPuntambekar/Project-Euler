import java.util.Arrays;
public class Problem41
{
    public static void main(String[] args) 
    {
        int primeNumber = 0;
        for (int i = 1; i < 1000000; i++)
        {
            if (isPrime(i) && isPandigital(i + "")
            {
                primeNumber += i;
            }
        }
        System.out.println(primeNumber);
    }

    public static boolean isPrime(int z)
    {
        if (z == 2)
        {
            return true;
        }
        for (long i=3; i<z; i+=2) 
        { 
            if (z%i == 0) 
              return false;
        }
          return true;
    } 

    public static boolean isPandigital(String x) 
    {
		if (x.length() != 9)
			return false;
		char[] temp = x.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals("123456789");
	}

}