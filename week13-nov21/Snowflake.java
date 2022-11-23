import java.awt.Color;

class Snowflake {

  public static void snowflake(int level, double x1, double y1, double theta, double len) {
    if (level <= 0) {
      Color color = new Color(150, 200, 255, 50);
      StdDraw.setPenColor(color);
      StdDraw.filledCircle(x1, y1, len);
      return;
    }
    
    double endx = len * Math.cos(theta);
    double endy = len * Math.sin(theta);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.line(x1, y1, x1 + endx, y1 + endy);

    snowflake(level-1, x1 + 0.1 * endx, y1 + 0.1 * endy, theta+0.6, 0.5 * len); 
    snowflake(level-1, x1 + 0.1 * endx, y1 + 0.1 * endy, theta-0.6, 0.5 * len); 

    snowflake(level-1, x1 + 0.6 * endx, y1 + 0.6 * endy, theta+0.5, 0.3 * len); 
    snowflake(level-1, x1 + 0.6 * endx, y1 + 0.6 * endy, theta-0.5, 0.3 * len); 

    snowflake(level-2, x1 + endx, y1 + endy, theta+0.4, 0.2 * len); 
    snowflake(level-2, x1 + endx, y1 + endy, theta-0.4, 0.2 * len); 
  }

  public static void snowflake(double width, double height) {
    int num = 10;
    for (int i = 0; i < num; i++) {
      double theta = i * 2 * Math.PI / num;
      snowflake(4, width*0.5, height*0.5, theta, height * 0.4);
    }
  }

  public static void main(String[] args) {
    double width = 500;
    double height = 500;
    StdDraw.setXscale(0, 500);
    StdDraw.setYscale(0, 500);
    snowflake(width, height);
  }
}