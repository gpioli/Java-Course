public class X015_StringExampleFileExtension {
    public static void main(String[] args) {

        // function for obtaining file extension:

        String filename = "some_image.jpeg";
        System.out.println("filename.length() = " + filename.length());
        System.out.println("filename.substring(filename.length()-4) = " + filename.substring(filename.length()-4));

        int i = filename.lastIndexOf(".");
        System.out.println("filename extension = " + filename.substring(i+1));
        
    }
}
