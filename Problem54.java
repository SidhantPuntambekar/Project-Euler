import java.util.Arrays;

public class Problem54
{
    public static void main(String[] args) 
    {
        
    }

    public static int getHandValue(int[][] h) 
    {
		int sum = 1;
        for(int i = 0; i < h.length; i++) 
        {
			sum *= h[i][0];
		}
		return sum;
	}
}