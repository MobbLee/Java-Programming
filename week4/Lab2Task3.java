public class Lab2Task3 {
    public static void main(String[] args) {
        int today = 2; 
        int daysLater = 100;
        int dayIndex = (today + daysLater) % 7;

        String resultDay;

        switch (dayIndex) {
            case 0:
                resultDay = "Sunday";
                break;
            case 1:
                resultDay = "Monday";
                break;
            case 2:
                resultDay = "Tuesday";
                break;
            case 3:
                resultDay = "Wednesday";
                break;
            case 4:
                resultDay = "Thursday";
                break;
            case 5:
                resultDay = "Friday";
                break;
            case 6:
                resultDay = "Saturday";
                break;
            default:
                resultDay = "Unknown"; 
                break;
        }

        System.out.println("Today is Tuesday. The day in 100 days will be " + resultDay + ".");
    }
}