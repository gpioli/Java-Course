public class S13_002_MatrixStringForII {

    public static void main(String[] args) {
        String[][] names = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"} };

        System.out.println("Iterating with foreach: ");
        for(String[] row: names) {
            for (String name: row) {
                System.out.print(name + "\t");
            }
            System.out.println();

        }

    }
}
