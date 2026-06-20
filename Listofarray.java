import java.util.ArrayList;

public class Listofarray {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // size operation
        System.out.println(list.size());

        // get operation
        // int element = list.get(2);
        // System.out.println(element);

        // remove operation
        // list.remove(2);
        // System.out.println(list);

        // set operation
        list.set(2, 20);
        System.out.println(list);

        // contains operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // print all elements
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum element: " + max);
    }

    public static void Swap(ArrayList<Integer> list, int i, int j) {
        idx1 = 1;
        idx2 = 2;
        temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        Swap(list, idx1, idx2);
    }

}
