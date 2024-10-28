import java.util.Scanner;

public class W8T22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; 

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double minimum = min(numbers);
        System.out.println("The minimum number is " + minimum);

        scanner.close(); 
    }

    public static double min(double[] array) {
        double smallest = array[0]; 
        for (double value : array) {
            if (value < smallest) {
                smallest = value; 
            }
        }
        return smallest;
    }
}