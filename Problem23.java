import java.util.ArrayList;

public class Problem23
{
    private static final int MAX = 28123;
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
        int sum = 0;
        int temp;
        ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
        ArrayList<Integer> abundantSums = new ArrayList<Integer>();

        for (int i = 12; i <= MAX; i++) {
            if(isAbundant(i)) {
                abundantNumbers.add(i);
            }
        }

        int listSize = abundantNumbers.size();

        for(int i = 0; i < listSize; i++) {
             for (int j = i; j < listSize; j++) {

                 temp = abundantNumbers.get(i) + abundantNumbers.get(j);
                 abundantSums.add(temp);
             }          
        }

        for (int i = 1; i <= MAX; i++) { 
                if (abundantSums.contains(i) == false) {
                    sum += i;
                }
        }

        System.out.println(sum);
    }
}