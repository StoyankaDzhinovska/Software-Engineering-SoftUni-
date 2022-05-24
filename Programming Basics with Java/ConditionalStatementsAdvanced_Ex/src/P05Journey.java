import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destinationPlace = "destination";
        String typeVacation = "type";
        double moneyToPay = 0.0;

        if (budget <= 100) {
            destinationPlace = "Bulgaria";
            if (season.equals("summer")) {
                typeVacation = "Camp";
                moneyToPay = budget * 0.3;
                System.out.printf("Somewhere in %s %n%s - %.2f", destinationPlace, typeVacation, moneyToPay);
            } else if (season.equals("winter")) {
                typeVacation = "Hotel";
                moneyToPay = budget * 0.7;
                System.out.printf("Somewhere in %s %n%s - %.2f", destinationPlace, typeVacation, moneyToPay);
            }

        } else if (budget <= 1000) {
            destinationPlace = "Balkans";
            if (season.equals("summer")) {
                typeVacation = "Camp";
                moneyToPay = budget * 0.4;
                System.out.printf("Somewhere in %s %n%s - %.2f", destinationPlace, typeVacation, moneyToPay);
            } else if (season.equals("winter")) {
                typeVacation = "Hotel";
                moneyToPay = budget * 0.8;
                System.out.printf("Somewhere in %s %n%s - %.2f", destinationPlace, typeVacation, moneyToPay);
            }

        } else if (budget > 1000) {
            destinationPlace = "Europe";
            typeVacation = "Hotel";
            moneyToPay = budget * 0.9;
            System.out.printf("Somewhere in %s %n%s - %.2f", destinationPlace, typeVacation, moneyToPay);
        }
    }
}
