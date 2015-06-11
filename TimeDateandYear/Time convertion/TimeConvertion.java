import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit; 

public class TimeConvertion {
	
	public static void main(String[] args) {
		 
		String dateStart = "01/14/2012 09:29:58";
		String dateStop = "01/15/2012 10:31:48";
 
		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
 
		Date d1 = null;
		Date d2 = null;
 
		try {
			//Date dt2 = new DateAndTime().getCurrentDateTime();
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
 
			//in milliseconds
			long diff = d2.getTime() - d1.getTime();
			
			long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(diff);
			long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(diff);
			long diffInHours = TimeUnit.MILLISECONDS.toHours(diff);
			long diffInDays = TimeUnit.MILLISECONDS.toDays(diff);
 
			long diffSeconds = diffInSeconds % 60;
			long diffMinutes = diffInMinutes % 60;
			long diffHours = diffInHours % 24;
			long diffDays = diffInDays;			
		
			
 
			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");			
			
 
		} catch (Exception e) {
			e.printStackTrace();
		}
 
	}


}
