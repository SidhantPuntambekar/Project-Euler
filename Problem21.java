public class Problem21
{
    public static int Divisors(int n)
    {
        int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
    }

    public static boolean isAmicable(int n)
    {
        int amicable = Divisors(n);
		return amicable != n && Divisors(amicable) == n;
    }

    public static void main(String[] args)
    {
        int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (isAmicable(i))
				sum += i;
		}
		System.out.println(sum);
    }
}