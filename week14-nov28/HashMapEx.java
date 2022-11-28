import java.util.Enumeration;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("dog", "woof");
        map.put("cow", "moo");
        map.put("cat", "meow");
        map.put("bird", "chirp");
        System.out.println(map.get("dog"));

        for (String key : map.keySet()) {
            System.out.printf("What does the %s say? %s\n", key, map.get(key));
        }

        boolean test = map.containsKey("turkey");
        System.out.println(test);

        map.remove("cat");
    } 
}
