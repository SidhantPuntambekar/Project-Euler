public class Problem31
{
    public static void main(String[] args) 
    {
        int sum = 200;
	    int[] coinValues = { 1, 2, 5, 10, 20, 50, 100, 200 };
	    int[] combinations = new int[sum + 1];
        combinations[0] = 1;
        for (int i = 0; i < coinValues.length; i++) 
        {
            for (int j = coinValues[i]; j <= sum; j++) 
            {
				combinations[j] += combinations[j - coinValues[i]];
			}
        }
        System.out.println(combinations[sum]);
    }
}