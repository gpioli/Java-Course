import java.text.SimpleDateFormat;
import java.util.Date;

public class S8_JavaUtilDateExample {
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
    }
    
}
