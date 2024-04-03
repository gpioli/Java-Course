package org.piolig.files.example;

import org.piolig.files.example.service.ServiceFile;

public class ReadFileExample {
    public static void main(String[] args) {

        String fileName = "/home/milton/Escritorio/JAV/Java-Course/_22-FileHandling/Java/File/java.txt";
        ServiceFile service = new ServiceFile();

        System.out.println(service.readFile(fileName));

    }
}
