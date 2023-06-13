package org.piolig.poointerfaces.printing;

import org.piolig.poointerfaces.printing.model.*;

import static org.piolig.poointerfaces.printing.model.Genre.*;

public class PrintingExamples {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Person("John", "Doe"), "Engineer", "Labour data...");
        cv.addExperiences("Java")
                .addExperiences("Oracle DBA")
                .addExperiences("Spring Framework")
                .addExperiences("FullStack developer")
                .addExperiences("Angular");

        Report report = new Report(new Person("Martin", "Fowler"),
                new Person("James", "Gosling"), "Study on microservices");

        Book book = new Book(new Person("Erich", "Gamma"),
                "Design Patterns: reusable elements POO", EDUCATION);
        book.addPage(new Page("Singleton pattern"))
                .addPage(new Page("Watcher patterns"))
                .addPage(new Page("Factory pattern"))
                .addPage(new Page("Composite patterns"))
                .addPage(new Page("Facade patterns"));

        print(cv);
        print(report);
        // this wont work, as a book doesnt extends from Sheet
        // print(book);

        // We will fix this by creating an interface (see Printable, which now is implemented in almost every class):

        print(book);


    }


    public static void print(Printable printable) {
        System.out.println(printable.print());
    }

}
