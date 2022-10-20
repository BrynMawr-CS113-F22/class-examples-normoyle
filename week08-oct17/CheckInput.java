
public class CheckInput {

    public static boolean IsInteger(String value) {
        if (value.length() == 0) return false;
        
        int startIndex = 0;
        if (value.charAt(0) == '-') {
            startIndex = 1;
        }

        for (int i = startIndex; i < value.length(); i++) {
            char c = value.charAt(i);
            int cval = c - '0';
            if (cval < 0 || cval > 9) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsInteger("9-B7") == false);
        System.out.println(IsInteger("-7") == true);
        System.out.println(IsInteger("7988775") == true);
        System.out.println(IsInteger("798.8775") == false);
        System.out.println(IsInteger("-798.8775") == false);
        System.out.println(IsInteger("877-798") == false);
        System.out.println(IsInteger("") == false);
        System.out.println(IsInteger("apple") == false);
    }
}
