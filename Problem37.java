public class Problem37
{
    public static void main(String[] args) 
    {
        int counter = 0;
        int sum = 0;
        int i = 10;
        while (counter < 500) {
            if (isPrime(i)) {
                if (isTruncatablePrime(Integer.toString(i))) {
                    sum += i;
                    counter++;
                    //System.out.println(i);
                }
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isTruncatablePrime(String x) 
    {
        int num = 0;
        for (int i = 0; i < x.length(); i++) 
        {
            num = Integer.parseInt(x.substring(0, x.length() - i));
            if (!isPrime(num)) 
            {
                return false;
            }
            num = Integer.parseInt(x.substring(i, x.length()));
            if (!isPrime(num)) 
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long z)
    {
        if (z == 2)
        {
            return true;
        }
        for (int i = 2; i < z; i++)
        {
            if (z%i == 0)
            {
                return false; 
            }
        }
        return true;
    }
}