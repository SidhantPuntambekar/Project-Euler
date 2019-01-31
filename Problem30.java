public class Problem30
{
    public static void main(String[] args) 
    {
        int PowerSum = 0;
        for (int i = 2; i < 1000000; i++)
        {
            if (i == FifthSum(i))
            {
                PowerSum += i;
            }
        }
        System.out.println(PowerSum);
    }

    public static int FifthSum(int x)
    {
        int sum = 0;
        while (x != 0) 
        {
            int y = x % 10;
            sum += y * y * y * y * y;
            x /= 10;
        }
        return sum;
    }
}