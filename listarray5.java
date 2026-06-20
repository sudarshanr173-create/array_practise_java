import java.util.ArrayList;

public class listarray5 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int n = list.size();
        int bp = -1;

        // finding breaking point
        for (int i = 0; i < n - 1; i++) {

            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1; // smallest
        int rp = bp; // largest

        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        // Sorted & Rotated ArrayList
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}
