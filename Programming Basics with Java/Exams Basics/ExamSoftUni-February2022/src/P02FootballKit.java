import java.util.Scanner;

public class P02FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTShirt = Double.parseDouble(scanner.nextLine());
        double targetBillForBall = Double.parseDouble(scanner.nextLine());

        double priceShorts = priceTShirt * 0.75;
        double priceSocks = priceShorts * 0.20;
        double priceShoes = 2 * (priceTShirt + priceShorts);

        double totalPrice = priceTShirt + priceShorts + priceSocks + priceShoes;
        double totalPriceWithDiscount = totalPrice * 0.85;

        if (totalPriceWithDiscount >= targetBillForBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalPriceWithDiscount);
        } else {
            double diff = Math.abs(totalPriceWithDiscount - targetBillForBall);
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", diff);
        }


    }
}
