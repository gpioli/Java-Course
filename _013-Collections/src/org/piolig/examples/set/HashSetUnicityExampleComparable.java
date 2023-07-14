package org.piolig.examples.set;

import org.piolig.examples.model.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetUnicityExampleComparable {
    public static void main(String[] args) {

        // Here we use a lambda function to replace the ordering done in the compareTo method of the Student Class.
        Set<Student> sa = new HashSet<>();
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

        System.out.println(sa);

        System.out.println("\nIterating using a foreach");
        for(Student s: sa){
            System.out.println(s);
        }

        System.out.println("\nIterating using while and iterator");
        Iterator<Student> it = sa.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        System.out.println("\nIterating using Stream forEach");
        sa.forEach(System.out::println);

    }
}
