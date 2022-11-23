class Sierpinski {
  public static void sierpinski(double x, double y, double h, int N) {
    if (N <= 0 ) {
      return;
    }
    double[] xs = {x-h/2, x, x+h/2}; 
    double[] ys = {y, y+h, y};
    StdDraw.polygon(xs, ys);
    System.out.println(x+" "+y+" "+h);

    sierpinski(x-h/4, y, h/2, N-1);
    sierpinski(x+h/4, y, h/2, N-1);
    sierpinski(x, y+h/2, h/2, N-1);
  }

  public static void main(String[] args) {
    double width = 500;
    double height = 500;
    StdDraw.setXscale(0, width);
    StdDraw.setYscale(0, height);
    sierpinski(width/2, 0, height, 6);  
  }

}