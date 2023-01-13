public class X004_CharPrimitives {
    public static void main(String[] args) {
        
        char character = '0';
        // char character = '10' -> this wont work, as char only allows one character
        System.out.println("character = " + character);
        char at = '\u0040';
        System.out.println("at = " + at); // we can see the unicode using "caracteres" app in ubuntu
        // this will do the same, only that in decimal code
        char atDec = 64;
        System.out.println("atDec = " + atDec);
        System.out.println("atDec = at: " + (at == atDec));
        char atSymbol = '@';
        System.out.println("atSymbol = at: " + (atSymbol == at));

        // More special chars //

        char space = ' '; // = char space = '\0020';
        char back = '\b'; //  // backspace eliminates the previous char
        char tab = '\t'; //  tabulator
        char newLine = '\n'; // The following both are similar, but they depend on the OS
        char returnLine = '\r'; //
        // If we are not sure which to use, we can use:
        System.out.println(System.lineSeparator());

        System.out.println("double type corresponds in bytes to " + Character.BYTES);
        System.out.println("double type corresponds in bites to " + Character.SIZE);
        System.out.println("double value of a int: " + Character.MAX_VALUE); // blank space
        System.out.println("double value of a int: " + Character.MIN_VALUE); //

    }
}
