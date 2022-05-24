import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int number = 1; number <= n; number++) {
            int value1 = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + value1;
        }
        for (int number = 1; number <= n; number++) {
            int value2 = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + value2;
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            int diff = sum1 - sum2;
            System.out.printf("No, diff = %d", Math.abs(diff));
        }
    }
}

