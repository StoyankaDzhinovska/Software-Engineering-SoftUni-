import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int currentNumber = startNumber; currentNumber <= endNumber; currentNumber++) {

            System.out.print(currentNumber + " ");
            sum = sum + currentNumber;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
