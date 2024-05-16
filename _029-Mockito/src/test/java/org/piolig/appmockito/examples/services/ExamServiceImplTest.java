package org.piolig.appmockito.examples.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.piolig.appmockito.examples.models.Exam;
import org.piolig.appmockito.examples.repositories.ExamRepository;
import org.piolig.appmockito.examples.repositories.QuestionsRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExamServiceImplTest {

    @Mock
    ExamRepository repository;
    @Mock
    QuestionsRepository questionsRepository;

    @InjectMocks
    ExamServiceImpl service;

    @BeforeEach
    void setUp() {
//        repository = mock(ExamRepository.class);
//        questionsRepository = mock(QuestionsRepository.class);
//        service = new ExamServiceImpl(repository, questionsRepository);

    }

    @Test
    void findExamByName() {

        when(repository.findAll()).thenReturn(Data.EXAMS);
        Optional<Exam> exam = service.findExamByName("Maths");

        assertTrue(exam.isPresent());
        assertEquals(5L, exam.orElseThrow().getId());
        assertEquals("Maths", exam.get().getName());
    }

    @Test
    void findExamByNameEmptyList() {
        List<Exam> data = Collections.emptyList();

        Optional<Exam> exam = service.findExamByName("Maths");

        when(repository.findAll()).thenReturn(data);
        assertFalse(exam.isPresent());

    }

    @Test
    void testExamQuestions() {
        when(repository.findAll()).thenReturn(Data.EXAMS);
        when(questionsRepository.findQuestionsByExamId(anyLong())).thenReturn(Data.QUESTIONS);
        Exam exam = service.findExamByNameWithQuestions("Maths");
        assertEquals(5, exam.getQuestions().size());
        assertTrue(exam.getQuestions().contains("integrals"));

    }

    @Test
    void testExamQuestionsVerify() {
        when(repository.findAll()).thenReturn(Data.EXAMS);
        when(questionsRepository.findQuestionsByExamId(anyLong())).thenReturn(Data.QUESTIONS);
        Exam exam = service.findExamByNameWithQuestions("Maths");
        assertEquals(5, exam.getQuestions().size());
        assertTrue(exam.getQuestions().contains("integrals"));
        verify(repository).findAll();
        verify(questionsRepository).findQuestionsByExamId(5L);
    }

    @Test
    void testDoesntExistsExam() {
        when(repository.findAll()).thenReturn(Collections.emptyList());
        when(questionsRepository.findQuestionsByExamId(anyLong())).thenReturn(Data.QUESTIONS);
        Exam exam = service.findExamByNameWithQuestions("Maths");
        assertNull(exam);
        verify(repository).findAll();
        verify(questionsRepository).findQuestionsByExamId(5L);
    }

    @Test
    void testSaveExam() {
        // GIVEN
        Exam newExam = Data.EXAM;
        newExam.setQuestions(Data.QUESTIONS);

        when(repository.save(any(Exam.class))).then(new Answer<Exam>() {

            Long sequence = 8L;
            @Override
            public Exam answer(InvocationOnMock invocationOnMock) throws Throwable {
                Exam exam = invocationOnMock.getArgument(0);
                exam.setId(sequence++);
                return exam;
            }
        });

        // WHEN
        Exam exam = service.save(newExam);

        // THEN
        assertNotNull(exam.getId());
        assertEquals(8L, exam.getId());
        assertEquals("Physics", exam.getName());

        verify(repository).save(any(Exam.class));
        verify(questionsRepository).saveVarious(anyList());
    }
}