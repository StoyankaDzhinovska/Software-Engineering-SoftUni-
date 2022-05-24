import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double priceSingleRoom = 18;
        double priceApartment = 25;
        double pricePresidentApartment = 35;

        int nightsToPay = daysStay - 1;
        double moneyToPay = 0;

        if (typeRoom.equals("room for one person")) {
            moneyToPay = nightsToPay * priceSingleRoom;
        } else if (typeRoom.equals("apartment")) {
            moneyToPay = nightsToPay * priceApartment;
            if (daysStay < 10) {
                moneyToPay = moneyToPay * 0.7;
            } else if (daysStay >= 10 && daysStay <= 15) {
                moneyToPay = moneyToPay * 0.65;
            } else if (daysStay > 15) {
                moneyToPay = moneyToPay * 0.5;
            }
        } else if (typeRoom.equals("president apartment")) {
            moneyToPay = nightsToPay * pricePresidentApartment;
            if (daysStay < 10) {
                moneyToPay = moneyToPay * 0.9;
            } else if (daysStay >= 10 && daysStay <= 15) {
                moneyToPay = moneyToPay * 0.85;
            } else if (daysStay > 15) {
                moneyToPay = moneyToPay * 0.8;
            }
        }

        double moneyToPayFinalPrice = 0;

        if (evaluation.equals("positive")) {
            moneyToPayFinalPrice = moneyToPay + (moneyToPay*0.25);
        } else if (evaluation.equals("negative")) {
            moneyToPayFinalPrice = moneyToPay - (moneyToPay*0.1);
        }

        System.out.printf("%.2f", moneyToPayFinalPrice);
    }
}
