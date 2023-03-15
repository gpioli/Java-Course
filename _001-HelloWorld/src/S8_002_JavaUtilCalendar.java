import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class S8_002_JavaUtilCalendar {
    public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();

    calendar.set(2020, Calendar.SEPTEMBER, 25, 19, 20, 10);
    Date date = calendar.getTime();
    System.out.println("calendar = " + date);

    // Another way of setting time:
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JULY); // Notice the months days are '-1' they original number, i.e.:
        // JULY = 6, SEPTEMBER = 8
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date date1 = calendar.getTime();
        System.out.println("date1 without format = " + date1);


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String dateWithFormat = format.format(date1);
        System.out.println("date1 with format = " + dateWithFormat);

        // What if we want to work with AM / PM time (12 hours)
         format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);

        dateWithFormat = format.format(date);
        System.out.println("dateWithFormat = " + dateWithFormat);
        dateWithFormat = format.format(date1);
        System.out.println("date1WithFormat = " + dateWithFormat);

    }


}
