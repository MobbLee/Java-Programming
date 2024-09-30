import java.util.Scanner;

public class Lab2Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlyDeposit = input.nextDouble();

        double annualInterestRate = 0.05; 
        double monthlyInterestRate = annualInterestRate / 12; 
        double accountValue = 0; 

        for (int month = 1; month <= 6; month++) {
            accountValue = (accountValue + monthlyDeposit) * (1 + monthlyInterestRate);
        }

        System.out.printf("After the sixth month, the account value is $%.2f\n", accountValue);

        input.close();
    }
}