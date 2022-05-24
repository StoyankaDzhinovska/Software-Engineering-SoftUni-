import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statActors = Integer.parseInt(scanner.nextLine());
        double priceClothesPerActor = Double.parseDouble(scanner.nextLine());

        double moneyDeco = budget * 0.10;
        double moneyClothes = statActors * priceClothesPerActor;

        if (statActors > 150) {
            moneyClothes = moneyClothes * 0.90;
        } else {
            moneyClothes = moneyClothes;
        }

        double moneyTotal = moneyDeco + moneyClothes;
        double diff = Math.abs(budget - moneyTotal);

        if (moneyTotal > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else if (moneyTotal <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }


    }
}
