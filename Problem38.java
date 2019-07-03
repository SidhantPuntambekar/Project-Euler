import java.util.Arrays;
public class Problem38
{
    public static void main(String[] args) 
    {
        int largest = 0;
		for(int i = 1; i < 10000; i++) {
			String concatenated = "";
			for(int j = 1; concatenated.length() < 9; j++) {
				concatenated += i * j;
			}
			if(isPandigital(concatenated) && Integer.parseInt(concatenated) > largest) {
				largest = Integer.parseInt(concatenated);
			}
		}
		System.out.println(largest);
    }

    public static boolean isPandigital(String x) 
    {
		if(x.length() < 9) {
			return false;
		}
		char[] c = x.toCharArray();
		Arrays.sort(c);
		return new String(c).equals("123456789");
	}
}