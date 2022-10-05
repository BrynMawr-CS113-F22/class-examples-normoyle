class Add1 {

  public static int Add(int a, int b) {
    int result = a + b;
    return result; 
  }

  public static void main(String[] args) {
    int a = 4;
    int b = 8;
    int c = Add(b, a);
    System.out.printf("%d + %d = %d\n", a, b, c);
  }
}
