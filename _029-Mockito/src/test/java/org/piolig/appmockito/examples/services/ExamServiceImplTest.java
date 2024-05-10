package org.piolig.appmockito.examples.services;

import org.junit.jupiter.api.Test;
import org.piolig.appmockito.examples.models.Exam;
import org.piolig.appmockito.examples.repositories.ExamRepository;
import org.piolig.appmockito.examples.repositories.ExamRepositoryImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExamServiceImplTest {

    @Test
    void findExamByName() {
        ExamRepository repository = mock(ExamRepository.class);
        ExamService service = new ExamServiceImpl(repository);
        List<Exam> data = Arrays.asList(new Exam(5L, "Maths"), new Exam(6L, "Language"),
                new Exam(7L, "History"));
        Optional<Exam> exam = service.findExamByName("Maths");
        when(repository.findAll()).thenReturn(data);
        assertTrue(exam.isPresent());
        assertEquals(5L, exam.orElseThrow().getId());
        assertEquals("Maths", exam.get().getName());
    }

    @Test
    void findExamByNameEmptyList() {
        ExamRepository repository = mock(ExamRepository.class);
        ExamService service = new ExamServiceImpl(repository);
        List<Exam> data = Collections.emptyList();
        Optional<Exam> exam = service.findExamByName("Maths");
        when(repository.findAll()).thenReturn(data);
        assertTrue(exam.isPresent());
        assertEquals(5L, exam.orElseThrow().getId());
        assertEquals("Maths", exam.get().getName());
    }
}