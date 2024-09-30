public class Lab2Task9 {
    public static void main(String[] args) {
        double monthlyDeposit = 100; 
        double annualInterestRate = 0.05; 
        double monthlyInterestRate = annualInterestRate / 12; 
        double accountBalance = 0; 

        for (int month = 1; month <= 6; month++) {
            accountBalance = (accountBalance + monthlyDeposit) * (1 + monthlyInterestRate);
            System.out.printf("After month %d, the account balance is %.3f\n", month, accountBalance);
        }
    }
}