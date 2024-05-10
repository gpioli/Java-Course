package org.piolig.appmockito.examples.repositories;

import org.piolig.appmockito.examples.models.Exam;

import java.util.Arrays;
import java.util.List;

public class ExamRepositoryImpl implements ExamRepository {


    @Override
    public List<Exam> findAll() {
        return Arrays.asList(new Exam(5L, "Maths"), new Exam(6L, "Language"),
                new Exam(7L, "History"));
    }
}
