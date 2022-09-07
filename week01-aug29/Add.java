class LogicalError {
  public static void main(String[] args) {
    System.out.println("Please enter an integer: ");
    int i = Int.ParseInt(System.Console().Readline());

    System.out.println("Please enter an integer: ");
    int j = Int.ParseInt(System.Console().Readline());

    int sum = i - j;
    System.out.println("The sum is " + sum);
  }
}