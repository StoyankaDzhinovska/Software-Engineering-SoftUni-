import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        int allMinutes = (initHour * 60) + initMin + 15;
        int hour
                = allMinutes / 60;
        int minutes = allMinutes % 60;

        if (hour >23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
