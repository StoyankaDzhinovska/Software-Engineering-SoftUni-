import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fats = Integer.parseInt(scanner.nextLine()); // мазнини
        int proteins = Integer.parseInt(scanner.nextLine()); // протеини
        int carbohydrates = Integer.parseInt(scanner.nextLine()); // въглехидрати
        int calories = Integer.parseInt(scanner.nextLine()); //калории
        int percentsWater = Integer.parseInt(scanner.nextLine()); // % вода

        double gramsFats = ( calories * 1.0 * fats / 100 ) / 9;
        double gramsProteins = ( calories * 1.0 * proteins / 100 ) / 4;
        double gramsCarbohidrates = ( calories * 1.0 * carbohydrates / 100 ) / 4;

        double allGrams = gramsFats + gramsProteins + gramsCarbohidrates;
        double calloriesPerGram = calories / allGrams;
        double calloriesPerGramWithoutWater = calloriesPerGram * (100 - percentsWater) / 100;

        System.out.printf("%.4f", calloriesPerGramWithoutWater);
    }
}

