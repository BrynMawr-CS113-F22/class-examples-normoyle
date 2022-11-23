public class Hello {
    
    public static void hello(int n) {
        if (n == 0) { // base case
            return;
        }

        System.out.println("hello");
        hello(n-1);
    }

    public static void main(String[] args)
    {
        hello(5);
    }
}
