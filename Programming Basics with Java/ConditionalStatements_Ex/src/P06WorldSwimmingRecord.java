import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double timeInSecondsIvan = distanceInMeters * timeInSeconds;
        double distance15 = Math.floor(distanceInMeters / 15);
        double additionalSeconds = distance15 * 12.5;
        double totalTime = timeInSecondsIvan + additionalSeconds;
        double diff = Math.abs(recordInSeconds - totalTime);

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

    }
}
