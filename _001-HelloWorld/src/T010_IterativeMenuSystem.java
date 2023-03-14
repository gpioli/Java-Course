/*Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.

Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un numero.

O bien! otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces graficas de la siguiente forma:

    int opcionIndice = 0;
    ...

    // los Map (o mapas) los veremos mas adelante en el curso en profundidad
    // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
    // también se les conoce como diccionarios para almacenar datos en base a un nombre.
    Map<String, Integer> opciones = new HashMap();
    opciones.put("Actualizar", 1);
    opciones.put("Eliminar", 2);
    opciones.put("Agregar", 3);
    opciones.put("Listar", 4);
    opciones.put("Salir", 5);

    Object[] opArreglo = opciones.keySet().toArray();

    Object opcion = JOptionPane.showInputDialog(null,
                        "Seleccione un Opción",
                         "Mantenedor de Productos",
                         JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

    if (opcion == null) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
    } else {
        opcionIndice = opciones.get(opcion.toString());

       // aca un if o switch para las distintas opciones.
    }


Según el numero ingresado usar un if o switch para implementar cada una de las 4 operaciones y 5 para salir.

Dentro de cada sentencia o switch imprimir un texto relacionado a la opción, por ejemplo para actualizar:

JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");

o mediante sout en consola:

System.out.println("Usuario actualizado correctamente");

Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.

Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe mostrar el mensaje "Haz salido con exito!" y finalizar el programa. */

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class T010_IterativeMenuSystem {
    public static void main(String[] args) {

        int optionIndex = 0;


        // los Map (o mapas) los veremos mas adelante en el curso en profundidad
        // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
        // también se les conoce como diccionarios para almacenar datos en base a un nombre.
        Map<String, Integer> options = new HashMap();
        options.put("Update", 1);
        options.put("Delete", 2);
        options.put("Add / Create", 3);
        options.put("List", 4);
        options.put("Exit", 5);

        Object[] opArray = options.keySet().toArray();

        do {
            Object option = JOptionPane.showInputDialog(null,
                    "Please, select an option",
                    "Products system",
                    JOptionPane.INFORMATION_MESSAGE, null, opArray, opArray[0]);

            if (option == null) {
                JOptionPane.showMessageDialog(null, "You must select an operation");
            } else {
                optionIndex = options.get(option.toString());


                switch (optionIndex) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "User updated successfully");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "User deleted successfully");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "User created successfully");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "User list: ");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Exiting program");
                        System.exit(0);

                }
            }
        } while (optionIndex != 5);

    }
}
