public class Problem14
{
    public static int CollatzSequence(long n)
    {
        if (n%2 == 0)
            return n/2;
        else
            return 3*n +1;
    }

    public static int terms(long n)
    {
        int temp = n; 
        int count = 0; 
        while (temp > 1)
        {
            temp = next(temp);  
                if (temp < NUMBER && TERMS[(int)temp] != 0)
                {  
                     count += TERMS[(int)temp];  
                     break;  
                }  
                count++;    
        }
        TERMS[(int)n] = count;  
        return count;  
    }
    
    public static void main(String[] args)
    {
        for (int i = 1000000; i <)
    }
}