import java.util.Scanner;

public class P04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDays = Integer.parseInt(scanner.nextLine());

        double totalLittersRakia = 0;
        double percentAlcoholRakia = 0;
        for (int i = 1; i <= numberDays; i++) {
            double input1 = Double.parseDouble(scanner.nextLine()); //количетсво ракия
            double input2 = Double.parseDouble(scanner.nextLine()); //градус на ракията
            totalLittersRakia = totalLittersRakia + input1;
            percentAlcoholRakia = percentAlcoholRakia + (input1 * input2);

        }
        double finalPercentalcohol = percentAlcoholRakia / totalLittersRakia;
        System.out.printf("Liter: %.2f%n", totalLittersRakia);
        System.out.printf("Degrees: %.2f%n", finalPercentalcohol);
        if (finalPercentalcohol < 38) {
            System.out.println("Not good, you should baking!");
        } else if (finalPercentalcohol > 38 && finalPercentalcohol < 42) {
            System.out.println("Super!");
        } else if (finalPercentalcohol > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
