import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class T011_AgeCalculator {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to the age calculator. Please enter the birth date in order to obtain" +
                "a persons age.");

        String birthDateStr = JOptionPane.showInputDialog("Enter birth date in the following format: yyyy-mm-dd");

        SimpleDateFormat defaultFormat = new SimpleDateFormat("yyy-mm-dd");

        try {
            Date birthDate = defaultFormat.parse(birthDateStr);
            Date actualDate = new Date();

            Long timeDif = actualDate.getTime() - birthDate.getTime();
            Float ageInYears =  (float)timeDif / 1000 / 60 / 60 / 24 / 360;
            Integer ageInYearsInt = ((ageInYears.intValue() % ageInYears) != 0) ? (ageInYears.intValue() - 1) : ageInYears.intValue();
            JOptionPane.showMessageDialog(null, String.format("Calculated age = %s", ageInYearsInt));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please, enter a valid birth date. Format is yyyy-mm-dd, i.e.: 1990-09-06");
            main(args);
            System.exit(0);
        }

    }
}
