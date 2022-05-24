import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKgSkumria = Double.parseDouble(scanner.nextLine());
        double priceKgCaca = Double.parseDouble(scanner.nextLine());

        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());

        double priceKgPalamud = priceKgSkumria * 1.6;
        double priceKgSafrid = priceKgCaca * 1.8;
        double priceKgMidi = 7.5;

        double allMoneyToPay = (kgPalamud * priceKgPalamud) + (kgSafrid * priceKgSafrid) + (kgMidi * priceKgMidi);

        System.out.printf("%.2f", allMoneyToPay);
    }
}
