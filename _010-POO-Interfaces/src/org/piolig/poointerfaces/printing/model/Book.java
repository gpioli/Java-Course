package org.piolig.poointerfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

//
public class Book implements Printable {

    private List<Printable> pages;
    private String author;
    private String title;
    private Genre genre;

    public Book(String author, String title, Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Page page) {
        pages.add(page);
        return this;
    }

    @Override
    public String print(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n===BOOK INFORMATION===\n")
                .append("Title: ").append(this.title).append("\n")
                .append("Author: ").append(this.author).append("\n")
                .append("Genre: ").append(this.genre).append("\n");
        for (Printable page: pages){
            sb.append(page.print()).append("\n");
        }
        return sb.toString();

    }
}
