import java.util.Scanner;

public class S5_002_IfSentenceNumberDaysMonth {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the number of the month 1 - 12");
        int month = s.nextInt();

        int numDays = 0;
        int year = 1992;

        // leap years to try: 1992, 1

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            numDays = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numDays = 30;
        } else if (month == 2) {
            if (year % 400 == 0 || ( (year % 4 == 0) && (year % 100 != 0)) ) {
                numDays = 29;
            } else {
                numDays = 28;
            }
        }
        System.out.println("Number of days = " + numDays);

    }
}
