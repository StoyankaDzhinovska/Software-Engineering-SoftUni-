import java.util.Scanner;

public class P01TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b1 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double trapeziodArea = ( b1 + b2 ) * h * 1.0 / 2;

        System.out.printf("%.2f", trapeziodArea);
    }
}
