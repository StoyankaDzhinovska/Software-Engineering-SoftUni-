import java.util.Scanner;

public class P08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int feePerYear = Integer.parseInt(scanner.nextLine());

        double shoes = feePerYear * 0.60;
        double suit = shoes * 0.80;
        double ball = suit * 0.25;
        double additionalItems = ball * 0.2;

        double moneyForBacketball = feePerYear + shoes + suit + ball + additionalItems;

        System.out.println(moneyForBacketball);

    }
}
