package org.piolig.examples.list;

import org.piolig.examples.model.Student;

import java.util.*;

public class ListComparableComparatorExample {
    public static void main(String[] args) {

        // Here we use a lambda function to replace the ordering done in the compareTo method of the Student Class.
        List<Student> sa = new ArrayList<>();
        sa.add(new Student("Pato", 5.0));
        sa.add(new Student("Cata", 6.0));
        sa.add(new Student("Luci", 4.0));
        sa.add(new Student("Jano", 3.0));
        sa.add(new Student("Andres", 3.0));
        sa.add(new Student("Zeus", 2.0));
        // TreeSets detect repeated values with the compareTo method
        sa.add(new Student("Zeus", 3.0));
        sa.add(new Student("Lucas", 3.0));
        sa.add(new Student("Lucas", 2.0));
        // this overrides the default sorting in the Student class
        //Collections.sort(sa, (a, b) -> b.getGrade().compareTo(a.getGrade()));
        //sa.sort((a, b) -> b.getGrade().compareTo(a.getGrade()));
        //sa.sort(Comparator.comparing((Student a) -> a.getName()).reversed());
        // this does the same as the previous line
        sa.sort(Comparator.comparing(Student::getName).reversed());

        System.out.println(sa);

        System.out.println("\nIterating using Stream forEach");
        sa.forEach(System.out::println);

    }
}
