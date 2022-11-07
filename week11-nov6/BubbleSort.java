class BubbleSort {
  public static void swap(int i, int j, int[] L) {
    int tmp = L[i];
    L[i] = L[j];
    L[j] = tmp;
  }
  
  public static void printList(int[] L) {
    for (int i = 0; i < L.length; i++) {
      System.out.print(L[i]+" ");
    }
    System.out.println();
  }
  
  public static void bubbleSort(int[] L) 
  {
    for (int n = 0; n < L.length; n++) {
      for (int j = 1; j < L.length; j++) {
        if (L[j-1] > L[j]) {
          swap(j-1, j, L);
        }
        printList(L);
      }
      System.out.println("---------------");
    }
  }
  
  public static void main(String[] args) {
    int[] L = {10, 4, 3, 0, 11, 8};
    printList(L);
    bubbleSort(L);
  }
  
}