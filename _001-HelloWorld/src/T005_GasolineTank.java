/*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en
 litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión,
pero tambien puede ser del tipo int.

    Si la capacidad actual es 70 litros: imprimir Estanque lleno
    Si está entre 60 y menor a 70: imprimir Estanque casi lleno
    Si está entre 40 y menor a 60: imprimir Estanque  3/4
    Si está entre 35 y menor a 40: imprimir Medio Estanque
    Si está entre 20 y menor a 35: imprimir Suficiente
    Si está entre 1 y menor a 20: imprimir Insuficiente*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class T005_GasolineTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double gasolineLevel = 0;

        System.out.println("Welcome! Please enter the actual level of the gasoline tank in numbers. Max capacity" +
                "is 70 litres: ");

        try{
            gasolineLevel = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Only numbers allowed");
            main(args);
            System.exit(0);
        }

        String message;
        if (gasolineLevel == 70){
            message = "Gasoline tank is full";
        } else if (gasolineLevel < 70 && gasolineLevel >= 60) {
            message = "Gasoline tank is almost full";
        } else if (gasolineLevel < 60 && gasolineLevel >= 40) {
            message = "Gasoline tank is 3/4";
        } else if (gasolineLevel < 40 && gasolineLevel >= 35) {
            message = "Half tank";
        } else if (gasolineLevel < 35 && gasolineLevel >= 20) {
            message = "Sufficient";
        } else if (gasolineLevel < 20 && gasolineLevel >= 1) {
            message = "Insufficient";
        } else {
            message = "Value is out of range";
        }

        System.out.println(message);


    }
}
