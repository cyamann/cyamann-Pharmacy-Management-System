import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date {

	public static  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
	public static  LocalDate localDate = LocalDate.now();
	public static  LocalDateTime now = LocalDateTime.now();
	
   public static void printDate() {
	   System.out.println(dtf.format(localDate));            // 2021/03/22

   }
   
   public static int getDifference(LocalDate date) {
	   int diff = (int) ChronoUnit.DAYS.between(localDate, date);
	   return diff;
   }
   
   
   //using to change availability of the employees
   public static boolean getTimeDiff(LocalDateTime time) {
	   long diff = ChronoUnit.SECONDS.between(now, time);
	   if(diff<0)
		   return false;
	   else
		   return true;
   }
	
}
