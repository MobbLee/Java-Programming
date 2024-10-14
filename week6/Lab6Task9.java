public class Lab6Task9 {
    public static void main(String[] args) {
        int rows = 4; 
        int[] columnLength = {2, 3, 4}; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columnLength[i-1]; j++) {
                if (j <= (columnLength[i-1] / 2) + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}