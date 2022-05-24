import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double pens = 5.8;
        double markers = 7.2;
        double detergent = 1.2;

        int numberPens = Integer.parseInt(scanner.nextLine());
        int numberMarkers = Integer.parseInt(scanner.nextLine());
        int littersDetergent = Integer.parseInt(scanner.nextLine());
        int percents = Integer.parseInt(scanner.nextLine());

        double totalMoneyPens = pens * numberPens;
        double totalMoneyMarkers = markers * numberMarkers;
        double totalDetergent = detergent * littersDetergent;
        double totalMoney = totalMoneyPens + totalMoneyMarkers + totalDetergent;
        double totalMoneyWithDiscount = totalMoney - (totalMoney * percents / 100);

        System.out.println(totalMoneyWithDiscount);

    }
}
