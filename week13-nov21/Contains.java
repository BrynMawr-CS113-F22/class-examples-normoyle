public class Contains {
   
    public static boolean contains(char x, String phrase) {
      return contains(x, phrase, 0);
    }

    public static boolean contains(char x, String phrase, int index) {
      if (phrase.length() == 0) return false;

      if (index > phrase.length()-1) {
        return false;
      }
      
      char current = phrase.charAt(index);
      if (current == x) return true;

      return contains(x, phrase, index+1);
    }
    
    public static void main(String[] args) {
        String phrase = "apple";

        System.out.printf("contains(%c, %s) = %b\n", 
          'a', phrase, contains('a', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'z', phrase, contains('z', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'l', phrase, contains('l', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'e', phrase, contains('e', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'e', "", contains('e', ""));
    }
}
