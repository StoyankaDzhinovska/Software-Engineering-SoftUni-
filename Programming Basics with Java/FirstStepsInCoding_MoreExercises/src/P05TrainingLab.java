import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double areaW = (w * 100);
        double areaH = (h * 100);
        double areaCorridor = 100;
        double areaWorkingPlacesW = areaW;
        double areaWorkingPlacesH = areaH - areaCorridor;

        double workingPlacesW = Math.floor(areaWorkingPlacesW / 120);
        double workingPlacesH = Math.floor(areaWorkingPlacesH / 70);

        double allWorkingPlaces = (workingPlacesH * workingPlacesW) - 3;

        System.out.printf("%.0f", allWorkingPlaces);
    }
}
