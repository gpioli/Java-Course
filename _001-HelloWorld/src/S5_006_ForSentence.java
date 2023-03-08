public class S5_006_ForSentence {
    public static void main(String[] args) {

        System.out.println("First for iteration");
        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }

        System.out.println("Second for iteration");
        int j = 0;
        for(; j <= 5; j++){
            System.out.println("j = " + j);
        }

        System.out.println("j = " + j);

        System.out.println("Third for iteration");
        int x = 0;
        for(; ; ){

            if (x >= 5) {
                break;
            }
            System.out.println("x = " + x);
            x++;
        }

        System.out.println("Fourth for iteration");
        for(int k = 10; k >= 0; k--){
            System.out.println("k = " + k);
        }

        // Skiping a cycle
        System.out.println("Fifth for iteration");
        for(int h = 0; h <= 20; h++){
            if(h % 2 == 0){
                continue;
            }
            System.out.println("h = " + h);
        }
    }

}
