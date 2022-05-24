import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double littersP1 = p1 * h;
        double littersP2 = p2 * h;
        double totalLitters = littersP1 + littersP2;

        if (v >= totalLitters) {
            double totalFullness = totalLitters / v * 100;
            double totalLittersP1 = littersP1 / totalFullness * 10;
            double totalLittersP2 = littersP2 / totalFullness * 10;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalFullness, totalLittersP1, totalLittersP2);
        } else if (v < totalLitters) {
            double diff = Math.abs(v - totalLitters);
            System.out.printf("For %.1f hours the pool overflows with %.2f liters.", h, diff);
        }
    }
}
