import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int numberOfFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (typeFlower) {
            case "Roses":
                totalPrice = numberOfFlower * 5;
                if (numberOfFlower > 80) {
                    totalPrice = totalPrice * 0.9;
                }
                break;
            case "Dahlias":
                totalPrice = numberOfFlower * 3.8;
                if (numberOfFlower > 90) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Tulips":
                totalPrice = numberOfFlower * 2.8;
                if (numberOfFlower > 80) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Narcissus":
                totalPrice = numberOfFlower * 3.0;
                if (numberOfFlower < 120) {
                    totalPrice = totalPrice * 1.15;
                }
                break;
            case "Gladiolus":
                totalPrice = numberOfFlower * 2.5;
                if (numberOfFlower < 80) {
                    totalPrice = totalPrice * 1.20;
                }
                break;
        }
        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlower, typeFlower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
