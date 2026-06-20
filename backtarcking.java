public class backtarcking {
    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;

        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");

        }
        System.out.print("");

    }

    public static void findsubsets(String str, String ans, int i) {

        // Base case
        if (i == str.length()) {

            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }

        // Include current character
        findsubsets(str, ans + str.charAt(i), i + 1);

        // Exclude current character
        findsubsets(str, ans, i + 1);
    }

    public static void findpermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // abcde=ab+de=abde//c -remove karna ka liyaa
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findpermutations(newStr, ans + curr);
        }
    }

    // for safe palced for queen
    public static boolean issafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char board[][], int row) {
        // base case
        if (board.length == row) {
            printboard(board);
            count++;
            return;

        }
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1);// function call
                board[row][j] = 'x'; // backtracking
            }
        }
    }

    public static void printboard(char board[][]) {
        System.out.println("-------chess board-------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int count = 0;

    public static void main(String args[]) {

        String str = "abc";

        findsubsets(str, "", 0);
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
        findpermutations(str, "");
        int n = 4; // Example size for the chess board
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueen(board, 0);
        System.out.println("Total solutions: " + count);
    }
}
