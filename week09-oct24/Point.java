class Point {

  // instance variables (data)
  private double x = -1.0;
  private double y = -1.0;

  public Point() { // implemention of a constructor
    // purpose: create an empty point
    System.out.println("here!");
    this.x = 0;
    this.y = 0;
  }

  public Point(double inx, double iny) { // implemention of a constructor
    System.out.println("here2!");
    this.x = inx; 
    this.y = iny; 
  }

  // methods are public by default
  double getX() {
    // note: we can access instance variables, like x, in an instance method!
    return this.x; // returns instance value x
  }

  public double getY() {
    return this.y; // returns instance value y
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  public void add(Point p) {
    // add p to this point and then save the result in our instance variables
    this.x = this.x + p.getX();
    this.y = this.y + p.getY();
  }

  public static Point add(Point a, Point b) {
    // static methods cannot use this
    Point p = new Point();
    p.x = a.x + b.x; 
    p.y = a.y + b.y;
    return p;
  }

  public static void main(String[] args) {
    //Point p; // declared, but constructor not called
    Point p = new Point(); // Empty constructor called
    Point p2 = new Point(3, 5); // Constructor with 2 arguments called

    System.out.println("P: " + p.getX() + " " + p.getY());
    System.out.println("P2: " + p2.getX() + " " + p2.getY());

    // Add p2 to p using an instance method
    //p.add(p2);

    // Add p and p2 using a static method
    Point p3 = Point.add(p, p2);
    System.out.println("P3: " + p3.getX() + " " + p3.getY());
  }
}