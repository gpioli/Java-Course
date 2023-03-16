import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class S8_003_JavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // We will convert Strings to date:

        // First, we must specify the 'pattern' that the string will have:
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        // date format needs to handle errors, because we could input anything in the date
        System.out.println("Please, enter a date with the following format: yyyyy-MM-dd, i.e: 2023-12-24");
        try {
            Date date = format.parse(s.next());
            System.out.println("date without format = " + date);
            System.out.println("date using described format = " + format.format(date));


            // Comparing dates
            Date date2 = new Date();

            if (date.after(date2)){
                System.out.println("Date 1 (inputted by user) is after date2 (actual date)");
            } else if (date.before(date2)) {
                System.out.println("Date 1 (inputted by user) is before date2 (actual date)");
            } else if (date.equals(date2)) {
                System.out.println("Date 1 (inputted by user) is equal to date2 (actual date)");
            }

            System.out.println("Comparison of dates 2");

            // Another way of comparing dates
            if (date.compareTo(date2) > 0){
                System.out.println("Date 1 (inputted by user) is after date2 (actual date)");
            } else if (date.compareTo(date2) < 0) {
                System.out.println("Date 1 (inputted by user) is before date2 (actual date)");
            } else if (date.compareTo(date2) == 0) {
                System.out.println("Date 1 (inputted by user) is equal to date2 (actual date)");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
