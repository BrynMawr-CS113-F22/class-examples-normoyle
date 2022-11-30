class ExceptionDemo {

  public static int bar(int v) {
    if (v < 5) {
      throw new RuntimeException("An error happened in bar()");
    }

    int a = 10;
    return a * 4;
  }

  public static void foo(int x) {
    try {
      int v = bar(x);
      System.out.println("TRY: "+v);
    }
    catch (RuntimeException e) {
      System.out.println("An exception occured: "+e.getMessage());
      e.printStackTrace();
    }
    System.out.println("Hello from foo()");
  }

  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    foo(x);
  }
}