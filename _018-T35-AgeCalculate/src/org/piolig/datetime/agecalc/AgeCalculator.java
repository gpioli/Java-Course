package org.piolig.datetime.agecalc;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter date of birth in the following format (yyyy-MM-dd): ");
        String birthString = sc.next();
        LocalDate birthDate = LocalDate.parse(birthString);

        LocalDate actualDate = LocalDate.now();

        Period age = Period.between(birthDate, actualDate);
        System.out.println("Current age in years: " + age.getYears());


    }

}
