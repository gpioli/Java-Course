package org.piolig.files.example.service;

import java.io.*;
import java.util.Scanner;

public class ServiceFile {

    public void createFile(String name) {
        File file = new File(name);
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.append("Hi, what's up folks!? \n")
                    .append("Later, Lucas!\n");
            buffer.close();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 2nd way:
    // this does the same, but with a functionality implemented in java 7 (similar to what's available in python
    // 'with open')
    public void createFile2(String name) {
        File file = new File(name);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true))){

            buffer.append("2nd way | Hi, what's up folks!? \n")
                    .append("2nd way | Later, Lucas!\n");
            System.out.println("File created successfully (2nd way).");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 3rd way:

    public void createFile3(String name) {
        File file = new File(name);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))){

            printWriter.println("3rd way | Hi, what's up folks!? ");
            printWriter.append("3rd way | Later, Lucas!");
            System.out.println("File created successfully (3rd way).");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFile(String name){
        StringBuilder sb = new StringBuilder();
        File file = new File(name);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ( (line = reader.readLine()) != null ) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String readFile2(String name){
        StringBuilder sb = new StringBuilder();
        File file = new File(name);

        try (Scanner s = new Scanner(file)) {

            s.useDelimiter("\n");
            while ( s.hasNext() ) {
                sb.append(s.next()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

}
