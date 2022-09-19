class SumN {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    int N = Integer.parseInt(System.console().readLine());

    int sum = N;
    for (int i = 1; i < N; i++) {
      sum += i;
    }
    // 6 + 5 + 4 + 3 + 2 + 1
    System.out.println("Sum is " + sum);
  }
}