class Exception {

  public static void bar() {
    throw new RuntimeException("An error happened in bar()");
  }

  public static void foo() {
    try {
      bar();
    }
    catch (RuntimeException e) {
      System.out.println("An exception occured: "+e.getMessage());
      e.printStackTrace();
    }
    System.out.println("Hello from foo()");
  }

  public static void main(String[] args) {
    foo();
  }
}