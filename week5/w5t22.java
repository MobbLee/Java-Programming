import java.util.Scanner;
public class w5t22 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        
        if (decimal >= 0 && decimal <= 15) {
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("The hex value is " + hex);
        } else {
            System.out.println(decimal + " is an invalid input");
        }
}
}
