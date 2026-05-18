public class SpiralSolving {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static int diagonalsum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if ((i + j) == matrix.length - 1) {
                    sum += matrix[i][j];

                }

            }
        }
        return sum;

    }

    public static boolean printstaircasesearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Key is found at (" + row + "," + col + ")");
                return true;

            } else if (key < matrix[row][col]) {
                col--;

            } else {
                row++;
            }
        }

        System.out.println("Key is not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 33;

        printstaircasesearch(matrix, key);
    }
}