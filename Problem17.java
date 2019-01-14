public class Problem17
{
    public static long countCharacters(int n)
    {
        long sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += returnCharacters(i).length();
        }
        return sum;
    }

    public static String returnCharacters(int n)
    {
        String letters = "";
        switch (n) 
        {
            case 0: letters = ""; break;
            case 1: letters = "One"; break;
            case 2: letters = "Two"; break;
            case 3: letters = "Three"; break;
            case 4: letters = "Four"; break;
            case 5: letters = "Five"; break;
            case 6: letters = "Six"; break;
            case 7: letters = "Seven"; break;
            case 8: letters = "Eight"; break;
            case 9: letters = "Nine"; break;
            case 10: letters = "Ten"; break;
            case 11: letters = "Eleven"; break;
            case 12: letters = "Twelve"; break;
            case 13: letters = "Thirteen"; break;
            case 14: letters = "Fourteen"; break;
            case 15: letters = "Fifteen"; break;
            case 16: letters = "Sixteen"; break;
            case 17: letters = "Seventeen"; break;
            case 18: letters = "Eighteen"; break;
            case 19: letters = "Nineteen"; break;
            case 20: letters = "Twenty"; break;
            case 30: letters = "Thirty"; break;
            case 40: letters = "Forty"; break;
            case 50: letters = "Fifty"; break;
            case 60: letters = "Sixty"; break;
            case 70: letters = "Seventy"; break;
            case 80: letters = "Eighty"; break;
            case 90: letters = "Ninety"; break;
            case 100: letters = "OneHundred"; break;
            case 200: letters = "TwoHundred"; break;
            case 300: letters = "ThreeHundred"; break;
            case 400: letters = "FourHundred"; break;
            case 500: letters = "FiveHundred"; break;
            case 600: letters = "SixHundred"; break;
            case 700: letters = "SevenHundred"; break;
            case 800: letters = "EightHundred"; break;
            case 900: letters = "NineHundred"; break;
            case 1000: letters = "OneThousand"; break;
        }
        if (letters.length() == 0)
        {
            int length = (int)(Math.log10(n)+1);  
            int splitNumber;
            for (int i=1;i<=length;i++)
            {
                if (i == 3) 
                    letters += "and"; 
                splitNumber = (int) (n % Math.pow(10, i)); 
                letters += returnCharacters(splitNumber);
                n -= splitNumber;
            }
        }
        return letters;
    }

    public static void main(String[] args)
    {
        //System.out.println(countCharacters(1000));
        for (int i = 1; i <= 1000; i++)
            System.out.println(returnCharacters(i));
        // //System.out.println(returnCharacters(40));
    }
}