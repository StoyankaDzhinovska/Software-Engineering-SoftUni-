import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLoads = Integer.parseInt(scanner.nextLine());
        int currentLoad = Integer.parseInt(scanner.nextLine());


        int priceMicrobus = 0;
        int priceTruck = 0;
        int priceTrain = 0;
        for (int i = 0; i < numberLoads; i++) {
            int allLoadMoney = 0;
            int allLoadKGs = 0;
            if (currentLoad <= 3) {
                priceMicrobus = currentLoad * 200;
                allLoadMoney = priceMicrobus;
                allLoadKGs = allLoadKGs + currentLoad;
                i++;
            } else if (currentLoad >= 4 && currentLoad <= 11) {
                priceTruck = currentLoad * 175;
                allLoadMoney = priceTruck;
                allLoadKGs = allLoadKGs + currentLoad;
                i++;
            } else if (currentLoad >= 12) {
                priceTrain = currentLoad * 120;
                allLoadMoney = priceTrain;
                allLoadKGs = allLoadKGs + currentLoad;
                i++;
            }
            double averageForLoad = allLoadMoney / allLoadKGs;
            System.out.printf("%,2f", averageForLoad);

        }


    }
}
