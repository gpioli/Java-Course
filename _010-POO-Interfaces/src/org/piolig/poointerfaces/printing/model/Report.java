package org.piolig.poointerfaces.printing.model;

public class Report extends Sheet implements Printable{

    private String author;
    private String reviewer;

    public Report(String author, String reviewer, String content) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "\n===REPORT INFORMATION===" +
                "\nReport written by: " + author +
                "\nReviewed by: " + reviewer +
                "\n" + this.content;
    }
}
