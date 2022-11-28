import java.util.Enumeration;
import java.util.HashMap;

class LetterCount {
  public static void main(String[] args) {
    System.out.print("Enter a string: ");
    String input = System.console().readLine();

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (!map.containsKey(c)) {
        map.put(c, 0);
      }

      int count = map.get(c);
      map.put(c, count + 1);
    }

    for (Character key : map.keySet()) {
      System.out.println(key + ": " + map.get(key));
    }

  }
}