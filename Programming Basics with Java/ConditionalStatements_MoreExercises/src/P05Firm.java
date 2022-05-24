import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int daysAvailable = Integer.parseInt(scanner.nextLine());
        int companyWorkers = Integer.parseInt(scanner.nextLine());

        double schoolTime = daysAvailable * 0.10;
        double realDaysAvailable = daysAvailable - schoolTime;
        double workHours = realDaysAvailable * 8;
        double addHours = companyWorkers * (2 * daysAvailable);
        double totalHours = Math.floor(workHours + addHours);
        double diff = Math.abs(totalHours - hoursNeeded);
        if (totalHours >= hoursNeeded) {
            System.out.printf("Yes!%.0f hours left.", diff);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", diff);
        }

    }
}
