import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washmachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double money = 0;
        double allMoney = 0;
        int brotherCount = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
                countToys++;
            } else {
                brotherCount++;
                money = money + 10;
                allMoney = allMoney + money;
            }
        }
        double sumToys = countToys * toyPrice;
        double totalSum = sumToys + allMoney - brotherCount;

        double diff = Math.abs(totalSum - washmachinePrice);
        if (totalSum >= washmachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}

