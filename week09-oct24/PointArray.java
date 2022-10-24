class PointArray {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    Point[] values = new Point[num];

    for (int i = 0; i < num; i++) {
      System.out.println("-------------------------------");
      System.out.print("Enter an x value: ");
      double x = Double.parseDouble(System.console().readLine());

      System.out.print("Enter an y value: ");
      double y = Double.parseDouble(System.console().readLine());

      Point p = new Point(x, y);
      values[i] = p;
    }

    for (int i = 0; i < num; i++) {
      System.out.println(values[i]);
    }
  }
}