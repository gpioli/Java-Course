public class S5_010_TagsSentencesLoops {
    public static void main(String[] args) {

        // this is a tag and allows us to indicate from which loop we want to <break> or <continue>
        loop1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue loop1;
                }
                System.out.print("i = " + i + ", j = " + j);
            }

        }

        System.out.println("\n \n =========================================");
        loopx:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break loopx;
                }
                System.out.print("i = " + i + ", j = " + j);
            }

        }

        System.out.println("\n \n =========================================");
        System.out.println("Hours worked in the week:");
        loopA:
        for (int i = 1; i <= 7; i++) {

            System.out.println();
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Day " + i + ": weekend vacation");
                    continue loopA;
                }
                System.out.println("Day " + i + ", working at = " + j + " hours");
                j++;
            }

        }

    }

}

