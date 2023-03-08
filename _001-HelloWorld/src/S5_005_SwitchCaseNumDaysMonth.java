import java.util.Scanner;

public class S5_005_SwitchCaseNumDaysMonth {
    public static void main(String[] args) {
        int month;
        String monthName;
        int daysNum = 0;
        int year = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the number of the month (1-12)");
        month = s.nextInt();
        System.out.println("Please, enter the year (YYYY)");
        year = s.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysNum = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysNum = 30;
                break;
            case 2:
                if (year % 400 == 0 || ( (year % 4 == 0) && (year % 100 != 0)) ) {
                    daysNum = 29;
                } else {
                    daysNum = 28;
                }
                break;
            default:
                daysNum = 0;

        }

        System.out.println("Number of days of the month = " + daysNum);

    }
}
