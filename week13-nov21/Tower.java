class Tower {

  public static void tower(int height, double x, double y) {
    if (height == 0) return;

    double hw = 1.0/height;
    System.out.printf("Draw block %d: %.2f %.2f %.2f\n", 
      height, x, y, hw/2);

    // draw block
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.filledSquare(x, y, hw/2);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.square(x, y, hw/2);

    tower(height-1, x, y - hw);
  }

  public static void main(String[] args) {
    tower(5, 0.5, 0.9);
  }
}

