public class Lab2Task13 {
    public static void main(String[] args) {
        int today = 2;

        int daysToAdd = 100;

        int dayIndex = (today + daysToAdd) % 7;

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Today is Tuesday. The day of the week in 100 days will be: " + daysOfWeek[dayIndex]);
    }
}
