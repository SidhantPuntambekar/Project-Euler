public class Problem17()
{
    public static long countCharacters(int n)
    {
        long sum = 0;
        for (int i = 0; i <= n; i++)
        {
            sum += returnCharacters(i);
        }
        return sum;
    }

    public static int returnCharacters()
    {
        int characters = 0;
        switch (n) {
            case 0: letters = 0; break;
            case 1: letters = "One".length(); break;
            case 2: letters = "Two".length(); break;
            case 3: letters = "Three".length(); break;
            case 4: letters = "Four".length(); break;
            case 5: letters = "Five".length(); break;
            case 6: letters = "Six".length(); break;
            case 7: letters = "Seven".length(); break;
            case 8: letters = "Eight".length(); break;
            case 9: letters = "Nine".length(); break;
            case 10: letters = "Ten".length(); break;
            case 11: letters = "Eleven".length(); break;
            case 12: letters = "Twelve".length(); break;
            case 13: letters = "Thirteen".length(); break;
            case 14: letters = "Fourteen".length(); break;
            case 15: letters = "Fifteen".length(); break;
            case 16: letters = "Sixteen".length(); break;
            case 17: letters = "Seventeen".length(); break;
            case 18: letters = "Eighteen".length(); break;
            case 19: letters = "Nineteen".length(); break;
            case 20: letters = "Twenty".length(); break;
            case 30: letters = "Thirty".length(); break;
            case 40: letters = "Forty".length(); break;
            case 50: letters = "Fifty".length(); break;
            case 60: letters = "Sixty".length(); break;
            case 70: letters = "Seventy".length(); break;
            case 80: letters = "Eighty".length(); break;
            case 90: letters = "Ninety".length(); break;
            case 100: letters = "OneHundred".length(); break;
            case 200: letters = "TwoHundred".length(); break;
            case 300: letters = "ThreeHundred".length(); break;
            case 400: letters = "FourHundred".length(); break;
            case 500: letters = "FiveHundred".length(); break;
            case 600: letters = "SixHundred".length(); break;
            case 700: letters = "SevenHundred".length(); break;
            case 800: letters = "EightHundred".length(); break;
            case 900: letters = "NineHundred".length(); break;
            case 1000: letters = "OneThousand".length(); break;
        }
    }
    public static void main(String[] args)
    {

    }
}