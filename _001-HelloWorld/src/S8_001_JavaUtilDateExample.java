import java.text.SimpleDateFormat;
import java.util.Date;

public class S8_001_JavaUtilDateExample {
    public static void main(String[] args) {
        
        Date date = new Date();

        System.out.println("date = " + date); // date = Wed Mar 15 00:58:48 UYT 2023

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr);

        df = new SimpleDateFormat("dd-MM-yyyy");
        dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr);

        df = new SimpleDateFormat("dd/MM/yyyy"); // dateStr = 15/03/2023
        dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr);

        df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr); // dateStr = 2023.03.15 d. C. at 01:10:08 UYT

        // more info about formatting for SimpleDateFormat:
        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html



        // How much time does it take to do the operation?

        // time before the 'for'
        date = new Date();

        long j = 0;
        for(int i = 0; i < 10000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        // time after the 'for' iteration
        Date date2 = new Date();

        // lets check the time taken:
        long finalTime = date2.getTime() - date.getTime();
        System.out.println("finalTime = " + finalTime); // ~ 16 miliseconds

    }
    
}
