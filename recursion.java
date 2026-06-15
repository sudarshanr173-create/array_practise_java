public class recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);

    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.println(n + " ");

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int calsum(int n) {
        if (n == 1) {
            return 1;

        }
        int snm1 = calsum(n - 1);
        int sn = n + snm1;
        return sn;

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int Arr[], int i) {
        if (i == Arr.length - 1) {
            return true;

        }
        if (Arr[i] > Arr[i + 1]) {
            return false;
        }
        return isSorted(Arr, i + 1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;

        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurance(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static int power(int x, int n) {
        if (n == 1) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // solving amazon problem
    public static int tillingproblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tillingproblem(n - 1);
        int fnm2 = tillingproblem(n - 2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void removeDuplicate(String str, int idx,
            StringBuilder newStr,
            boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (currChar == ' ') { // handle spaces
            newStr.append(currChar);
            removeDuplicate(str, idx + 1, newStr, map);
            return;
        }

        if (map[currChar - 'a']) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicate(str, idx + 1, newStr, map);
        }
    }

    public static int friendpairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = friendpairing(n - 1);
        int fnm2 = friendpairing(n - 2);
        int pairways = (n - 1) * fnm2;
        int totalways = fnm1 + pairways;
        return totalways;

    }

    public static void printBinString(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Place 0
        printBinString(n - 1, 0, str + "0");

        // Place 1 only if previous digit was 0
        if (lastPlace == 0) {
            printBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // int n = 5;
        // printDec(n);
        // printInc(n);
        // int fact = factorial(n);
        // System.out.println("Factorial of " + n + " = " + fact);
        // System.out.println(calsum(n));
        // int result = fib(n);
        // System.out.println(result);
        // int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(firstOccurance(Arr, 5, 0));
        // System.out.println(isSorted(Arr, 0));
        // System.out.println(lastOccurance(arr, 5, 0));
        // System.out.println(power(2, 5));
        // System.out.println(tillingproblem(5));
        // String Str = "appna college";
        // removeDuplicate(Str, 0, new StringBuilder(), new boolean[26]);
        // System.out.println(friendpairing(3));
        printBinString(3, 0, "");
    }
}
