class Add4 {

  public static int Add(int[] a) {
    if (a.length != 2) return -1;
    a[0] = 2;
    int result = a[0] + a[1];
    return result; 
  }

  public static void main(String[] args) {
    int[] a = {4, 8};
    int c = Add(a);
    System.out.printf("%d + %d = %d\n", a[0], a[1], c);
  }
}
