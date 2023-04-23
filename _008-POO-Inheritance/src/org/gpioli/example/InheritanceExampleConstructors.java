package org.gpioli.example;

import org.gpioli.pooinheritance.InternationalStudent;
import org.gpioli.pooinheritance.Person;
import org.gpioli.pooinheritance.Professor;
import org.gpioli.pooinheritance.Student;

public class InheritanceExampleConstructors {
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
        System.out.println("Printing Person type data: ");
        System.out.println("First name: " + person.getFirstName() + ", Last name: " + person.getLastName() +
                ", age: " + person.getAge() + ", email: " + person.getEmail());
        if (person instanceof Student) {
            System.out.println("Printing Student type data: ");
            System.out.println("College: " + ((Student) person).getCollegeName());
            System.out.println("Maths grades: " + ((Student) person).getMathsGrade());
            System.out.println("History grades: " + ((Student) person).getHistoryGrade());
            System.out.println("Spanish grades: " + ((Student) person).getSpanishGrade());

            if (person instanceof InternationalStudent) {
                System.out.println("Printing InternationalStudent type data: ");
                System.out.println("Languages grade: " + ((InternationalStudent) person).getLanguagesGrade());
                System.out.println("Country: " + ((InternationalStudent) person).getCountry());
            }
            System.out.println("================ Grades mean override =====================");
            System.out.println("Grades mean: " + ((Student) person).calculateGradesMean());
            System.out.println("===========================================================");

        }

        if (person instanceof Professor) {
            System.out.println("Printing Professor type data: ");
            System.out.println("Subject: " + ((Professor) person).getSubject());
        }



        System.out.println("=============== Override salute =================");

        System.out.println(person.salute());

        System.out.println("===============================================");

    }
}
