public class Problem25
{
    public static void main(String[] args)
    {
        System.out.println(FibonacciSequence());
    }

    public static int FibonacciSequence()
    {
        int EvenSum = 0;
        int term1 = 0; 
        int term2 = 1; 
        int sum = 0;  
        
        while (term2 < 4000000)
        {
            sum = term1 + term2;
            term1 = term2;
            term2 = sum;
            if (term2%2 == 0)
                EvenSum += term2;
        }
        return EvenSum;
    }
}