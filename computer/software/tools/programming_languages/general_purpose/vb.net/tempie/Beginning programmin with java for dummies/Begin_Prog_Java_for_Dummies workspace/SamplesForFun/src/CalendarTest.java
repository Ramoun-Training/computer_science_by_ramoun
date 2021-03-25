import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		String months [] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Calendar cal = new GregorianCalendar();
		int day;
		String month;
		int year,hour,minute,seconds;
		String str_hour,str_minute,str_seconds;
		
		day = cal.get(Calendar.DAY_OF_MONTH);
		month = months[cal.get(Calendar.MONTH)];
		year = cal.get(Calendar.YEAR);
		
		
		hour = cal.get(Calendar.HOUR);
		str_hour = hour < 10? ("0" + hour) : String.valueOf(hour);
		
		minute = cal.get(Calendar.MINUTE);
		str_minute = minute < 10? ("0" + minute) : String.valueOf(minute);
		
		seconds = cal.get(Calendar.SECOND);
		str_seconds = seconds < 10? ("0" + seconds) : String.valueOf(seconds);
		//System.out.println("Date: " + cal.get(Calendar.DATE));
		
		
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("+-+-");
		}
		System.out.println();
		
		
		System.out.println("Hours: " + hour);
		System.out.println("Minutes: " + minute);
		System.out.println("Seconds: " + seconds);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print("+-+-");
		}
		System.out.println();
		
		//System.out.println("Date: " + cal.get(Calendar.JANUARY));
		
		
		System.out.printf("Date: %s/%d/%d \n",month,day,year);
		System.out.printf("Time: %s:%s:%s \n",str_hour,str_minute,str_seconds);
	}

}
