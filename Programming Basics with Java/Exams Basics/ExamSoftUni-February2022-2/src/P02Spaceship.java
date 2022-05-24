import java.util.Scanner;

public class P02Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wightShip = Double.parseDouble(scanner.nextLine());
        double lengthShip = Double.parseDouble(scanner.nextLine());
        double heightShip = Double.parseDouble(scanner.nextLine());
        double averageHeightPerAstronaut = Double.parseDouble(scanner.nextLine());

        double volumeShip = wightShip * lengthShip * heightShip;
        double volumeRoom = (averageHeightPerAstronaut + 0.4) * 2 * 2;
        double numberOfAstronauts = Math.floor(volumeShip / volumeRoom);

        if (numberOfAstronauts >= 3 && numberOfAstronauts <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", numberOfAstronauts);
        } else if (numberOfAstronauts < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (numberOfAstronauts > 10) {
            System.out.println("The spacecraft is too big.");
        }
    }
}
