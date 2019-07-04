public class Problem40
{
    public static void main(String[] args) 
    {
        StringBuilder nums = new StringBuilder();
        for(int i = 1; nums.length() <= 1000000; i++) 
        {
			nums.append(i);
        }
        int product = 1;
        for(int j = 0; j < 6; j++) 
        {
			int k = Character.getNumericValue(nums.charAt((int) Math.pow(10, j) - 1));
            if(k != 0) 
            {
				product *= k;
            }
        }
        System.out.println(product); 
    }
}