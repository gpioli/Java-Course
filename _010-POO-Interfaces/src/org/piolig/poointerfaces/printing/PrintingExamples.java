package org.piolig.poointerfaces.printing;

import org.piolig.poointerfaces.printing.model.Curriculum;
import org.piolig.poointerfaces.printing.model.Leaf;
import org.piolig.poointerfaces.printing.model.Report;

public class PrintingExamples {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("John Doe", "Engineer", "Labour data...");
        cv.addExperiences("Java")
                .addExperiences("Oracle DBA")
                .addExperiences("Spring Framework")
                .addExperiences("FullStack developer")
                .addExperiences("Angular");

        Report report = new Report("Martin Fowler", "James Bond", "Study on microservices");

        print(cv);
        print(report);


    }


    public static void print(Leaf printable){
        System.out.println(printable.print());
    }

}
