public class T1 {
    public static void main(String[] args) {
        int matrix[][] = new int[5][4];

        int[][] matrix1 = {
            {2, 3, 4, 5},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println("Total number of rows: " + matrix1.length);

        for (int i = 0; i < matrix1.length; i++) {
            System.out.println("Length of row " + i + ": " + matrix1[i].length);
        }

        try {
            System.out.println("Length of row 4: " + matrix1[4].length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}