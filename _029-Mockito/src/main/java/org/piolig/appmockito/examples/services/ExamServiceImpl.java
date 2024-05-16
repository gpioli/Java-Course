package org.piolig.appmockito.examples.services;

import org.piolig.appmockito.examples.models.Exam;
import org.piolig.appmockito.examples.repositories.ExamRepository;
import org.piolig.appmockito.examples.repositories.QuestionsRepository;

import java.util.List;
import java.util.Optional;

public class ExamServiceImpl implements ExamService {

    private ExamRepository examRepository;
    private QuestionsRepository questionsRepository;

    public ExamServiceImpl(ExamRepository examRepository, QuestionsRepository questionsRepository) {
        this.examRepository = examRepository;
        this.questionsRepository = questionsRepository;
    }
    @Override
    public Optional<Exam> findExamByName(String name) {
        return examRepository.findAll().stream()
                .filter(e -> e.getName().equals(name))
                .findFirst();
    }

    @Override
    public Exam findExamByNameWithQuestions(String name) {
        Optional<Exam> optionalExam = findExamByName(name);
        Exam exam = null;
        if (optionalExam.isPresent()) {
            exam = optionalExam.orElseThrow();
            List<String> questions = questionsRepository.findQuestionsByExamId(exam.getId());
            exam.setQuestions(questions);
        }
        return exam;
    }

    @Override
    public Exam save(Exam exam) {
        if (!exam.getQuestions().isEmpty()) {
            questionsRepository.saveVarious(exam.getQuestions());
        }
        return examRepository.save(exam);
    }
}
