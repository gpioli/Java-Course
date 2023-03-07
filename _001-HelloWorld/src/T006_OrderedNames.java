/*Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

    Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
    Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
    Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
    Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo." */

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class T006_OrderedNames {
    public static void main(String[] args) {

        String name1 = "";
        String name2 = "";
        String name3 = "";

        try{
            name1 = JOptionPane.showInputDialog(null, "Welcome! Please enter first and second name of one member of your family! ");
            name2 = JOptionPane.showInputDialog(null, "Please enter first and second name of another member of your family! ");
            name3 = JOptionPane.showInputDialog(null, "Please enter first and second name of one last member of your family! ");

        } catch (InputMismatchException e){
            System.out.println("Only strings allowed");
            main(args);
            System.exit(0);
        }

        String message;
        message = (name1.split(" ")[0].length() >= name2.split(" ")[0].length()) ?
                ((name1.split(" ")[0].length() >= name3.split(" ")[0].length()) ? (name1 + " has the longest name") : (name3 + " has the longest name")) :
                (name2.split(" ")[0].length() >= name3.split(" ")[0].length() ? (name2 + " has the longest name") : (name3 + " has the longest name"));

        JOptionPane.showMessageDialog(null,message);


    }
}
