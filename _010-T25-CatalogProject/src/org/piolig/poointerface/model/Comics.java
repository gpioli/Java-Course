package org.piolig.poointerface.model;

import java.util.Date;

public class Comics extends Book {

    private String character;
    public Comics(Integer price, Date publicationDate, String author, String title, String editorial, String character) {
        super(price, publicationDate, author, title, editorial);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    @Override
    public Double getSellPrice() {
        return getPrice() * 0.85;
    }
}
