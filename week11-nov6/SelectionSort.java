class SelectionSort {
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
  
  public static void selectionSort(int[] L) 
  {
    for (int i = 0; i < L.length; i++) {
      int minIdx = i;
      for (int j = i+1; j < L.length; j++) {
        if (L[j] < L[minIdx]) {
          minIdx = j; 
        }
      }
      swap(i, minIdx, L);
      printList(L);
    }
  }
  
  public static void main(String[] args) {
    int[] L = {10, 4, 3, 0, 11, 8};
    printList(L);
    selectionSort(L);
  }
}