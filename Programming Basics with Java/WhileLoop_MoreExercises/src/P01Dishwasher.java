import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersBottlesDetergent = Integer.parseInt(scanner.nextLine());

        int detergentInMilliliters = numbersBottlesDetergent * 750;

        //за 1 чиния са нужни 5 мл., а за тенджера 15 мл
        //всяко трето зареждане със съдове, съдомиялната се пълни само с тенджери, а останалите пъти с чинии.
        // End спира цикъла

        int dishesWashed = 0;
        int potsWashed = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int currentDishes1 = Integer.parseInt(scanner.nextLine());
            dishesWashed = dishesWashed + currentDishes1;

            int currentDishes2 = Integer.parseInt(scanner.nextLine());
            dishesWashed = dishesWashed + currentDishes2;

            int currentPots = Integer.parseInt(scanner.nextLine());
            potsWashed = potsWashed + currentPots;

            int detergentNeeded = ((currentDishes1 + currentDishes1) * 5 + (potsWashed * 15));
            int diff = Math.abs(detergentNeeded - detergentInMilliliters);
            if (detergentNeeded >= detergentInMilliliters) {
                System.out.printf("Leftover detergent %d", diff);
            } else {
                System.out.println("Detergent not enough!");
                System.out.printf("%d dishes and %d pots were washed.%n", dishesWashed, potsWashed);
                System.out.printf("Leftover detergent %d ml.", diff);
            }

        }
    }
}

