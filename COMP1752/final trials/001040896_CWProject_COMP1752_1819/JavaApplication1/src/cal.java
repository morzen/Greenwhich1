
/**
 *
 * @author Daniels Magonis- dm5376y, Barnabe Malandain, Jake Nelms.
 */
import java.util.Date;
import java.util.Calendar;

public class cal {
public static int SECONDS_IN_A_DAY = 24 * 60 * 60;
public static void main(String[] args) {
    Calendar thatDay = Calendar.getInstance();
    thatDay.setTime(new Date(0)); /* reset */
    thatDay.set(Calendar.HOUR_OF_DAY,15);/*here Add ur Time */
    thatDay.set(Calendar.DAY_OF_MONTH,10);
    thatDay.set(Calendar.MONTH,11); // 0-11 so 1 less
    thatDay.set(Calendar.YEAR, 2020);
    Calendar today = Calendar.getInstance();
    long diff =  thatDay.getTimeInMillis() - today.getTimeInMillis();
    long diffSec = diff / 1000;
    long days = diffSec / SECONDS_IN_A_DAY;
    long secondsDay = diffSec % SECONDS_IN_A_DAY;
    long seconds = secondsDay % 60;
    long minutes = (secondsDay / 60) % 60;
    long hours = (secondsDay / 3600); // % 24 not needed
    int dayes=(int)days;
    int houres=(int)hours;
    int min=(int)minutes;




    int num = dayes * (24*60*60) + houres * (60*60) + min * 60 ;

    System.out.println(num);
       








}
}