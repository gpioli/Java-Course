/*Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando
el programa.*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class T008_GradesMeanFor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //System.out.println("Please, enter the number of grades you would like to work with in numbers: *(Max: 20 grades)");
        //int grades = s.nextInt();

        int totalGrades = 20;

        int totalOverFiveGrades = 0;
        double runningTotalOverFiveGrades = 0;
        double totalOverFiveGradesProm = 0;

        int totalUnderFiveGrades = 0;
        double runningTotalUnderFiveGrades = 0;
        double totalUnderFiveGradesProm = 0; // Doesn't includes grades == 1

        int totalOneGrades = 0;

        double totalProm = 0;


        System.out.println("Welcome to the grades calculator system.");
        try {
            for (int i = 1; i <= totalGrades; i++) {
                System.out.println(String.format("Please enter the grade #%s", i));
                double grade = s.nextDouble();
                if ((grade < 1) || (grade > 7)) {
                    System.out.println("The grade you entered is not allowed. Only 1 to 7 grades are accepted.");
                    System.exit(0);
                } else if (grade == 1) {
                    totalOneGrades++;
                    totalUnderFiveGrades++;
                    runningTotalUnderFiveGrades = runningTotalUnderFiveGrades + grade;
                } else if ((grade > 1) && (grade < 5)) {
                    totalUnderFiveGrades++;
                    runningTotalUnderFiveGrades = runningTotalUnderFiveGrades + grade;
                } else {
                    totalOverFiveGrades++;
                    runningTotalOverFiveGrades = runningTotalOverFiveGrades + grade;
                }
            }

            if (totalOverFiveGrades > 0) {
                totalOverFiveGradesProm = runningTotalOverFiveGrades / totalOverFiveGrades;
                System.out.println("\nMean of grades over 5: " + totalOverFiveGradesProm);
            } else {
                System.out.println("\nUnable to calculate the mean of notes over 5");
            }

            if (totalUnderFiveGrades > 0) {
                totalUnderFiveGradesProm = runningTotalUnderFiveGrades / totalUnderFiveGrades;
                System.out.println("Mean of grades under 5: " + totalUnderFiveGradesProm);
            } else {
                System.out.println("Unable to calculate the mean of notes under 5");
            }

            if ((totalUnderFiveGrades > 0) || (totalOverFiveGrades > 0)) {
                totalProm = totalOverFiveGradesProm + totalUnderFiveGradesProm;
                System.out.println("Total mean: " + totalProm);
            }

        } catch (InputMismatchException e) {
            System.out.println("The input was incorrect. Please enter only grades between 1 to 7, i.e.: 2,5");
            main(args);
            System.exit(0);
        }


    }
}
