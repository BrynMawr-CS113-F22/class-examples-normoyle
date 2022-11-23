import java.util.Arrays;

public class PrintList {

    public static void print(int[] L) { 
        System.out.println("---------");
        print(L, 0);
    }

    public static void print(int[] L, int idx) { 
        if (L.length == 0) return;
        if (idx > L.length-1) return;

        print(L, idx+1);
        System.out.println(L[idx]);
    }

    public static void main(String[] args) {

        int[] L1 = {2,4,6,8};
        int[] L2 = {100};
        int[] L3 = {};
        print(L1);
        print(L2);
        print(L3);
    } 
}
