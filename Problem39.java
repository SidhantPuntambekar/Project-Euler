public class Problem39
{
    public static void main(String[] args) 
    {
        int maxSolutions = 0;
        int maxNum = 0;
        for (int i = 0;i <= 1000;i++)
        {
            int count = 0;
            for (int j = 0; j <= i; j++)
            {
                for (int k = 0; k <= i; k++)
                {
                    int n = i-k-j;
                    if (j*j+k*k == n*n)
                    {
                        count++;
                    }
                }
            }
            if(count > maxSolutions) 
            {
				maxSolutions = count;
				maxNum = i;
			}
        }
        System.out.println(maxNum);
    }
}