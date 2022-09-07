class LogicalError {
  public static void main(String[] args) {
    System.out.println("Please enter an integer: ");
    int i = Integer.parseInt(System.console().readLine());

    System.out.println("Please enter an integer: ");
    int j = Integer.parseInt(System.console().readLine());

    int sum = i - j;
    System.out.println("The sum is " + sum);
  }
}