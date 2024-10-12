import java.util.Scanner;

public class w5t25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstCity, secondCity, thirdCity;
        
        System.out.print("Enter the first city: ");
        firstCity = input.nextLine();
        
        System.out.print("Enter the second city: ");
        secondCity = input.nextLine();
        
        System.out.print("Enter the third city: ");
        thirdCity = input.nextLine();
        
        String[] cities = {firstCity, secondCity, thirdCity};
        for (int i = 0; i < cities.length; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                if (cities[i].compareTo(cities[j]) > 0) {
                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }
        
        System.out.println("The three cities in alphabetical order are " +
                cities[0] + " " + cities[1] + " " + cities[2]);
    }
}