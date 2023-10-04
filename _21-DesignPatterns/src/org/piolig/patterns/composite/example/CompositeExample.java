package org.piolig.patterns.composite.example;

import org.piolig.patterns.composite.Directory;
import org.piolig.patterns.composite.File;

public class CompositeExample {
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

        System.out.println(doc.show(0));

    }
}
