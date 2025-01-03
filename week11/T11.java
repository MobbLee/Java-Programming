import java.util.Arrays;
public class T11 {
    public static void main(String[] args) {
        // 存储每个员工一周工作小时的二维数组
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},  
            {7, 3, 4, 3, 3, 4, 4},   
            {3, 3, 4, 3, 3, 2, 2},   
            {9, 3, 4, 7, 3, 4, 1},   
            {3, 5, 4, 3, 6, 3, 8},   
            {3, 4, 4, 6, 3, 4, 4},   
            {3, 7, 4, 8, 3, 8, 4},   
            {6, 3, 5, 9, 2, 7, 9}    
        };

        int[] totalHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                totalHours[i] += hours[i][j];
            }
        }

        Integer[] indices = new Integer[hours.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> totalHours[b] - totalHours[a]);

        System.out.println("Employee\tTotal Hours");
        for (int i : indices) {
            System.out.println(i + "\t" + totalHours[i]);
        }
    }
}
