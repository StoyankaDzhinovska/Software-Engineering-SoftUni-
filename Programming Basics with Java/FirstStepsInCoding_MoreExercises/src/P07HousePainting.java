import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        double areaFrontAndBackWalls = (x * x) * 2 - (1.2 * 2);
        double areaSideWalls = (x * y) * 2 - (1.5 * 1.5 * 2);
        double areaRoof1 = ((x * y) * 2);
        double areaRoof2 = ((x * h) * 2 / 2);

        double areaAllWalls = areaFrontAndBackWalls + areaSideWalls;
        double areaAllroof = areaRoof1 + areaRoof2;

        double walls = areaAllWalls / 3.4;
        double roof = areaAllroof / 4.3;

        System.out.printf("%.2f %n%.2f", walls, roof);

    }
}
