import java.util.Random;

public class T13 {
     public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];
        int maxRow = 0, maxCol = 0;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxCol = j;
            }
        }

        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }
}
