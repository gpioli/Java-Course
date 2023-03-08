import javax.swing.*;

public class S5_007_ForSentenceArray {
    public static void main(String[] args) {

        String[] names = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};

        int count = names.length;
        for(int i = 0; i < count; i++) {
            if(names[i].equalsIgnoreCase("andres") ||
                    names[i].equalsIgnoreCase("pepa")){
                continue;
            }

            System.out.println("name = " + names[i]);
        }

        System.out.println("Second iteration with contains");
        for(int i = 0; i < count; i++) {
            if(names[i].toLowerCase().contains("AndRes".toLowerCase()) ||
                    names[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;
            }

            System.out.println("name = " + names[i]);
        }

        String search = JOptionPane.showInputDialog("Please enter a name, i.e.: \"Pepe\" ");
        System.out.println("search = " + search);

        boolean found = false;
        for(int i = 0; i < count; i++){
            if (names[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found){
            JOptionPane.showMessageDialog(null,search + " was found in the system.");
        } else {
            JOptionPane.showMessageDialog(null, search + " was not found in the system.");
        }



    }
}
