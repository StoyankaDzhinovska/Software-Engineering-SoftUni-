import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceKgFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double amountVegetables = priceKgVegetables * kgVegetables;
        double amountFruits = priceKgFruits * kgFruits;

        double allProductsInEuro = (amountVegetables + amountFruits) / 1.94;

        System.out.printf("%.2f", allProductsInEuro);
    }
}
