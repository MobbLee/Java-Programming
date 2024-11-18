import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][4];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        input.close();

        // Display the sum of each column
        for (int j = 0; j < matrix[0].length; j++) {
            double sum = sumColumn(matrix, j);
            System.out.println("Sum of the elements at column " + j + " is " + sum);
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }
}
