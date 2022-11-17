class LinearSearch {
  public static int LinearSearch(int x, int[] L) {
    int index = -1;
    for (int i = 0; i < L.length; i++) {
      if (L[i] == x) {
        index = i;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int[] L = {4, 5, 8, 10, -3, -7};

    int index = LinearSearch(-3, L); // should return 4
    System.out.println(index);

    index = LinearSearch(99, L); // should return -1
    System.out.println(index);

  }
}