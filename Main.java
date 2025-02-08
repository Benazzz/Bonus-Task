public class Main {
    public static void main(String[] args) {
        System.out.println(Compress("abc"));
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
        String newString = "";
        return newString;
    }
}
