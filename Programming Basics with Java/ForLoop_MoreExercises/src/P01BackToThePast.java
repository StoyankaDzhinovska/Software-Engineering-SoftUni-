import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedМoney = Double.parseDouble(scanner.nextLine());
        int endYear = Integer.parseInt(scanner.nextLine());

        int yearsOldIvancho = 18;
        double moneyToLive = 0;
        for (int currentYear = 1800; currentYear <= endYear; currentYear++) {
            if (currentYear % 2 == 0) {
                moneyToLive = moneyToLive + 12000;
                yearsOldIvancho++;
            } else if (currentYear % 2 != 0) {
                moneyToLive = moneyToLive + (12000 + (50 * yearsOldIvancho));
                yearsOldIvancho++;
            }
        }
        double diff = Math.abs(moneyToLive - inheritedМoney); // разлика пари
        if (moneyToLive <= inheritedМoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else if (moneyToLive > inheritedМoney) {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}
