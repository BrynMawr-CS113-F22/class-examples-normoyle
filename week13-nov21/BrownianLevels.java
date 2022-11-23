public class BrownianLevels {

  public static void curve(double x0, double y0,
                           double x1, double y1,
                           double var, double s, int level) {

    if (level == 0) { //(x1 - x0 < 0.01) {
      StdDraw.line(x0, y0, x1, y1);
      return;
    }

    double xm = (x0 + x1) / 2;
    double ym = (y0 + y1) / 2;
    double delta = StdRandom.gaussian(0, Math.sqrt(var));
    curve(x0, y0, xm, ym + delta, var/s, s, level-1);
    curve(xm, ym + delta, x1, y1, var/s, s, level-1);
  }

  public static void main(String[] args) {
    double hurst = Double.parseDouble(args[0]);
    int level = Integer.parseInt(args[1]);
    double s = Math.pow(2, 2*hurst);
    curve(0, 0.5, 1.0, 0.5, 0.01, s, level);
  }
}