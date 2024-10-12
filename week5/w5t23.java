import java.util.Scanner;
import java.lang.Math;

public class w5t23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center of a pentagon to a vertex: ");
        double r = input.nextDouble();
        
        double s = 2 * r * Math.sin(Math.PI / 5);
        
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        
        area = Math.round(area * 100.0) / 100.0;
        
        System.out.printf("The area of the pentagon is %.2f%n", area);
    }
}