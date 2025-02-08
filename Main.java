public class Main {
    public static void main(String[] args) {
        System.out.println(Compress("abc"));
        System.out.println(Decompress("a5b2"));
    }

    public static String Compress(String text) {

        //Handle empty or null input
        if (text == null || text.isEmpty()) {
            return "";
        }

        String newString = "";
        char lastChar = text.charAt(0);
        int numOfReps = 1; //Number of repetitions

        for(int i = 1; i < text.length(); i++) {
            if(text.charAt(i) == lastChar) { //Check if a sequence still exists
                numOfReps++;
            }
            else { //Compress sequence of repeating characters and starts a new sequence
                newString += lastChar + Integer.toString(numOfReps);
                numOfReps = 1;
                lastChar = text.charAt(i);
            }
        }

        newString += lastChar + Integer.toString(numOfReps);
        return newString;
    }

    public static String Decompress(String text) {

        //Handle empty or null input
        if (text == null || text.isEmpty()) {
            return "";
        }

        String newString = "";

        for(int i = 1; i < text.length(); i += 2) {
            int intValue = Integer.parseInt(String.valueOf(text.charAt(i))); //Convert a character into an integer
            String currentChar = String.valueOf(text.charAt(i - 1)); //Get previous character
            newString += currentChar.repeat(intValue); //Add a sequence of repeating characters into a string
        }

        return newString;
    }
}
