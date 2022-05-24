import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRestDays = Integer.parseInt(scanner.nextLine()); // дни
        int numberWorkDays = 365 - numberRestDays; // дни

        int minutesPlayRestDays = numberRestDays * 127; // минути
        int minutesPlayWorkDays = numberWorkDays * 63; // минути

        int totalMinutesPlay = minutesPlayRestDays + minutesPlayWorkDays;

        if (totalMinutesPlay > 30000) {
            System.out.println("Tom will run away");
            int diff = totalMinutesPlay - 30000;
            int hours = diff / 60;
            int minutes = diff % 60;
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else if (totalMinutesPlay < 30000) {
            int diff = 30000- totalMinutesPlay;
            int hours = Math.abs(diff/60);
            int minutes = diff % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
