import java.util.Scanner;

public class L4T12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int daysInMonth = calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = java.util.Calendar.SUNDAY; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0)
                System.out.println();
        }
        System.out.println(); 
    }
}