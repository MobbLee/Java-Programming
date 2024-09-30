
import java.util.Scanner;

public class Lab2Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();        

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("the area is %.4f.%n", area);
        System.out.printf("the volume is %.1f.%n", volume);

    }
}
