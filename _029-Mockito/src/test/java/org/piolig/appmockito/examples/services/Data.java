package org.piolig.appmockito.examples.services;

import org.piolig.appmockito.examples.models.Exam;

import java.util.Arrays;
import java.util.List;

public class Data {
    public final static List<Exam> EXAMS = Arrays.asList(new Exam(5L, "Maths"), new Exam(6L, "Language"),
            new Exam(7L, "History"));

    public final static List<String> QUESTIONS = Arrays.asList("arithmetic", "integrals", "derivate", "trigonometry",
            "geometry");

    public final static Exam EXAM = new Exam(null, "Physics");
}
