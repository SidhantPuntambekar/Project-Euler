import java.util.Arrays;
public class Problem34
{
    public static void main(String[] args) 
    {
        int sum = 0;
        for (int i = 3; i < 100000; i++)
        {
            if (i == factorialDigitSum(i))
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static int[] FactorialGenerator()
    {
        int[] Factorials = new int[10];
        Factorials[0] = 1;
        for (int i = 1; i < Factorials.length; i++)
        {
            Factorials[i] = Factorials[i-1] * i;
        }
        return Factorials;
    }

    public static int factorialDigitSum(int x) {
		int sum = 0;
		while (x != 0) {
			sum += FactorialGenerator()[x % 10];
			x /= 10;
		}
		return sum;
	}
}