package org.piolig.patterns.composite.example;

import org.piolig.patterns.composite.Directory;
import org.piolig.patterns.composite.File;

public class CompositeFindExample {
    public static void main(String[] args) {

        Directory doc = new Directory("Documents");
        Directory java = new Directory("Java");

        java.addComponent(new File("composite-patron.docx"));
        Directory stream = new Directory("Api Stream");
        stream.addComponent(new File("stream-map.docx"));

        java.addComponent(stream);

        doc.addComponent(java);
        doc.addComponent(new File("cv.docx"));
        doc.addComponent(new File("logo.jpeg"));

        boolean found = doc.search("composite-patron.docx");
        System.out.println("Found \"composite-patron.docx\": " + found);

        found = doc.search("Api Stream");
        System.out.println("Found \"Api Stream\": " + found);


        found = doc.search("cvdocx");
        System.out.println("Found \"cv.docx\": " + found);

    }
}
