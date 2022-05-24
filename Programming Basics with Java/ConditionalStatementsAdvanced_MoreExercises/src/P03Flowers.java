import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberChrysanthemum = Integer.parseInt(scanner.nextLine());
        int numberRoses = Integer.parseInt(scanner.nextLine());
        int numberTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String regularDayOrHoliday = scanner.nextLine();

        double bouquetPriceAllFlowers = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            double totalMoneyChrysanthemum = numberChrysanthemum * 2;
            double totalMoneyRoses = numberRoses * 4.1;
            double totalMoneyTulips = numberTulips * 2.5;
            if (regularDayOrHoliday.equals("Y")) {
                bouquetPriceAllFlowers = (totalMoneyChrysanthemum + totalMoneyRoses + totalMoneyTulips) * 1.15;
            } else {
                bouquetPriceAllFlowers = totalMoneyChrysanthemum + totalMoneyRoses + totalMoneyTulips;
            }
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            double totalMoneyChrysanthemum = numberChrysanthemum * 3.75;
            double totalMoneyRoses = numberRoses * 4.5;
            double totalMoneyTulips = numberTulips * 4.15;
            if (regularDayOrHoliday.equals("Y")) {
                bouquetPriceAllFlowers = (totalMoneyChrysanthemum + totalMoneyRoses + totalMoneyTulips) * 1.15;
            } else {
                bouquetPriceAllFlowers = totalMoneyChrysanthemum + totalMoneyRoses + totalMoneyTulips;
            }
        }
        if (numberTulips > 7 && season.equals("Spring")) {
            bouquetPriceAllFlowers = bouquetPriceAllFlowers * 0.95;
        }
        if (numberRoses >= 10 && season.equals("Winter")) {
            bouquetPriceAllFlowers = bouquetPriceAllFlowers * 0.90;
        }
        if ((numberChrysanthemum + numberRoses + numberTulips) > 20) {
            bouquetPriceAllFlowers = bouquetPriceAllFlowers * 0.80;
        }
        double filalPrice = bouquetPriceAllFlowers + 2;
        System.out.printf("%.2f", filalPrice);
    }
}
