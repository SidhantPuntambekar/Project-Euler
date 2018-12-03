import java.io.File; 
import java.util.Scanner; 
public class Problem8
{
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
        
    } 
}