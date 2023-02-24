public class S4_012_OperatorsPrecedence {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double mean = (i + j + k) / 3d;
        System.out.println("mean = " + mean);

        mean = i + j + k / 3d * 10; //14 + 8 + (20/3) * 10 -> 14 + 8 + 6.6*10 -> 14 + 8 + 66.6 = 88.66
        System.out.println("mean = " + mean);
        
        mean = ++i + j-- + k / 3d * 10; // (15 + 8) + 66.6  || REMEMBER THAT WHAT IS DECREMENTED IS J AFTER THE OPERATION
        System.out.println("mean = " + mean);

    }
}
