import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalBudget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        if (numberOfPeople <= 4) {
            double ticketBudget = totalBudget * 0.25;

            if (category.equals("VIP")) {
                double moneyAllTickets = 499.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            } else if (category.equals("Normal")) {
                double moneyAllTickets = 249.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            }
        } else if (numberOfPeople <= 9) {
            double ticketBudget = totalBudget * 0.40;

            if (category.equals("VIP")) {
                double moneyAllTickets = 499.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            } else if (category.equals("Normal")) {
                double moneyAllTickets = 249.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            }
        } else if (numberOfPeople <= 24) {
            double ticketBudget = totalBudget * 0.50;

            if (category.equals("VIP")) {
                double moneyAllTickets = 499.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            } else if (category.equals("Normal")) {
                double moneyAllTickets = 249.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            }
        } else if (numberOfPeople <= 49) {
            double ticketBudget = totalBudget * 0.60;

            if (category.equals("VIP")) {
                double moneyAllTickets = 499.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            } else if (category.equals("Normal")) {
                double moneyAllTickets = 249.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            }
        } else if (numberOfPeople > 50) {
            double ticketBudget = totalBudget * 0.75;

            if (category.equals("VIP")) {
                double moneyAllTickets = 499.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            } else if (category.equals("Normal")) {
                double moneyAllTickets = 249.99 * numberOfPeople;
                double diff = Math.abs(ticketBudget - moneyAllTickets);
                if (ticketBudget >= moneyAllTickets) {
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
            }
        }
    }
}
