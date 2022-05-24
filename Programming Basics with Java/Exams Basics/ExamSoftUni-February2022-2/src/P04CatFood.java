import java.util.Scanner;

public class P04CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCats = Integer.parseInt(scanner.nextLine());

        int numberCatsGroup1 = 0;
        int numberCatsGroup2 = 0;
        int numberCatsGroup3 = 0;

        double gramsFood = 0;


        for (int i = 0; i < numberCats; i += 1) {
            double input = Double.parseDouble(scanner.nextLine());
            if (input >= 100 && input < 200) {
                gramsFood = gramsFood + input;
                numberCatsGroup1++;

            } else if (input >= 200 && input < 300) {
                gramsFood = gramsFood + input;
                numberCatsGroup2++;

            } else if (input >= 300 && input < 400) {
                gramsFood = gramsFood + input;
                numberCatsGroup3++;

            }

        }
        double moneyFoodPerDay = (gramsFood / 1000) * 12.45;

        System.out.printf("Group 1: %d cats.%n", numberCatsGroup1);
        System.out.printf("Group 2: %d cats.%n", numberCatsGroup2);
        System.out.printf("Group 3: %d cats.%n", numberCatsGroup3);
        System.out.printf("Price for food per day: %.2f lv.%n", moneyFoodPerDay);
    }
}
