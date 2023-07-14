package org.piolig.examples.set;

import org.piolig.examples.model.Student;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExampleComparable {
    public static void main(String[] args) {

        // Here we use a lambda function to replace the ordering done in the compareTo method of the Student Class.
        //Set<Student> sa = new TreeSet<>((a, b) -> a.getGrade().compareTo(b.getGrade()));
        Set<Student> sa = new TreeSet<>(comparing(Student::getGrade));
        sa.add(new Student("Pato", 5.0));
        sa.add(new Student("Cata", 6.0));
        sa.add(new Student("Luci", 4.0));
        sa.add(new Student("Jano", 3.0));
        sa.add(new Student("Zeus", 2.0));
        // TreeSets detect repeated values with the compareTo method
        sa.add(new Student("Lucas", 2.0));

        System.out.println(sa);


    }
}
