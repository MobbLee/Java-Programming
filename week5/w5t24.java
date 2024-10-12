import java.util.Scanner;

public class w5t24{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        
        do {
            System.out.print("Enter a letter: ");
            letter = input.next().charAt(0);
            
            if (!Character.isLetter(letter)) {
                System.out.println(letter + " is an invalid input");
            }
            
            else if ("aeiouAEIOU".indexOf(letter) != -1) {
                System.out.println(letter + " is a vowel");
            } else if ("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(letter) != -1) {
                System.out.println(letter + " is a consonant");
            }
            
            System.out.print("\nPress Enter to continue or type 'exit' to quit: ");
            String continueInput = input.next();
            if (!continueInput.isEmpty() && !continueInput.equalsIgnoreCase("exit")) {
                letter = continueInput.charAt(0);
            }
        } while (!input.nextLine().equals("exit"));
    }
}