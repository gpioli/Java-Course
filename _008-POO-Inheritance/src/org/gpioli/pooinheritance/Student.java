package org.gpioli.pooinheritance;

public class Student extends Person {
    
    private String collegeName;
    private double mathsGrade;
    private double spanishGrade;
    private double historyGrade;

    public Student() {
        super(); // this is not necessary, but we can create the constructor of the super class explicitly
        System.out.println("Student: initializing constructor");
    }

    public Student(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    public Student(String firstName, String lastName, int age, String collegeName){
        super(firstName, lastName, age);
        this.collegeName = collegeName;
    }

    public Student(String firstName, String lastName, int age,
                   String collegeName, double mathsGrade, double historyGrade, double spanishGrade){
        this(firstName, lastName, age, collegeName);
        this.mathsGrade = mathsGrade;
        this.historyGrade = historyGrade;
        this.spanishGrade = spanishGrade;
    }


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

    @Override
    public String salute(){
        String salute = super.salute();
        return salute + " I'm a student and my name is " + this.getFirstName() + ".";
    }

    public double calculateGradesMean(){
        //System.out.println("calculateGradesMean" + Student.class.getCanonicalName());
        return (historyGrade + spanishGrade + mathsGrade) / 3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncollegeName='" + collegeName + '\'' +
                ", mathsGrade=" + mathsGrade +
                ", spanishGrade=" + spanishGrade +
                ", historyGrade=" + historyGrade +
                ", grades mean: " + this.calculateGradesMean();
    }
}
