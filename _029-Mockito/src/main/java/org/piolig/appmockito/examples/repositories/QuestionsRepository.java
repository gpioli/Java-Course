package org.piolig.appmockito.examples.repositories;

import java.util.List;

public interface QuestionsRepository {

    List<String> findQuestionsByExamId(Long id);
    void saveVarious(List<String> questions);

}
