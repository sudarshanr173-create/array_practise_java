public class revision {
    public static void hollow_rectangle(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
            }

        }
    }

    public static void inverted_half_pyramid(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - 1; j++) {

            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }

    public static void inverted_half_pyramid_with_numbers(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + "");
            }
            System.out.print(" ");
        }
    }

    public static void floyds_triangle(int num) {
        int counter = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.println(counter + " ");
                counter++;
            }
            counter++;

        }
        System.out.print(" ");

    }

    public static void butterfly(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");

            }
            for (int j = 1; j <= 2 * (num - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.println(" ");
            }
        }
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 2 * (num - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j--) {
                System.out.println(" *");
            }
        }

    }

    // Array topic start from here
    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;

    }

    public static int binarysearch(int[] numbers, int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return -1;
    }

}

public static void reverse(int numbers[]) {
    int first = 0;
    int last = numbers.length - 1;
    while (first < last) {
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;
        first++;
        last--;

    }
}

public static void main(String args[]) {
    int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
    int key = 10;
    System.out.println(binarysearch(numbers, key));
    reverse(numbers);
    for (int i = 0; i <= numbers.length; i++) {
        System.out.print(numbers[i] + " ");
    }
    System.out.print(" ");
}
