import java.util.Scanner;

public class Lab6Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String originalString = input.nextLine();
        String reversedString = new StringBuilder(originalString).reverse().toString();

        if (originalString.equalsIgnoreCase(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        input.close();
    }
}