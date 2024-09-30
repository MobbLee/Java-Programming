import java.util.Scanner;

public class Lab2Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double taxRate = 0.06; 

        double tax = purchaseAmount * taxRate;

        System.out.printf("Sales tax is $%.2f\n", tax);

        input.close();
    }
}