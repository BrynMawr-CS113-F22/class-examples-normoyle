import java.util.Arrays;

class FibonacciDP {
  
  static long[] lookup = new long[1000];
  
  public static long Fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (lookup[n] == -1) { 
       lookup[n] = Fibonacci(n-1) + Fibonacci(n-2);
    }
    return lookup[n];
  }

  public static void main(String[] args) {
    Arrays.fill(lookup, -1);
    long nthFib = Fibonacci(50);
    System.out.println(nthFib);
  }
}