public class Problem21
{
    public static int Divisors(int n)
    {
        int count = 0;
        for (int i = 1; i*i <= n; i++)
        {
            if (n%i == 0)
            {
                count += 2;
                if (i*i == n)
                {
                    count--;
                }
            }   
        }
        return count;
    }
    
    public static void main(String[] args)
    {

    }
}