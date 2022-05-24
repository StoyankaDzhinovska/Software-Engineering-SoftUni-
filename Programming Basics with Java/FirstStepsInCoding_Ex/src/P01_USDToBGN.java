import java.util.Scanner;

public class P01_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountUSD = Double.parseDouble(scanner.nextLine());
        double rateUSDtoBGN = 1.79549;
        double amountBNG = amountUSD *  rateUSDtoBGN;

        System.out.println(amountBNG);
    }
}
