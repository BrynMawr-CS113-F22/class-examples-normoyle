import java.awt.Color;

class Circles {

  public static int randomRange(int a, int b) {
    int range = b - a;
    return (int) (Math.random() * range + a);
  }
  public static void circle(double x, double y, double r) {
    if (r < 100) {  // base case
      return;
    }
    
    int red = randomRange(150,175);
    int green = randomRange(150,175);
    int blue = randomRange(150,175);
    int alpha = 100;
    Color color = new Color(red, green, blue, alpha);
    StdDraw.setPenColor(color);

    //System.out.println(x+" "+y);
    StdDraw.filledCircle(x, y, 2*r);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.circle(x, y, 2*r);

    circle(x+r, y, r*0.5);
    circle(x-r, y, r*0.5);
    circle(x, y+r, r*0.5);
    circle(x, y-r, r*0.5);
  }

  public static void main(String[] args) {
    double width = 1000;
    double height = 1000;
    StdDraw.setXscale(0, width);
    StdDraw.setYscale(0, height);
    circle(width * 0.5, height * 0.5, 800);
  }
}