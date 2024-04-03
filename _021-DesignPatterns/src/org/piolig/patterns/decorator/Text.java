package org.piolig.patterns.decorator;

public class Text implements Formateable{

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String giveFormat() {
        return getText();
    }
}
