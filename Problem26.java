public class Problem26
{
    public static void main(String[] args)
    {
        int result = 0;  
        int longest = 0;  
        for (int i=2; i < 1000; i++){  
             int recurringNumber = recurringNumber(i);   
             if (recurringNumber > longest){  
                  longest = recurringNumber;  
                  result = i;  
             }  
        }  
        System.out.println(result);
    }

    public static int recurringNumber(int num) {  
        int[] array = new int[num+1];  
        int index = 1;  
        int mod = 1;  
        while(mod != 0 && array[mod] == 0){  
             array[mod]=index++;  
             mod = mod * 10 % num;  
        }  
        if (mod == 0){  
             return 0;  
        }  
        return index-array[mod]; 
    }
}