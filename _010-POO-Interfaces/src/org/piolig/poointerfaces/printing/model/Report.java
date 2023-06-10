package org.piolig.poointerfaces.printing.model;

public class Report extends Leaf{

    private String author;
    private String reviewer;

    public Report(String author, String reviewer, String content) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "Report written by: " + author +
                "Reviewed by: " + reviewer +
                "\n " + this.content;
    }
}
