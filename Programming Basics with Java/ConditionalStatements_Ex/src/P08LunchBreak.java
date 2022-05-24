import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String movieName = scanner.nextLine();
        int minutesPerMovie = Integer.parseInt(scanner.nextLine());
        int breakMinutes = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakMinutes / 8.0;
        double breakTime = breakMinutes / 4.0;

        double leftTime = breakMinutes - lunchTime - breakTime;
        double diff = Math.abs(leftTime - minutesPerMovie);

        if (leftTime >= minutesPerMovie) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, Math.ceil(diff));
        } else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, Math.ceil(diff));

    }
}
