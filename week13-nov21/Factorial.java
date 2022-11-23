class Factorial {
  
  public static int factorial(int n) {
    if (n <= 0) {
      return 1;
    }

    return n * factorial(n-1);
  }

  public static void main(String[] args) {
    System.out.printf("factorial(%d) = %d\n", 0, factorial(0));
    System.out.printf("factorial(%d) = %d\n", 1, factorial(1));
    System.out.printf("factorial(%d) = %d\n", 4, factorial(4));
    System.out.printf("factorial(%d) = %d\n", 5, factorial(5));
    System.out.printf("factorial(%d) = %d\n", -10, factorial(-10));


  }
}