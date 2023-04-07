public class S13_002_MatrixStringFor {

    public static void main(String[] args) {
        String[][] names = new String[3][2];

        names[0][0] = "Pepe";
        names[0][1] = "Pepa";
        names[1][0] = "Josefa";
        names[1][1] = "Paco";
        names[2][0] = "Lucas";
        names[2][1] = "Pancha";

        System.out.println("Iterating with for: ");
        for(int i = 0; i < names.length; i++) {

            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + "\t");
            }
            System.out.println();
        }
        /*Prints:
        * Pepe	Pepa
        Josefa	Paco
        Lucas	Pancha
        *  */
        System.out.println();

        System.out.println("Iterating with foreach: ");
        for(String[] row: names) {
            for (String name: row) {
                System.out.print(name + "\t");
            }
            System.out.println();

        }

    }
}
