public class S5_011_FindTagsLoopSentences {
    public static void main(String[] args) {

        String phrase = "tres tristes tigres tragan trigo en un trigal trigo";

        int counter = 0;
        String word = "trigo";
        int phraseLen = phrase.length();
        int wordLen = word.length();

        search:
        for (int i = 0; i <= phraseLen - wordLen; i++) {
            int k = i;
            for(int j = 0; j < wordLen; j++){
                if (phrase.charAt(k++) != word.charAt(j)) {
                    continue search;
                }
            }
            counter++;
            i = i + wordLen; // this optimizes the process

        }
        System.out.println("Found the word " + word + " " + counter + " time(s) in the phrase.");
    }

}

