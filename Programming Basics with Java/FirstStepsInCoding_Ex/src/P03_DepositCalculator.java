import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depAmount = Double.parseDouble(scanner.nextLine());
        int moths = Integer.parseInt(scanner.nextLine());
        double yearProsents = Double.parseDouble(scanner.nextLine());

        double increase = depAmount * (yearProsents / 100);
        double increasePerMonth = increase / 12;
        double totalAmount = depAmount + moths * increasePerMonth;

        System.out.println(totalAmount);
    }
}
