 import java.util.Scanner;
 public class Lab2Task17 {
   
        public static void main(String[] args) {
            int lottery = (int)(Math.random() * 100);
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your lottery pick (two digits): ");
            int guess = input.nextInt();
            
            String formattedLottery = String.format("%02d", lottery);
            String formattedGuess = String.format("%02d", guess);
            
            char lotteryDigit1 = formattedLottery.charAt(0);
            char lotteryDigit2 = formattedLottery.charAt(1);
            char guessDigit1 = formattedGuess.charAt(0);
            char guessDigit2 = formattedGuess.charAt(1);
    
            System.out.println("The lottery number is " + formattedLottery);
            
            if (formattedGuess.equals(formattedLottery)) {
                System.out.println("Exact match: you win $10,000");
            } else if ((lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)) {
                System.out.println("Match all digits: you win $3,000");
            } else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2) {
                System.out.println("Match one digit: you win $1,000");
            } else {
                System.out.println("Sorry: no match");
            }
        }
    }
    


