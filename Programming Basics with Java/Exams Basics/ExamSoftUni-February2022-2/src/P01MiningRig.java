import java.util.Scanner;

public class P01MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerVideoCard = Integer.parseInt(scanner.nextLine());
        int pricePerAdapter = Integer.parseInt(scanner.nextLine());
        double moneyElectricityPerCardPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerCardPerDay = Double.parseDouble(scanner.nextLine());

        int moneyAllVideoCards = pricePerVideoCard * 13;
        int moneyAllAdapters = pricePerAdapter * 13;
        int allMoney = moneyAllVideoCards + moneyAllAdapters + 1000;
        double dayProfit = profitPerCardPerDay - moneyElectricityPerCardPerDay;
        double totalProfit = 13 * dayProfit;
        double daysNeeded = Math.ceil(allMoney / totalProfit);

        System.out.println(allMoney);
        System.out.printf("%.0f", daysNeeded);
    }
}
