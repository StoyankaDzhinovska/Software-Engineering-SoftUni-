import java.util.Scanner;

public class P03FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int numberSouvenirs = Integer.parseInt(scanner.nextLine());

        double moneySpendForSouvenirs = 0;

        if (team.equals("Argentina")) {
            if (typeSouvenir.equals("flags")) {
                moneySpendForSouvenirs = 3.25 * numberSouvenirs;
            } else if (typeSouvenir.equals("caps")) {
                moneySpendForSouvenirs = 7.2 * numberSouvenirs;
            } else if (typeSouvenir.equals("posters")) {
                moneySpendForSouvenirs = 5.1 * numberSouvenirs;
            } else if (typeSouvenir.equals("stickers")) {
                moneySpendForSouvenirs = 1.25 * numberSouvenirs;
            } else {
                System.out.println("Invalid stock!");
            }
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, team, moneySpendForSouvenirs);
        } else if (team.equals("Brazil")) {
            if (typeSouvenir.equals("flags")) {
                moneySpendForSouvenirs = 4.2 * numberSouvenirs;
            } else if (typeSouvenir.equals("caps")) {
                moneySpendForSouvenirs = 8.5 * numberSouvenirs;
            } else if (typeSouvenir.equals("posters")) {
                moneySpendForSouvenirs = 5.35 * numberSouvenirs;
            } else if (typeSouvenir.equals("stickers")) {
                moneySpendForSouvenirs = 1.2 * numberSouvenirs;
            } else {
                System.out.println("Invalid stock!");

            }
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, team, moneySpendForSouvenirs);
        } else if (team.equals("Croatia")) {
            if (typeSouvenir.equals("flags")) {
                moneySpendForSouvenirs = 2.75 * numberSouvenirs;
            } else if (typeSouvenir.equals("caps")) {
                moneySpendForSouvenirs = 6.90 * numberSouvenirs;
            } else if (typeSouvenir.equals("posters")) {
                moneySpendForSouvenirs = 4.95 * numberSouvenirs;
            } else if (typeSouvenir.equals("stickers")) {
                moneySpendForSouvenirs = 1.1 * numberSouvenirs;
            } else {
                System.out.println("Invalid stock!");
            }
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, team, moneySpendForSouvenirs);
        } else if (team.equals("Denmark")) {
            if (typeSouvenir.equals("flags")) {
                moneySpendForSouvenirs = 3.1 * numberSouvenirs;
            } else if (typeSouvenir.equals("caps")) {
                moneySpendForSouvenirs = 6.5 * numberSouvenirs;
            } else if (typeSouvenir.equals("posters")) {
                moneySpendForSouvenirs = 4.8 * numberSouvenirs;
            } else if (typeSouvenir.equals("stickers")) {
                moneySpendForSouvenirs = 0.9 * numberSouvenirs;
            } else {
                System.out.println("Invalid stock!");
            }
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, team, moneySpendForSouvenirs);
        } else {
            System.out.println("Invalid country!");
        }

    }
}
