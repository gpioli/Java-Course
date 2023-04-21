package org.gpioli.example;

import org.gpioli.pooinheritance.Professor;
import org.gpioli.pooinheritance.Student;

public class InheritanceExample {
    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("Gaston");
        student.setLastName("Pioli");

        Professor professor = new Professor();
        professor.setFirstName("Luci");
        professor.setLastName("Perez");
        professor.setSubject("Mathematics");

        System.out.println(student.getFirstName() + " " + student.getLastName());
        System.out.println(professor.getSubject() + " professor: " + professor.getFirstName() +
                " " + professor.getLastName());

    }
}
