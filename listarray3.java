import java.util.ArrayList;

public class listarray3 {
    //

    public static int StoreWater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size();
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = lp - rp;
            int currentwater = ht * width;
            maxwater = Math.max(maxwater, currentwater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
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

        System.out.println(StoreWater(height));
    }
}
