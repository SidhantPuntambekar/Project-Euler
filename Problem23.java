public class Problem23
{
    public static boolean isAbundant(int n) {
        int sum = 1;
        int end = (int) Math.sqrt(n);

        for (int i = 2; i <= end; ++i) {
            if (n % i == 0) {
                int quotient = n / i;

                if (quotient != i) 
                    sum += i + quotient; 
                else 
                    sum += quotient;
            }
        }

        if (sum > n)
            return true;
        
        return false;
    }

    public static void main(String[] args)
    {

    }
}