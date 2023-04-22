package org.gpioli.example;

import org.gpioli.pooinheritance.InternationalStudent;
import org.gpioli.pooinheritance.Professor;
import org.gpioli.pooinheritance.Student;

public class InheritanceExample {
    public static void main(String[] args) {

        System.out.println("====== Creating an instance of the student class ======");
        Student student = new Student();
        student.setFirstName("Gaston");
        student.setLastName("Pioli");
        student.setAge(32);
        student.setCollegeName("ORT");
        student.setSpanishGrade(5.5);
        student.setMathsGrade(6.3);
        student.setHistoryGrade(4.9);

        System.out.println("====== Creating an instance of the InternationalStudent class ======");
        InternationalStudent intStudent = new InternationalStudent();
        intStudent.setFirstName("Peter");
        intStudent.setLastName("Gosling");
        intStudent.setCountry("Australia");
        intStudent.setAge(25);
        intStudent.setCollegeName("ORT");
        intStudent.setSpanishGrade(6.2);
        intStudent.setMathsGrade(6.5);
        intStudent.setHistoryGrade(5.8);
        intStudent.setLanguagesGrade(6.8);

        System.out.println("====== Creating an instance of the Professor class ======");
        Professor professor = new Professor();
        professor.setFirstName("Luci");
        professor.setLastName("Perez");
        professor.setSubject("Mathematics");


        System.out.println("=========  ==========");
        System.out.println(student.getFirstName() + " " + student.getLastName());
        System.out.println(professor.getSubject() + " professor: " + professor.getFirstName() +
                " " + professor.getLastName());

        System.out.println(intStudent.getFirstName() + " " +
                intStudent.getLastName() + " " +
                intStudent.getCollegeName() + " " +
                intStudent.getCountry());


        Class aClass = intStudent.getClass();
        while (aClass.getSuperclass() != null) {
            String subClass = aClass.getName();
            String superClass = aClass.getSuperclass().getName();
            System.out.println(subClass + " is a descendant of super class " + superClass);
            aClass = aClass.getSuperclass();
        }

    }
}
