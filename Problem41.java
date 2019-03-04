import java.util.Arrays;
public class Problem41
{
    public static void main(String[] args) 
    {
        int i = 7654321;
        while (i > 20) 
        {
            if (isPandigital(i + "") && isPrime(i)) 
            {
				break;
			}
            i -= 2;
        }
        System.out.println(i);
    }

    public static boolean isPrime(int number) 
    {
		boolean prime = true;
		double limit = Math.sqrt(number);
        if (number == 1) 
        {
			prime = false;
        } 
        else 
        {
            for (int i = 2; i <= limit; i++) 
            {
                if (number % i == 0) 
                {
					prime = false;
					break;
				}
			}
		}
		return prime;
	}

    public static boolean isPandigital(String number) {
		boolean pandigital = true;
		int length = number.length();
        for (int i = 1; i <= length; i++) 
        {
            if (!number.contains(i + "")) 
            {
				pandigital = false;
				break;
			}
		}
		return pandigital;
	}
}