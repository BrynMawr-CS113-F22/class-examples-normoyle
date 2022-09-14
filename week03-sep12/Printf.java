class Printf {
  public static void main(String[] args) {
    int sum = 10;
    System.out.println("sum = " + sum);
    System.out.printf("sum = %d\n", sum);

    System.out.printf("%.2f %s on the wall\n", 99.7, "bottles");
  }
}