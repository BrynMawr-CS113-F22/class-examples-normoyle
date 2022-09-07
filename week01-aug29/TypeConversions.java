public class TypeConversions {
   
    public static void main(String[] args) {
        int a = (int) 3.14;
        double db = 3.14;

        String valStr = String.valueOf(a);
        double x = Double.parseDouble("3.14");
        int y = Integer.parseInt("10");

        System.out.println(valStr + " " + a);
    }
}
