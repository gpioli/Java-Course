package org.piolicompany.model;

public class NonPerishable extends Product{

    private int content;
    private int calories;

    public NonPerishable(String name, Double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tcontent: " + content +
                "\n\tcalories: " + calories;
    }
}
