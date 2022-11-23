class Sum {
  public static int sum(int n) {
    if (n <= 0) return 0;

    return n + sum(n-1);
  }

  public static void main(String[] args) {
    System.out.printf("sum(%d) = %d\n", 0, sum(0));
    System.out.printf("sum(%d) = %d\n", 1, sum(1));
    System.out.printf("sum(%d) = %d\n", 4, sum(4));
    System.out.printf("sum(%d) = %d\n", 5, sum(5));
    System.out.printf("sum(%d) = %d\n", -10, sum(-10));

  }
}