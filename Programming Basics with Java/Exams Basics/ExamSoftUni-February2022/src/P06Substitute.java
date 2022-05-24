import java.util.Scanner;

public class P06Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n1 = Integer.parseInt(scanner.nextLine());

        // "{K}{L} - {M}{N}"
        //K - k до 8 - 7
        //L - 9 до l - 6
        //M - m до 8 - 8
        //N - 9 до n - 5

        boolean isK = k >= k && k <= 8 && k % 2 == 0;
        boolean isL = l >= l && l <= 9 && l % 2 != 0;
        boolean isM = m >= m && m <= 8 && m % 2 == 0;
        boolean isN = n1 >= n1 && n1 <= 9 && n1 % 2 != 0;
        if (isK && isL && isM && isN) {
            System.out.println("%d %d - %d %d", k, l, m, n1);
        }
    }
}

