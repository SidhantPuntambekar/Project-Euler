import java.util.Calendar;
import java.util.GregorianCalendar;
public class Problem19
{
    public static void main (String[] args)
    {
        Calendar date = new GregorianCalendar();
		date.set(1901, Calendar.JANUARY, 1);
		
		int numSundays = 0;
		
        while((date.get(Calendar.YEAR) <= 2000)) 
        {
            if(date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) 
            {
				numSundays++;
			}
			date.add(Calendar.MONTH, 1);
        }
        System.out.println(numSundays);
    }
}