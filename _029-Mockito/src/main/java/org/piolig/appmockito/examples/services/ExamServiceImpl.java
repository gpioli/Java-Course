package org.piolig.appmockito.examples.services;

import org.piolig.appmockito.examples.models.Exam;
import org.piolig.appmockito.examples.repositories.ExamRepository;

import java.util.Optional;

public class ExamServiceImpl implements ExamService {

    private ExamRepository examRepository;

    public ExamServiceImpl(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }
    @Override
    public Optional<Exam> findExamByName(String name) {
        return examRepository.findAll().stream()
                .filter(e -> e.getName().equals(name))
                .findFirst();
    }
}
