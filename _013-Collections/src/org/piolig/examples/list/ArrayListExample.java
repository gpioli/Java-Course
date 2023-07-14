package org.piolig.examples.list;

import org.piolig.examples.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Here we use a lambda function to replace the ordering done in the compareTo method of the Student Class.
        List<Student> sa = new ArrayList<>();
        System.out.println(sa + ", size: " + sa.size());
        System.out.println(sa + ", is empty? : " + sa.isEmpty());

        sa.add(new Student("Pato", 5.0));
        sa.add(new Student("Cata", 6.0));
        sa.add(new Student("Luci", 4.0));
        // this adds an item and moves al the items after if
        sa.add(2, new Student("Jano", 3.0));
        // set replaces the value, and no element is moved in the list
        sa.set(3, new Student("Andres", 3.0));

        System.out.println(sa + ", size: " + sa.size());

        System.out.println("==== Remove method ====");
        // Underneath, the remove works with the equals method.
        // so in this case, only if grade and name are the same will remove the element
        sa.remove(new Student("Jano", 3.0));
        // we can also delete by index
        sa.remove(0);

        System.out.println(sa + ", is empty? : " + sa.isEmpty());

        boolean b = sa.contains(new Student("Jano", 3.0));
        System.out.println("Is Jano in the ArrayList? " + b);

        // Converting the array list to array:
        System.out.println("Elements from the array:");
        Object a[] = sa.toArray();
        for(int i=0; i<a.length;i++){
            System.out.println(i + ": " + a[i]);
        }


    }
}
