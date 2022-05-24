import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLocations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < numberLocations; i += 1) {
            double input1 = Double.parseDouble(scanner.nextLine()); //очакван среден добив
            double input2 = Double.parseDouble(scanner.nextLine()); // дни на тази локация
            double allDaysGoldMiming = 0;
            for (int j = 0; j < input2; j += 1) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                allDaysGoldMiming = allDaysGoldMiming + goldPerDay;
            }
            double averageGoldMining = allDaysGoldMiming / input2;
            if (averageGoldMining >= input1) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldMining);
            } else if (averageGoldMining < input1) {
                double diff = Math.abs(averageGoldMining - input1);
                System.out.printf("You need %.2f gold.", diff);
            }
            i++;
        }
    }
}
