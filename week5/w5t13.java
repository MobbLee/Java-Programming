import java.util.Scanner;
public class w5t13 {
    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter a character:");
                String s = input.nextLine();
                char ch = s.charAt(0);
                System.out.println("The character entered is " + ch);
            }
    } 
}
