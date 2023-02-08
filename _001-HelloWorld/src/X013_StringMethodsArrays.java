public class X013_StringMethodsArrays {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        // here we create an array of elements of char type:
        char[] array = trabalenguas.toCharArray();
        int length = array.length; // lengths should be the same
        for(int i = 0; i < length; i++){
            System.out.print(array[i]);
        };
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        // here we create an array of elements of String type:

        String[] array2 = trabalenguas.split("a");
        for(String c : array2){ // here we use an enhanced for
            System.out.println(c);
        }

        String file = "some.image.pdf";
        String[] fileArr = file.split("\\."); // we have to escape the special character .
        for(String c : fileArr){
            System.out.println(c);
        }

        // obtaining the extension:
        System.out.println("extension = " + fileArr[fileArr.length - 1]);

    }
}
