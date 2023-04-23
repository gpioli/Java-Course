package org.gpioli.example;

import org.gpioli.pooinheritance.InternationalStudent;
import org.gpioli.pooinheritance.Person;
import org.gpioli.pooinheritance.Professor;
import org.gpioli.pooinheritance.Student;

public class InheritanceExampleToStringOverride {
    public static void main(String[] args) {

        System.out.println("====== Creating an instance of the student class ======");
        Student student = new Student("Gaston", "Pioli", 32, "ORT");
        student.setSpanishGrade(5.5);
        student.setMathsGrade(6.3);
        student.setHistoryGrade(4.9);
        student.setEmail("gaston.pioli@college.com");

        System.out.println("====== Creating an instance of the InternationalStudent class ======");
        InternationalStudent intStudent = new InternationalStudent("Peter", "Gosling", "Australia");
        intStudent.setAge(25);
        intStudent.setCollegeName("ORT");
        intStudent.setSpanishGrade(6.2);
        intStudent.setMathsGrade(6.5);
        intStudent.setHistoryGrade(5.8);
        intStudent.setLanguagesGrade(6.8);
        intStudent.setEmail("intAlumn@college.com");

        System.out.println("====== Creating an instance of the Professor class ======");
        Professor professor = new Professor("Luci", "Perez", "Mathematics");
        professor.setAge(37);
        professor.setEmail("luci@college.com");


        System.out.println("=========  ==========");

        print(student);
        print(intStudent);
        print(professor);

    }

    public static void print(Person person){
        System.out.println("========= = ==========");
        System.out.println(person);

    }
}
