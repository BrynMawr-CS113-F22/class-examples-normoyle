class LoopPow2 {
  public static void main(String[] args) {
    System.out.println("Enter an exponent: ");
    int exp = Integer.parseInt(System.console().readLine());

    int result = 1;
    int count = 0;
    while (count < exp) {
      result *= 2;
      count++;
    }
    System.out.println("2 to the power of "+ exp + " is " + result);

  }
}