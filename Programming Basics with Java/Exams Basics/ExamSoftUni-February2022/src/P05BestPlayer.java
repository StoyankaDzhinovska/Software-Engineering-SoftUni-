import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer = scanner.nextLine();

        String bestPlayer = "";
        int bestGoals = 0;
        while (!namePlayer.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
                if (goals > bestGoals) {
                    bestPlayer = namePlayer;
                    bestGoals = goals;
                }
                       if (goals >= 10) {
                           bestPlayer = namePlayer;
                           bestGoals = goals;
                break;
            }
            namePlayer = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (bestGoals > 0 && bestGoals < 3) {
            System.out.printf("He has scored %d goals.", bestGoals);
        } else if (bestGoals >= 3 ) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestGoals);
        }

    }
}