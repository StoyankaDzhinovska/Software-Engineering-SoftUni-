import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double coffePrice = 0;
        double waterPrice = 0;
        double beerPrice = 0;
        double sweetsPrice = 0;
        double peanutsPrice = 0;
        double priceToPay = 0;

        if (city.equals("Sofia")) {
            coffePrice = 0.5;
            waterPrice = 0.8;
            beerPrice = 1.2;
            sweetsPrice = 1.45;
            peanutsPrice = 1.6;
            if (product.equals("coffee")) {
                priceToPay = coffePrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("water")) {
                priceToPay = waterPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("beer")) {
                priceToPay = beerPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("sweets")) {
                priceToPay = sweetsPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("peanuts")) {
                priceToPay = peanutsPrice * quantity;
                System.out.println(priceToPay);
            }
        } else if (city.equals("Plovdiv")) {
            coffePrice = 0.4;
            waterPrice = 0.7;
            beerPrice = 1.15;
            sweetsPrice = 1.30;
            peanutsPrice = 1.5;
            if (product.equals("coffee")) {
                priceToPay = coffePrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("water")) {
                priceToPay = waterPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("beer")) {
                priceToPay = beerPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("sweets")) {
                priceToPay = sweetsPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("peanuts")) {
                priceToPay = peanutsPrice * quantity;
                System.out.println(priceToPay);
            }
        } else if (city.equals("Varna")) {
            coffePrice = 0.45;
            waterPrice = 0.7;
            beerPrice = 1.1;
            sweetsPrice = 1.35;
            peanutsPrice = 1.55;
            if (product.equals("coffee")) {
                priceToPay = coffePrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("water")) {
                priceToPay = waterPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("beer")) {
                priceToPay = beerPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("sweets")) {
                priceToPay = sweetsPrice * quantity;
                System.out.println(priceToPay);
            } else if (product.equals("peanuts")) {
                priceToPay = peanutsPrice * quantity;
                System.out.println(priceToPay);
            }
        }
    }
}
