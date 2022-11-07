class Swap {

  public static void Print(int[] L) {
    for (int i = 0; i < L.length; i++) {
      System.out.print(L[i]+" ");
    } 
    System.out.println();
  }

  public static void main(String[] args) {
    int[] L = {-2, 3, 5};
    Print(L);
    L[1] = L[0];
    L[0] = L[1];
    Print(L);
  }
}
