public class Problem4
{
    public static int ReturnPalindrome()
    {   
        int doublePalindrome = 0; 
        for (int i = 999; i <100; i--)
        {
            for (int j = 999; i <100; i--)
            {
                if (isPalindrome(i*j))
                    doublePalindrome = i*j;
            }
        }
        return doublePalindrome; 
    }

    public static boolean isPalindrome(int n)
    {
        int[] nums = nums[doublePalindrome.length];
        
        if (n % 2 != 0)
            return true;
        else
            return false; 
    }

    public static void main(String[] args)
    {
        System.out.println(ReturnPalindrome());
    }
}
