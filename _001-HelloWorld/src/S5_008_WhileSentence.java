public class S5_008_WhileSentence {
    public static void main(String[] args) {

        System.out.println("First while iteration");
        // 'for's are faster than 'while's
        int i = 0;
        while(i < 5){
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Second while iteration");

        i = 0;
        boolean proof = true;

        while(proof){

            if(i == 7){
                proof = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Do while iteration");
        proof = false;

        do {
            System.out.println("This prints at least one time");
        } while (proof);

        System.out.println("Second Do while iteration");
        do {
            if (i == 10){
                proof = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (proof);


    }
}
