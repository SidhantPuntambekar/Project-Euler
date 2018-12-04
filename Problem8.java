import java.io.File; 
import java.util.Scanner; 
public class Problem8
{
    public static int ThirteenMultiples(int[] a)
    {
        long product = 1;
        for (int i = 0; i < a.length; i++) 
        {
            long number = a[i] - '0';
            product *= number;
        }
        return product;
    }

    public static void main(String[] args) throws Exception 
    {
        int[] digits = new int[1000];

        // pass the path to the file as a parameter 
        File file = new File("Problem8Input.txt"); 
        Scanner sc = new Scanner(file);
        int digitsInitialized = 0; 
        while (sc.hasNextLine()) 
        {
            String fileLine = sc.nextLine();
            for (int i = 0; i < fileLine.length(); i++) 
            {
                digits[digitsInitialized] = fileLine.charAt(i) - '0';
                digitsInitialized++;
            }
        }
        System.out.println(ThirteenMultiples(digits));
    } 
}