import java.util.ArrayList;

class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(-7);
        list.add(3);
    
        for (int i = 0; i < list.size(); i++) {
            int v = list.get(i);
            System.out.println(v);
        }

        boolean test = list.contains(-7);
        System.out.println(test);
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            int v = list.get(i);
            System.out.println(v);
        }

        list.clear();
    }
}
