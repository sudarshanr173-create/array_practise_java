import java.util.ArrayList;

public class listarray4 {

    public static int storeWater(ArrayList<Integer> height) {

        int maxWater = 0;

        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {

            int ht = Math.min(height.get(lp), height.get(rp));

            int width = rp - lp;

            int currentWater = ht * width;

            maxWater = Math.max(maxWater, currentWater);

            // move pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int target = 10;

        System.out.println(pairSum(list, target));
    }
}