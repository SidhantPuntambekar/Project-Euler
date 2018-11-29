public class Problem5
{

    public static void main(String[] args)
    {
        
        long number = 2520;
        long smallest = 0;
        for (int k = 2520; k < 1000000000; k+=2520)
        {
            boolean isMultiple = true;
            for (int i = 1; i <= 20; i++)
                {
                    if (number % i != 0)
                        isMultiple = false;
                        break;
                }
            if (isMultiple)
            {
                smallest = k;
                break;
            }
        }
        System.out.println(smallest);
    }
}