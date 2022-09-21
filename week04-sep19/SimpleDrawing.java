import java.awt.Color;

class SimpleDrawing {
  public static void main(String[] args) {
    StdDraw.square(.2, .8, .1);
    StdDraw.filledSquare(.8, .8, .2);
    StdDraw.circle(.8, .2, .2);
    double[] xd = { .1, .2, .3, .2 };
    double[] yd = { .2, .3, .2, .1 };

    Color color = new Color(255, 25, 0);
    StdDraw.setPenColor(color);

    StdDraw.filledPolygon(xd, yd);
    StdDraw.text(.2, 0.75, "black text");
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.text(.8, .8, "white text");
  }
}