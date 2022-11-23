public class BinarySearch {

  public static int search(int v, int[] L) {
     return search(v, L, 0, L.length-1);
  }

  public static int search(int v, int[] L, int lo, int hi) {

    if (hi < lo) {
      return -1; 
    }

    int mid = (lo + hi)/2;
    if (v < L[mid]) {
      return search(v, L, lo, mid-1);
    }
    else if (v > L[mid]) {
      return search(v, L, mid+1, hi);
    }
    else {
      return mid;
    }

  }

  public static void main(String[] args) {

    int[] L = {-10, -7, -5, 0, 3, 5, 7, 10};

    int value = 7;
    int index = search(value, L);
    System.out.printf("Search(%d, L) = %d\n", value, index);

    value = -4;
    index = search(value, L);
    System.out.printf("Search(%d, L) = %d\n", value, index);

  }
}

