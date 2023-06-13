package org.piolig.poointerfaces.printing.model;

public class Report extends Sheet implements Printable{

    private Person author;
    private Person reviewer;

    public Report(Person author, Person reviewer, String content) {
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
