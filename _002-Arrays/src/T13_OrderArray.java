/*
* Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el
* siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
* */

import java.util.Scanner;

public class T13_OrderArray {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Please, enter a number: ");
            a[i] = s.nextInt();
        }

        System.out.println("\n");
        for (int i = 0; (i < ( (a.length) / 2) ); i++) {
            int finalCountDown = a.length - 1 - i;
            System.out.println("Elemento n°:" + finalCountDown + ": " + a[finalCountDown]);
            System.out.println("Elemento n°:" + i + ": " + a[i]);
        }

    }

}
