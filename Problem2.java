public class Problem2
{

    public static void main(String[] args)
    {
        int EvenSum = 0;
        int term1 = 0; //assign an initial value here
        int term2 = 1; //assign an initial value here
        int sum = 0;  //assign an initial value here
        //code to calculate the nth term in the fibonacci sequence
        while (term2 < 4000000)
        {
            sum = term1 + term2;
            term1 = term2;
            term2 = sum;
            if (term2%2 == 0)
                EvenSum += term2;
        }
        System.out.println(EvenSum);
    }
}