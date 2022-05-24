import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzlleNumber = Integer.parseInt(scanner.nextLine());
        int dollNumber = Integer.parseInt(scanner.nextLine());
        int teddyBearNumber = Integer.parseInt(scanner.nextLine());
        int minionsNumber = Integer.parseInt(scanner.nextLine());
        int trucksNumber = Integer.parseInt(scanner.nextLine());

        double puzzlePriceTotal = 2.6 * puzlleNumber;
        double dollPriceTotal = 3.0 * dollNumber;
        double teddyBearPriceTotal = 4.1 * teddyBearNumber;
        double minionPriceTotal = 8.2 * minionsNumber;
        double truckPriceTotal = 2 * trucksNumber;

        int allToysNumber= puzlleNumber + dollNumber + teddyBearNumber + minionsNumber + trucksNumber;
        double allToysPrice = puzzlePriceTotal + dollPriceTotal + teddyBearPriceTotal + minionPriceTotal + truckPriceTotal;

        double allToysPriceFinal =0;

        if ( allToysNumber >= 50) {
            allToysPriceFinal = allToysPrice * 0.75;
        } else {
            allToysPriceFinal = allToysPrice;
        }
        double profit = allToysPriceFinal * 0.90;
        double diff = Math.abs(profit - tourPrice);

        if ( profit >= tourPrice ) {
            System.out.printf( "Yes! %.2f lv left.", diff );
        } else {
            System.out.printf( "Not enough money! %.2f lv needed.", diff);
        }

        }
    }

