import java.util.Random;

public class T14 {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8},
            {9, 10}
        };

        System.out.println("Original matrix:");
        printMatrix(m);

        shuffle(m);

        System.out.println("\nShuffled matrix:");
        printMatrix(m);
    }

    public static void shuffle(int[][] m) {
        Random random = new Random();
        for (int i = m.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            swapRows(m, i, j);
        }
    }

    private static void swapRows(int[][] m, int i, int j) {
        int[] temp = m[i];
        m[i] = m[j];
        m[j] = temp;
    }

    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
