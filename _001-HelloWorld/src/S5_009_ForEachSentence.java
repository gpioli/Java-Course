public class S5_009_ForEachSentence {
    public static void main(String[] args) {

        //working with foreach iteration (for iterables)
        int[] numbers = {1,3,7,9,11,13,14};

        for(int num: numbers){
            System.out.println("num = " + num);
        }

        String[] names = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};

        for(String name: names){
            System.out.println("name = " + name);
        }

    }
}
