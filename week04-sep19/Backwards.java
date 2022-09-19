class Backwards {
  public static void main(String[] args) {
    int[] values = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter a value: ");
      int v = Integer.parseInt(System.console().readLine());
      values[i] = v;
    }

    System.out.println("---------------");
    for (int i = 4; i > -1; i--) {
      System.out.println("Value: " + values[i]);
    }
    //System.out.println("Value: " + values);

  }
}