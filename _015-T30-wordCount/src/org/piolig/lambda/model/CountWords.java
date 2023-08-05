package org.piolig.lambda.model;

import java.util.HashMap;

@FunctionalInterface
public interface CountWords {

    HashMap<String, Integer> countWords(String phrase);

}
