package org.piolig.appmockito.examples.services;

import org.piolig.appmockito.examples.models.Exam;

import java.util.Optional;

public interface ExamService {

    Optional<Exam> findExamByName(String name);

}
