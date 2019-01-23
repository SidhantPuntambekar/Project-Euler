public class Problem24
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
		for (int i = 0; i < array.length; i++)
            array[i] = i;
        
        for (int i = 0; i < 999999; i++) 
        {
            if (!Library.nextPermutation(array))
                throw new AssertionError();
        }

        String answer = "";
		for (int i = 0; i < array.length; i++)
			answer += array[i];
		System.out.println(answer);
    }
}