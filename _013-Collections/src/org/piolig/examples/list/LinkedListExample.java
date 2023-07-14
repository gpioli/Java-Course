package org.piolig.examples.list;

import org.piolig.examples.model.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {

        // Here we use a lambda function to replace the ordering done in the compareTo method of the Student Class.
        LinkedList<Student> linked = new LinkedList<>();
        System.out.println(linked + ", size: " + linked.size());
        System.out.println(linked + ", is empty? : " + linked.isEmpty());

        linked.add(new Student("Pato", 5.0));
        linked.add(new Student("Cata", 6.0));
        linked.add(new Student("Luci", 4.0));
        linked.add(new Student("Jano", 3.0));
        linked.add( new Student("Andres", 3.0));

        System.out.println(linked + ", size: " + linked.size());

        linked.addFirst(new Student("Zeus", 5.0));
        linked.addLast(new Student("Athene", 6.0));
        System.out.println(linked + ", size: " + linked.size());

        // this methods are similar to getFirst y getLast, but in case of an empty list does not throw an error
        System.out.println("First element:" + linked.peek());
        System.out.println("Last element:" + linked.getLast());

        System.out.println("Index #2: " + linked.get(2));

        Student zeus = linked.removeFirst();
        System.out.println(linked + ", size: " + linked.size());

        Student a = new Student("Lucas", 5.0);
        linked.addLast(a);
        System.out.println("Index of Lucas: " + linked.indexOf(a));

        linked.set(3, new Student("Lalo", 7.0));
        System.out.println(linked + " size: " + linked.size());


        ListIterator<Student> li = linked.listIterator();

        System.out.println("Going forward through the LinkedList");
        while(li.hasNext()){
            Student x = li.next();
            System.out.println(x);
        }

        System.out.println("Going backward through the LinkedList");
        // now that we are at the end of the list, we can go back through the list
        while(li.hasPrevious()){
            Student x = li.previous();
            System.out.println(x);
        }

    }
}
