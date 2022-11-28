public class CharCaseASCIIConverter {
    public static char toLowerCase(char c){
        int charASCIICode = (int) c;     
        if(charASCIICode >= 65 && charASCIICode <= 90)
            return (char) (charASCIICode + 32);

        return c;
    }

    public static char toUpperCase(char c){
        int charASCIICode = (int) c;
        if(charASCIICode >= 97 && charASCIICode <= 122)
            return (char) (charASCIICode - 32);

        return c;
    }
}
