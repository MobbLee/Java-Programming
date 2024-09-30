public class task{
    public static void main(String[] args) {
        int today = 2; // Tuesday (0 = Sunday, 1 = Monday, 2 = Tuesday, ..., 6 = Saturday)
        int daysLater = 100;

        int futureDayIndex = (today + daysLater) % 7;

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String futureDay = daysOfWeek[futureDayIndex];

        System.out.println("100 days from Tuesday will be: " + futureDay);
    }
}