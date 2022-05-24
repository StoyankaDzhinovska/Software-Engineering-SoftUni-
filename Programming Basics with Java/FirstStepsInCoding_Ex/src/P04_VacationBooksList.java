import java.util.Scanner;

public class P04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int pagesPerCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToReadTheBook = Integer.parseInt(scanner.nextLine());

        // pagesPerCurrentBook / pagesPerHour = hoursToReedTheWholeBook
        //hoursToReedTheWholeBook / daysToReadTheBook = daysNeeded

        int hoursToReedTheWholeBook = pagesPerCurrentBook / pagesPerHour;
        int daysNeeded = hoursToReedTheWholeBook / daysToReadTheBook;

        System.out.println(daysNeeded);
    }
}
