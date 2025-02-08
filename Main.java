public class Main {
    public static void main(String[] args) {
        //System.out.println(Compress("abc"));
        System.out.println(Decompress("a10b2"));
    }

    public static String Compress(String text) {

        if (text == null || text.isEmpty()) {
            return "";
        }

        String newString = "";
        char lastChar = text.charAt(0);
        int numOfReps = 1;

        for(int i = 1; i < text.length(); i++) {
            if(text.charAt(i) == lastChar) {
                numOfReps++;
            }
            else {
                newString += lastChar + Integer.toString(numOfReps);
                numOfReps = 1;
                lastChar = text.charAt(i);
            }
        }

        newString += lastChar + Integer.toString(numOfReps);
        return newString;
    }

    public static String Decompress(String text) {

        if (text == null || text.isEmpty()) {
            return "";
        }

        String newString = "";

        for(int i = 1; i < text.length(); i += 2) {
            int intValue = Integer.parseInt(String.valueOf(text.charAt(i)));
            String currentChar = String.valueOf(text.charAt(i - 1));
            newString += currentChar.repeat(intValue);
        }

        return newString;
    }
}
