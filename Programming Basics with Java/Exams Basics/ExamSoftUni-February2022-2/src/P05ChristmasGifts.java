import java.util.Scanner;

public class P05ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int adults = 0;
        int kids = 0;

        int moneyToys = 0;
        int moneySweaters = 0;

        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);
            if (age <= 16) {
                kids++;
                command = scanner.nextLine();
            } else if (age > 16) {
                adults++;
                command = scanner.nextLine();
            }
        }
        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", (kids * 5));
        System.out.printf("Money for sweaters: %d%n", (adults * 15));
    }
}
