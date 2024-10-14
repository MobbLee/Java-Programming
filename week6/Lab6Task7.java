public class Lab6Task7 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0; 
        for ( i = 0; i < 10; i++) {
            sum += i; 
        }

        int j = 0; 
        if (i < j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }

        while (j < 10) { 
            j++;
        }

        do {
            j++;
        } while (j < 10);
    }
}