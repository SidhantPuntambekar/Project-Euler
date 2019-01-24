public class Problem24
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
		for (int i = 0; i < array.length; i++)
            array[i] = i;
        
        for (int i = 0; i < 999999; i++) 
        {
            if (!nextPermutation(array))
                throw new AssertionError();
        }

        String answer = "";
		for (int i = 0; i < array.length; i++)
			answer += array[i];
		System.out.println(answer);
    }

    public static boolean nextPermutation(int[] array) 
    {
            int i = array.length - 1;
            while (i > 0 && array[i - 1] >= array[i])
                i--;

            if (i <= 0)
                return false;

            int j = array.length - 1;
            while (array[j] <= array[i - 1])
                j--;
            
            int temp = array[i - 1];
            array[i - 1] = array[j];
            array[j] = temp;
            
            
            j = array.length - 1;
            while (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            return true;
    }
}