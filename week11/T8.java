import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        int[][] m = getArray(); // Get an array
        System.out.println("\nSum of all elements is " + sum(m));
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;  
    }
    public static int sum(int[][] m){
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                total += m[i][j];
            }
        }
        return total;
    }
}
