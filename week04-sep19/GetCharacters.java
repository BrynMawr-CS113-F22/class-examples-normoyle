public class GetCharacters {
    public static void main(String[] args) {
        //System.out.println("Enter a word: ");
        //String text = System.console().readLine();
        String text = "Aloha!"; // called hard-coded a value

        //char c = text[1]; // not allowed!
        char c = text.charAt(1); // not allowed!
        System.out.println(c);

        int length = text.length();
        // print first character
        System.out.printf("FirstIndex: %d FirstChar:  %c\n", 0, text.charAt(0));

        // print last character
        int lastIndex = length - 1;
        char lastChar = text.charAt(lastIndex);
        System.out.printf("LastIndex: %d LastChar: %c\n", lastIndex, lastChar);

        // print middle character
        int middle = (int) (text.length() * 0.5);
        System.out.printf("MiddleIndex: %d MiddleChar: %c\n", middle, text.charAt(middle));
    }    
}
