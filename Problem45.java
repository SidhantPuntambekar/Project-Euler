public class Problem45
{
    public static void main(String[] args) 
    {
        int triangle = 286;
        int pentagonal = 166;
        int hexagonal = 144;
        while(true)
        {
            long t = (long) (triangle)*(triangle + 1)/2;
            long p = (long) (pentagonal) * (3*pentagonal + 1)/2; 
            long h = (long) (hexagonal) * (2*hexagonal-1);
            if (t == p && t == h)
            {
                break;
            }
            else if(t <= p && t <= h) 
            {
				triangle++;
            } 
            else if(p <= t && p <= h) 
            {
				pentagonal++;
            } 
            else if(h <= t && h <= p) 
            {
				hexagonal++;
			}
        }
        System.out.println((long) triangle * (triangle + 1) / 2);
    }
    
}