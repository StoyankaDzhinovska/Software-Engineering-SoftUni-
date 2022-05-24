import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegetableMenuPrice = 8.15;

        int numberChickenMenus = Integer.parseInt(scanner.nextLine());
        int numberFishMenus = Integer.parseInt(scanner.nextLine());
        int numberVegetableMenus = Integer.parseInt(scanner.nextLine());

        double totalChickenMenus = chickenMenuPrice * numberChickenMenus;
        double totalFishMenus = fishMenuPrice * numberFishMenus;
        double totalVegetableMenus = vegetableMenuPrice * numberVegetableMenus;
        double allMenusPrice = totalChickenMenus + totalFishMenus + totalVegetableMenus;

        double dessert = allMenusPrice * 0.20;

        double delivery = 2.5;

        double finalMoney = allMenusPrice + dessert + delivery;

        System.out.println(finalMoney);

    }
}
