public class Problem14
{
    private static final int Number = 1000000; 
    private static final int[] Terms = new int[Number]; 
    public static long CollatzSequence(long n)
    {
        if (n%2 == 0)
            return n/2;
        else
            return 3*n +1;
    }

    public static int terms(long n)
    {
        long temp = n; 
        int term = 0; 
        while (temp > 1)
        {
            temp = terms(temp);  
                if (temp < Number && Terms[(int)temp] != 0)
                {  
                     term += Terms[(int)temp];  
                     break;  
                }  
                term++;    
        }
        Terms[(int)n] = term;  
        return term;  
    }

    public static void main(String[] args)
    {
        long largestNum = 0;  
        int num = 0;  
        for (int i = 1; i < Number; i++){  
            long terms = terms(i);   
            if (terms > largestNum){  
                    largestNum = terms;  
                    num = i;  
            }  
        }  
        System.out.println(num);
        System.out.println(largestNum);  
    }
}