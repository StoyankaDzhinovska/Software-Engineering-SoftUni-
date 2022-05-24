import java.util.Scanner;

public class P03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double parcelWeight = Double.parseDouble(scanner.nextLine());
        String typeService = scanner.nextLine();
        int distanceInKm = Integer.parseInt(scanner.nextLine());

        double parcelPrice = 0;
        if (typeService.equals("standard")) {
            if (parcelWeight < 1) {
                parcelPrice = distanceInKm * 0.03;
            } else if (parcelWeight <= 10) {
                parcelPrice = distanceInKm * 0.05;
            } else if (parcelWeight < 40) {
                parcelPrice = distanceInKm * 0.10;
            } else if (parcelWeight < 90) {
                parcelPrice = distanceInKm * 0.15;
            } else if (parcelWeight <= 150) {
                parcelPrice = distanceInKm * 0.20;
            }
        } else if (typeService.equals("express")) {
            if (parcelWeight < 1) {
                double parcelPrice1 = distanceInKm * 0.03;
                double highPricePercentIncreace = 0.03 * 0.80;
                double totalHighPrice = highPricePercentIncreace * parcelWeight;
                double parcelPrice2 = totalHighPrice * distanceInKm;
                parcelPrice = parcelPrice1 + parcelPrice2;
            } else if (parcelWeight <= 10) {
                double parcelPrice1 = distanceInKm * 0.05;
                double highPricePercentIncreace = 0.05 * 0.40;
                double totalHighPrice = highPricePercentIncreace * parcelWeight;
                double parcelPrice2 = totalHighPrice * distanceInKm;
                parcelPrice = parcelPrice1 + parcelPrice2;
            } else if (parcelWeight < 40) {
                double parcelPrice1 = distanceInKm * 0.10;
                double highPricePercentIncreace = 0.10 * 0.05;
                double totalHighPrice = highPricePercentIncreace * parcelWeight;
                double parcelPrice2 = totalHighPrice * distanceInKm;
                parcelPrice = parcelPrice1 + parcelPrice2;
            } else if (parcelWeight < 90) {
                double parcelPrice1 = distanceInKm * 0.15;
                double highPricePercentIncreace = 0.15 * 0.02;
                double totalHighPrice = highPricePercentIncreace * parcelWeight;
                double parcelPrice2 = totalHighPrice * distanceInKm;
                parcelPrice = parcelPrice1 + parcelPrice2;
            } else if (parcelWeight <= 150) {
                double parcelPrice1 = distanceInKm * 0.20;
                double highPricePercentIncreace = 0.20 * 0.01;
                double totalHighPrice = highPricePercentIncreace * parcelWeight;
                double parcelPrice2 = totalHighPrice * distanceInKm;
                parcelPrice = parcelPrice1 + parcelPrice2;
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", parcelWeight, parcelPrice);
    }

}

