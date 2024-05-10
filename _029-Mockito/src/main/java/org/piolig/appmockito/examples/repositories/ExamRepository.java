package org.piolig.appmockito.examples.repositories;

import org.piolig.appmockito.examples.models.Exam;

import java.util.List;

public interface ExamRepository {
    List<Exam> findAll();
}
