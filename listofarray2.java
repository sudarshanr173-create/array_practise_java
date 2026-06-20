import java.util.*;

// swap function
// public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

// int temp = list.get(idx1);
// list.set(idx1, list.get(idx2));
// list.set(idx2, temp);
// }

// public static void main(String args[]) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(5);
// list.add(4);
// list.add(3);
// list.add(2);
// list.add(1);

// System.out.println("Before swap: " + list);

// swapping index 1 and 2
// swap(list, 1, 2);

// System.out.println("After swap: " + list);
// Collections.sort(list);
// System.out.println("After sorting: " + list);
// Collections.sort(list, Collections.reverseOrder());
// System.out.println("list are" + list);
// }

import java.util.*;

public class listofarray2 {

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // adding values
        for (int i = 1; i <= 5; i++) {
            list1.add(i); // 1 2 3 4 5
            list2.add(i * 2); // 2 4 6 8 10
            list3.add(i * 3); // 3 6 9 12 15
        }

        // adding lists into mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // printing 2D ArrayList
        System.out.println(mainList);

        // printing elements using loops
        for (int i = 0; i < mainList.size(); i++) {

            ArrayList<Integer> currentList = mainList.get(i);

            System.out.print("List " + (i + 1) + ": ");

            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }

            System.out.println();
        }
    }
}

public static int storeWater(ArrayList<Integer> height) {

    int maxWater = 0;

    for (int i = 0; i < height.size(); i++) {

        for (int j = i + 1; j < height.size(); j++) {

            int ht = Math.min(height.get(i), height.get(j));

            int width = j - i;

            int currentWater = ht * width;

            maxWater = Math.max(maxWater, currentWater);
        }
    }

    return maxWater;
}

public static void main(String args[]) {

    ArrayList<Integer> height = new ArrayList<>();

    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(storeWater(height));
}
