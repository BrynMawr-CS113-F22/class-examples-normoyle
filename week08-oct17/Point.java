class Point {

  // instance variables (data)
  public double x = -1.0;
  public double y = -1.0;

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

  public double getX() {
    // note: we can access instance variables, like x, in an instance method!
    return this.x; // returns instance value x
  }

  public double getY() {
    return this.y; // returns instance value y
  }

  public void add(Point p) {
    // add p to this point and then save the result in our instance variables
    this.x = this.x + p.getX();
    this.y = this.y + p.getY();
  }

  public static void main(String[] args) {
    //Point p; // declared, but constructor not called
    Point p = new Point(); // Empty constructor called
    Point p2 = new Point(3, 5); // Constructor with 2 arguments called

    System.out.println("P: " + p.getX() + " " + p.getY());
    System.out.println("P2: " + p2.getX() + " " + p2.getY());

    // Add p2 tp p
    p.add(p2);
    System.out.println("P: " + p.getX() + " " + p.getY());
  }
}