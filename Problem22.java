import java.util.scanner;

public class Problem22
{
    public void readFileToArray()
    {
        Scanner sc = new Scanner(new File(p022_names.txt));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) 
        {
            lines.add(sc.nextLine());
        }
        String[] arr = lines.toArray(new String[0]);
    }

    public static int values()
    {
        char[] Letters = {'1', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] tempName = s.toCharArray();

        int sum = 0;
        for (char c : tempName) 
        {
            for (int j = 0; j < ABC.length; j++) 
            {
                if (c == ABC[j])
                    sum += j;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {

    }
}