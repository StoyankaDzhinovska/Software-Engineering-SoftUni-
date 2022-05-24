import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double safetyNylonPrice = 1.5;
        double paintPrice = 14.5;
        double addPaintPrice = 5.0;

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int addPaint = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalPaintNeeded = paint * 1.10;
        double totalNylonNeeded = nylon + 2.0;
        double bags = 0.4;

        double allMaterialsPrice = (totalNylonNeeded * safetyNylonPrice) + (totalPaintNeeded * paintPrice) + (addPaint * addPaintPrice) + bags;
        double moneyPaintersPerHour = allMaterialsPrice * 0.3 * hours;

        System.out.println(allMaterialsPrice + moneyPaintersPerHour);

    }
}
