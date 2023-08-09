package org.piolig.lambda.model;

import java.util.Map;

@FunctionalInterface
public interface CountWords {

    Map<String, Integer> countWords(String phrase);

}
