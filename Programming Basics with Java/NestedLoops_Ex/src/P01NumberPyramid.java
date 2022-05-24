import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        int currentNumb = 0;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                currentNumb++;
                if (currentNumb > n) {
                    flag = true;
                    break;
                }
                System.out.print(currentNumb + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
