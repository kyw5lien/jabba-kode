public class CharCaseASCIIConversion {
    public static char toLowerCase(char c){     
        if((int) c >= 65 && (int) c <= 90)
            return (char) ((int) c + 32);

        return c;
    }

    public static char toUpperCase(char c){
        if((int) c >= 97 && (int) c <= 122)
            return (char) ((int) c - 32);

        return c;
    }
}
