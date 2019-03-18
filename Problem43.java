import java.util.Arrays;
public class Problem43
{
    public static void main(String[] args) 
    {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        long sum = 0; 
        while (!Arrays.equals(nums, new int[]{9,8,7,6,5,4,3,2,1,0}))
        {
            if (isDivisible(nums))
            {
                for (int i = 0; i < nums.length; i++)
                {
                    sum += (nums[i] * Math.pow(10, 9 - i));
                }
            }
            permutations(nums);
        }
        System.out.println(sum);
    }
    
    public static void permutations(int[] numbers)
    {
		int i = numbers.length - 2;
        while(numbers[i] > numbers[i + 1]) 
        {
			i--;
        }
        
        for (int j = 1; i + j < numbers.length - j; j++) 
        {
			int temp = numbers[i + j];
			numbers[i + j] = numbers[numbers.length - j];
			numbers[numbers.length - j] = temp;
        }
        
        int j = i + 1;
        while(numbers[j] <= numbers[i]) 
        {
			j++;
        }
        
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
    }

    public static boolean isDivisible(int[] nums) 
    {
		int[] divisors = new int[]{2, 3, 5, 7, 11, 13, 17};
        for(int i = 0; i < divisors.length; i++) 
        {
            if((nums[i + 1] * 100 + nums[i + 2] * 10 + nums[i + 3]) % divisors[i] != 0) 
            {
				return false;
			}
		}
		return true;
	}
}