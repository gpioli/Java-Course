package org.piolig.lambda.model;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.*;

public class WordCountExample {

    public static void main(String[] args) {

        CountWords lambdaWordCount = (phrase) -> {
            Map<String, Integer> phraseWordCount = new HashMap<>();

            List<String> phraseWords = Arrays.asList(phrase.split(" "));

            for(String word: phraseWords) {
                if (!phraseWordCount.containsKey(word)){
                    phraseWordCount.put(word, 1);
                } else {
                    phraseWordCount.put(word, phraseWordCount.get(word) + 1);
                }
            };

            String mostRepeatedWord = "";
            Integer repetitions = 0;

            for(String key : phraseWordCount.keySet()){
                if (phraseWordCount.get(key) > repetitions) {
                    mostRepeatedWord = key;
                    repetitions = phraseWordCount.get(key);
                }
            }

            return mostRepeatedWord;

        };

        String phrase = "I love my dog Pancho. He is the best dog of all. Pancho likes playing a lot, and sleeping " +
                "for several hours a day. Pancho is quite sociable with humans, but doesn't get along well with other" +
                " dogs. ";

        String wordWithTheMostRepetitions = lambdaWordCount.countWords(phrase);
        System.out.println(wordWithTheMostRepetitions);

    }

}
