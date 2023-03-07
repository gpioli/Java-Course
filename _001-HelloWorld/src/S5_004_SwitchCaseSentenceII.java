import java.util.Scanner;

public class S5_004_SwitchCaseSentenceII {
    public static void main(String[] args) {
        int month = 12;
        String monthName;

        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the number of the month (1-12)");
        month = s.nextInt();

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Undefined";
        }

        System.out.println("monthName = " + monthName);

    }
}
