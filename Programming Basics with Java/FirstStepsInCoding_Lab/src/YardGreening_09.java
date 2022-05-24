import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yard = Double.parseDouble(scanner.nextLine());

        double price = 7.61;

        double priceTotal = yard * price;
        double priceDiscount = priceTotal * 0.18;
        double discount = priceTotal - priceDiscount;


        System.out.println("The final price is: " + discount + " lv.");
        System.out.println("The discount is: " + priceDiscount + " lv.");

    }
}
