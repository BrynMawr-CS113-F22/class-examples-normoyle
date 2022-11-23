import java.util.Arrays;

public class SumList {

  public static int sumList(int[] L) {
  }

  public static void main(String[] args) {

    int[] L1 = {-10, -7, -5, 0, 3, 5, 7, 10};
    int[] L2 = {};
    int[] L3 = {4};
    int[] L4 = {5, 4};
    int[] L5 = {2, 4, 10};

    System.out.printf("sumList(%s) = %d\n", 
      Arrays.toString(L1), sumList(L1));

    System.out.printf("sumList(%s) = %d\n", 
      Arrays.toString(L2), sumList(L2));

    System.out.printf("sumList(%s) = %d\n", 
      Arrays.toString(L3), sumList(L3));

    System.out.printf("sumList(%s) = %d\n", 
      Arrays.toString(L4), sumList(L4));

    System.out.printf("sumList(%s) = %d\n", 
      Arrays.toString(L5), sumList(L5));
  }
}

