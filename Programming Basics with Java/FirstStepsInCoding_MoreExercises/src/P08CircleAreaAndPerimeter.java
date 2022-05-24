import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

         double areaCircle = (Math.PI * Math.pow(r,2));
         double perimeterCircle = (Math.PI* r * 2);

        System.out.printf("%.2f%n", areaCircle);
        System.out.printf("%.2f", perimeterCircle);

    }
}
