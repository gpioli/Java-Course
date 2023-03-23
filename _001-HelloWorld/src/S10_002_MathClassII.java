import java.util.Random;

public class S10_002_MathClassII {
    public static void main(String[] args) {

        double random = Math.random(); // gives us random values between 0-1
        System.out.println("random = " + random);

        random *=7; // random values from 0 to 6.9999
        System.out.println("random = " + random);




        double random2 = Math.random();
        String[] colours = {"blue", "red", "yellow", "white", "black", "green"};
        random2 *= colours.length;
        System.out.println("colours length = " + colours.length);
        random2 = Math.floor(random2);
        System.out.println("random = " + random2);
        System.out.println("colours[random] = " + colours[(int) random2]);


        // random class of java: more flexible than Math.random
        Random randomObj = new Random();

        // creating integers:
        int randInt = randomObj.nextInt();
        System.out.println("randInt = " + randInt);
        // creating random numbers between 15 and 25
        randInt = 15 + randomObj.nextInt(25 - 15);
        System.out.println("randInt 0 to 15 = " + randInt);

        // creating longs...
        long randLong = randomObj.nextLong();
        System.out.println("randLong = " + randLong);

    }
}
