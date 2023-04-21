package org.gpioli.pooinheritance;

public class Student extends Person {
    
    private String collegeName;
    private double mathsGrade;
    private double spanishGrade;
    private double historyGrade;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public double getMathsGrade() {
        return mathsGrade;
    }

    public void setMathsGrade(double mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public double getSpanishGrade() {
        return spanishGrade;
    }

    public void setSpanishGrade(double spanishGrade) {
        this.spanishGrade = spanishGrade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        this.historyGrade = historyGrade;
    }
}
