/* Pedir el radio de un círculo y calcular su área.

utilizar la formula:

area = PI*r² (Constante PI multiplicado por el radio al cuadrado).


Recomiendo primero implementar la tarea en el IDE para probarla y revisarla bien, luego publica tu código de la clase main por esta vía.*/

import java.util.Scanner;

public class T012_CircleAreaCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double radius = 0;

        try {
            System.out.println("----Welcome to the circle area calculator ----\n");
            System.out.println("Please, enter the radius of the circle you want to calculate the area: ");
            radius = s.nextDouble();
            double area = Math.pow(radius, 2) * Math.PI;
            System.out.println("Circle area = " + area);
        } catch (Exception e) {
            System.out.println("There was a problem calculating the cercle area. Please try again. Bear in mind that only numbers are allowed.\n");
            main(args);
            System.exit(0);
        }

    }

}
