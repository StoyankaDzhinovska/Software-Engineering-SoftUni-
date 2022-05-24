import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double allGrape = x * y;
        double wine = Math.floor(allGrape * 0.4) / 2.5;
        if (wine >= z) {
            double diff = Math.ceil(wine - z);
            double winePerWorker = diff / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", diff, winePerWorker);
        } else if (wine < z) {
            double diff = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);

        }
    }
}
