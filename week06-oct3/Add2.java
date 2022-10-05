class Add2 {

  public static int Add(int a, int b) {
    a = 2;
    int result = a + b;
    return result; 
  }

  public static void main(String[] args) {
    int a = 4;
    int b = 8;
    int c = Add(a, b);
    System.out.printf("%d + %d = %d\n", a, b, c);
  }
}
