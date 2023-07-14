package org.piolig.examples.model;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private Double grade;

    public Student() {
    }

    public Student(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ", grade=" + grade;
    }

    @Override
    public int compareTo(Student s) {
/*        if (this.name == null) {
            return 0;
        }
        return this.name.compareTo(s.name);*/
        if (this.grade.equals(s.grade)) {
            return 0;
        }
        return this.grade.compareTo(s.grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
