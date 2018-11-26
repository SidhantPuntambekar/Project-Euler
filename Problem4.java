public class Problem4
{

    public static boolean isPalindrome(int number)
    {
        String palindrome1 = number + "";
        for (int i = 0; i < palindrome1.length() / 2; i++)
        {
            if (palindrome1.charAt(i) == palindrome1.charAt(palindrome1.length()-i-1))
                return true;
        }
    }

    public static int ReturnPalindrome()
    {   
        int doublePalindrome = 0;
        int b = 0; 
        for (int i = 999; i <100; i--)
        {
            for (int j = 999; j <100; j--)
            {
                doublePalindrome = i*j;
                if (isPalindrome(doublePalindrome))
                {
                    if (doublePalindrome > b)
                        return doublePalindrome; 
                }
            }
        }
        return doublePalindrome;
    }

    public static void main(String[] args)
    {
        System.out.println(ReturnPalindrome());
    }
}
