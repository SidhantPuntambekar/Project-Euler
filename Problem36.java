public class Problem36
{
    public static void main(String[] args) 
    {
        int sum = 0;
        for (int i = 0; i < 1000000; i++)
        {
            if (isPalindromicBaseTen(i) && isPalindromicBaseTwo(i))
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPalindromicBaseTwo(int x)
    {
        return isPalindromicString(Integer.toBinaryString(x));
    }

    public static boolean isPalindromicBaseTen(int x)
    {
        String palindrome1 = x + "";
        for (int i = 0; i < palindrome1.length() / 2; i++)
        {
            if (palindrome1.charAt(i) != palindrome1.charAt(palindrome1.length()-i-1))
                return false;
        }
        return true;
    }

    public static boolean isPalindromicString(String N)
    {
        return new StringBuilder(N).reverse().toString().equals("" + N);
    }
}