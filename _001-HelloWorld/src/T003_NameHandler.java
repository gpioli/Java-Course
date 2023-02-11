import java.util.Scanner;

public class T003_NameHandler {
    public static void main(String[] args) {
//        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
//        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
//        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
//        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
//        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
//
//        N.es_A.ia_E.pe

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the names handler program");

        try {
            System.out.println("Please, enter the name of the first person");
            String person1 = scanner.nextLine().trim();
            System.out.println("Please, enter the of the second person");
            String person2 = scanner.nextLine().trim();
            System.out.println("Please, enter the of the third person");
            String person3 = scanner.nextLine().trim();

            Character name1Init = person1.toCharArray()[1];
            String name1InitMay = name1Init.toString().toUpperCase();
            String newName1 = name1InitMay + "." + person1.substring(person1.length()-2);

            Character name2Init = person2.toCharArray()[1];
            String name2InitMay = name2Init.toString().toUpperCase();
            String newName2 = name2InitMay + "." + person2.substring(person2.length()-2);

            Character name3Init = person3.toCharArray()[1];
            String name3InitMay = name3Init.toString().toUpperCase();
            String newName3 = name3InitMay + "." + person3.substring(person3.length()-2);

            System.out.println(newName1 + "_" + newName2 + "_" + newName3);

        } catch (Exception e) {
            System.out.println("Only string input allowed. ");
        }

    }
}
