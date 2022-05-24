import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        String darOrNight = scanner.nextLine();

        double taxiCost = 0;
        double busCost = 0;
        double trainCost = 0;

        if (distance < 20) {
            switch (darOrNight) {
                case "day":
                    taxiCost = (distance * 0.79) + 0.7;
                    System.out.printf("%.2f", taxiCost);
                    break;
                case "night":
                    taxiCost = (distance * 0.90) + 0.7;
                    System.out.printf("%.2f", taxiCost);
                    break;
            }
        } else if (distance >= 20 && distance <= 100) {
            if (darOrNight.equals("day")) {
                taxiCost = (distance * 0.79) + 0.7;
                busCost = distance * 0.09;
                if (taxiCost > busCost) {
                    System.out.printf("%.2f", busCost);
                } else {
                    System.out.printf("%.2f", taxiCost);
                }
            } else if (darOrNight.equals("night")) {
                taxiCost = (distance * 0.90) + 0.7;
                busCost = distance * 0.09;
                if (taxiCost > busCost) {
                    System.out.printf("%.2f", busCost);
                } else {
                    System.out.printf("%.2f", taxiCost);
                }
            }
        } else if (distance > 100) {
            if (darOrNight.equals("day")) {
                taxiCost = (distance * 0.79) + 0.7;
                busCost = distance * 0.09;
                trainCost = distance * 0.06;
                if (taxiCost > busCost && busCost > trainCost) {
                    System.out.printf("%.2f", trainCost);
                } else if (taxiCost > busCost) {
                    System.out.println(busCost);
                } else {
                    System.out.println(taxiCost);
                }
            } else if (darOrNight.equals("night")) {
                taxiCost = (distance * 0.90) + 0.7;
                busCost = distance * 0.09;
                trainCost = distance * 0.06;
                if (taxiCost > busCost && busCost > trainCost) {
                    System.out.printf("%.2f", trainCost);
                } else if (taxiCost > busCost) {
                    System.out.printf("%.2f", busCost);
                } else {
                    System.out.printf("%.2f", taxiCost);
                }
            }
        }
    }
}