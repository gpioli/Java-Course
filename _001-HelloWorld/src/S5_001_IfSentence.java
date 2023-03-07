public class S5_001_IfSentence {

    public static void main(String[] args) {

        float scoreMean = 6.5f;

        if (scoreMean >= 6.5) {
            System.out.println("Congratulations, excellent grades!");
        } else if (scoreMean >= 6.0) {
            System.out.println("Very Good grades! ");
        } else if (scoreMean >= 5.5) {
            System.out.println("Good grades!");
        } else if (scoreMean >= 5.0) {
            System.out.println("Regular grades. You need to study more!");
        } else if (scoreMean >= 4.0) {
            System.out.println("Insufficient. You need to study more!");
        } else {
            System.out.println("Failed. You need to study more!");
        }

    }
}
