public class revision2 {
    public static void printpairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(curr + ", " + numbers[j]);
            }
            System.out.print(" ");
        }

    }

    public static void printsubarray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printMaxSubarray(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0; // reset for each subarray

                for (int k = start; k <= end; k++) {
                    currsum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }

                System.out.println(" = " + currsum);

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Maximum sum of subarray is: " + maxsum);
    }

    public static void kadanes(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            currsum = currsum + number[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("max number is :" + maxsum);

    }

    public static void trappedrainwater(int height[]) {
        // left boundary
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 0; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);

        }
        // right boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedrainwater = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(leftmax[i], rightmax[i]);
            trappedrainwater = water_level - height[i];

        }
        System.out.println("trapped rain water is :" + trappedrainwater);

    }

    public static int buyANDsellstocks(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);

            } else {
                buyprice = price[i];

            }

        }
        return maxprofit;
    }

    public static void main(String args[]) {
        int price[] = { 7, 1, 5, 3, 6, 4 };

        // printMaxSubarray(numbers);
        // kadanes(numbers);
        // trappedrainwater(height);
        buyANDsellstocks(price);
    }
}
