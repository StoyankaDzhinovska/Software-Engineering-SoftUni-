import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        if (celsius >= 26 && celsius <= 35) {
            System.out.println("Hot");
        } else if (celsius >= 20.1 && celsius <= 25.9) {
            System.out.println("Warm");
        } else if (celsius >= 15 && celsius <= 20) {
            System.out.println("Mild");
        } else if (celsius >= 12 && celsius <= 14.9) {
            System.out.println("Cool");
        } else if (celsius >= 5 && celsius <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
