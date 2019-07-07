public class Problem49
{
    public static void main(String[] args) 
    {
        
    }

    public static boolean isPermutation(int n, int m) 
    {
		String sn = String.valueOf(n);
		String sm = String.valueOf(m);
		char[] cn = sn.toCharArray();
		char[] cm = sm.toCharArray();
		Arrays.sort(cn);
		Arrays.sort(cm);
		sn = new String(cn);
		sm = new String(cm);
		return sn.equals(sm);
	}
}