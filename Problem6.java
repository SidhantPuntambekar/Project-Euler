public class Problem6
{
    public static void main(String[] args)
    {
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            int square = i*i;
            sumOfSquares += square; 
        }
        for (int i = 1; i <= 100; i++)
        {
            sum += i;
        }

        int total = sum*sum;
        System.out.println(total -= sumOfSquares);
    }
}