class Fibonacci {
  
  public static long Fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return Fibonacci(n-1) + Fibonacci(n-2);
  }

  public static void main(String[] args) {
    long nthFib = Fibonacci(50);
    System.out.println(nthFib);
  }
}