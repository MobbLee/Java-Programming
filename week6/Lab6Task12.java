public class Lab6Task12 {
    public static void main(String[] args) {
        int count = 0; 
        int number = 2; 
        System.out.println("First 50 prime numbers:");

        while (count < 50) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

            number++;
        }
    }
}