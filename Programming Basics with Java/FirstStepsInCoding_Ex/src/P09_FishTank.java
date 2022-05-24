import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double persentNotWater = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double volumeDm3 = volume / 1000.0;

        double waterNeeded = volumeDm3 - ( volumeDm3 * (persentNotWater / 100));

        System.out.println(waterNeeded);

    }
}
