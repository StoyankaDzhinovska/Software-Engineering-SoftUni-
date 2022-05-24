import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int stayNights = Integer.parseInt(scanner.nextLine());

        double priceStudioPerNight = 0;
        double priceApartmentPerNight = 0;

        double priceForTheEntireStayStudio = 0;
        double priceForTheEntireStayAppartment = 0;

        if (month.equals("May") || month.equals("October")) {
            priceStudioPerNight = 50;
            priceApartmentPerNight = 65;
            if (stayNights > 7 && stayNights < 14) {
                priceForTheEntireStayStudio = (priceStudioPerNight * stayNights) * 0.95;
                priceForTheEntireStayAppartment = priceApartmentPerNight * stayNights;
            } else if (stayNights > 14) {
                priceForTheEntireStayStudio = (priceStudioPerNight * stayNights) * 0.7;
                priceForTheEntireStayAppartment = (priceApartmentPerNight * stayNights) * 0.9;
            } else {
                priceForTheEntireStayStudio = priceStudioPerNight * stayNights;
                priceForTheEntireStayAppartment = priceApartmentPerNight * stayNights;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudioPerNight = 75.20;
            priceApartmentPerNight = 68.70;
            if (stayNights > 14) {
                priceForTheEntireStayStudio = (priceStudioPerNight * stayNights) * 0.8;
                priceForTheEntireStayAppartment = (priceApartmentPerNight * stayNights) * 0.9;
            } else {
                priceForTheEntireStayStudio = priceStudioPerNight * stayNights;
                priceForTheEntireStayAppartment = priceApartmentPerNight * stayNights;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudioPerNight = 76.00;
            priceApartmentPerNight = 77.00;
            if (stayNights > 14) {
                priceForTheEntireStayStudio = priceStudioPerNight * stayNights;
                priceForTheEntireStayAppartment = (priceApartmentPerNight * stayNights) * 0.9;
            } else {
                priceForTheEntireStayStudio = priceStudioPerNight * stayNights;
                priceForTheEntireStayAppartment = priceApartmentPerNight * stayNights;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", priceForTheEntireStayAppartment);
        System.out.printf("Studio: %.2f lv.", priceForTheEntireStayStudio);
    }
}
