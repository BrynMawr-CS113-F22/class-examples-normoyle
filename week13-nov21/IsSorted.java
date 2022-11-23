import java.util.Arrays;

public class IsSorted {

  public static boolean isSorted(int[] L) {
     return false;
  }

  public static boolean isSorted(int[] L, int lo) {
    return false;
  }

  public static void main(String[] args) {

    int[] L1 = {-10, -7, -5, 0, 3, 5, 7, 10};
    int[] L2 = {};
    int[] L3 = {4};
    int[] L4 = {5, 4};
    int[] L5 = {2, 4, 10};

    System.out.printf("isSorted(%s) = %b\n", 
      Arrays.toString(L1), isSorted(L1));

    System.out.printf("isSorted(%s) = %b\n", 
      Arrays.toString(L2), isSorted(L2));

    System.out.printf("isSorted(%s) = %b\n", 
      Arrays.toString(L3), isSorted(L3));

    System.out.printf("isSorted(%s) = %b\n", 
      Arrays.toString(L4), isSorted(L4));

    System.out.printf("isSorted(%s) = %b\n", 
      Arrays.toString(L5), isSorted(L5));
  }
}

