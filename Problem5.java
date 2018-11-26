public class Problem5
{
    public static int SmallestMultiple(int num)
    {
        int number = num;
        for (int i = 1; i <= 20; i++)
        {
            if (number % i == 0)
                number++;
        }
        return number;
    }

    public static void main(String[] args)
    {

    }
}