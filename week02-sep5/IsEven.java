class IsEven {
  public static void main(String[] args) {
    System.out.print("Enter an integer: ");
    String input = System.console().readLine();
    int value = Integer.parseInt(input);

    if (value % 2 == 0) {
      System.out.println(value + " is even.");
    } else {
      System.out.println(value + " is odd.");
    }
  }
}