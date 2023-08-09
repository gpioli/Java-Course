package org.piolig.lambda.model;

import java.util.*;

public class WordCountExample {

    public static void main(String[] args) {

        CountWords lambdaWordCount = (phrase) -> {
            Map<String, Integer> phraseWordCount = new HashMap<>();

            String[] phraseWords = phrase.split(" ");

            for (String word : phraseWords) {
                if (!phraseWordCount.containsKey(word)) {
                    phraseWordCount.put(word, 1);
                } else {
                    phraseWordCount.put(word, phraseWordCount.get(word) + 1);
                }
            }

            String mostRepeatedWord = "";
            Integer repetitions = 0;

            for (String key : phraseWordCount.keySet()) {
                if (phraseWordCount.get(key) > repetitions) {
                    mostRepeatedWord = key;
                    repetitions = phraseWordCount.get(key);
                }
            }

            String finalMostRepeatedWord = mostRepeatedWord;
            Integer finalRepetitions = repetitions;

            // Ways of returning a map:
            return Collections.singletonMap(finalMostRepeatedWord, finalRepetitions);

            /*
            HashMap<String, Integer> r = new HashMap<String, Integer>() {
                {
                    put(finalMostRepeatedWord, finalRepetitions);
                }
            };

            return r;


             */
        };

        String phrase = "I love my dog Pancho. He is the best dog of all. Pancho likes playing a lot and sleeping " +
                "at least 10 hours a day. Pancho is quite sociable with humans, but doesn't get along well with other" +
                " dogs. ";

        Map<String, Integer> wordWithTheMostRepetitions = lambdaWordCount.countWords(phrase);

        for(String key: wordWithTheMostRepetitions.keySet()) {
            System.out.println("The word that repeats more times is: '" + key + "' with" +
                    " " + wordWithTheMostRepetitions.get(key) + " repetitions."); // The word that repeats more times is: 'Pancho' with 2 repetitions.
        }


    }

}
