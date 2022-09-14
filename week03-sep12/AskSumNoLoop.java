class AskSumNoLoop {
  public static void main(String[] args) {
    int total = 0;
    int value;

    value = Integer.parseInt(System.console().readLine());
    total = total + value;

    value = Integer.parseInt(System.console().readLine());
    total = total + value;

    value = Integer.parseInt(System.console().readLine());
    total = total + value;

    value = Integer.parseInt(System.console().readLine());
    total = total + value;

    value = Integer.parseInt(System.console().readLine());
    total = total + value;

    value = Integer.parseInt(System.console().readLine());
    total = total + value;

    System.out.println("Sum = " + total);
  }
}