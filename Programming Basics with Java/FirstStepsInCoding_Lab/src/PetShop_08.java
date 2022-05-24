import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsFoodNumber = Integer.parseInt(scanner.nextLine());
        int catsFoodNumber = Integer.parseInt(scanner.nextLine());

        double dogs = dogsFoodNumber*2.5;
        double cats = catsFoodNumber*4;

        double sumLV = cats + dogs;

        System.out.println(sumLV + " lv.");

    }
}
