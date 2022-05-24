import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberJuniors = Integer.parseInt(scanner.nextLine());
        int numberSeniors = Integer.parseInt(scanner.nextLine());
        String typeTrace = scanner.nextLine();

        if (typeTrace.equals("trail")) {
            double moneyJuniors = numberJuniors * 5.5;
            double moneySeniors = numberSeniors * 7;
            double totalMoney = (moneyJuniors + moneySeniors) * 0.95;
            System.out.printf("%.2f", totalMoney);
        } else if (typeTrace.equals("cross-country")) {
            double moneyJuniors = numberJuniors * 8;
            double moneySeniors = numberSeniors * 9.5;
            double totalMoney = (moneyJuniors + moneySeniors) * 0.95;
            int allBikers = numberJuniors + numberSeniors;
            if (allBikers >= 50) {
                totalMoney = totalMoney * 0.75;
                System.out.printf("%.2f", totalMoney);
            } else {
                System.out.printf("%.2f", totalMoney);
            }
        } else if (typeTrace.equals("downhill")) {
            double moneyJuniors = numberJuniors * 12.25;
            double moneySeniors = numberSeniors * 13.75;
            double totalMoney = (moneyJuniors + moneySeniors) * 0.95;
            System.out.printf("%.2f", totalMoney);
        } else if (typeTrace.equals("road")) {
            double moneyJuniors = numberJuniors * 20;
            double moneySeniors = numberSeniors * 21.5;
            double totalMoney = (moneyJuniors + moneySeniors) * 0.95;
            System.out.printf("%.2f", totalMoney);
        }
    }
}
