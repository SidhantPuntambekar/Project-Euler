public class Problem12
{
    public static int Divisors(int n)
    {
        int count = 0;
        for (int i = 1; i*i <= n; i++)
        {
            if (n%i == 0)
                count++;
        }
        return count;
    }

    public static void main (String[] args)
    {
        int a = 0;
        int x = 1;
        boolean bool = false;
        while (!bool)
        {
            if (Divisors(a) > 500)
            {
                System.out.println(a);
                bool = true;
            }
            else
            {
                a += x;
                x++;
            }
        }
    }
}