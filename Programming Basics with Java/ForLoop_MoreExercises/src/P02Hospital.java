import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int numberPatientsArrived = 0;
        int numberPatientsTreated = 0;
        int numberPatientsUntreated = 0;
        for (int day = 1; day < period; day += 2) {
            int numberDoctors = 7;
            numberPatientsArrived = Integer.parseInt(scanner.nextLine());
            //всеки лекар преглежда 1 пациент
            numberPatientsTreated = numberDoctors;

            if (numberPatientsArrived > numberPatientsTreated) {
                ++numberDoctors;
                numberPatientsUntreated = numberPatientsArrived - numberPatientsTreated;
            } else {
                numberDoctors = numberDoctors;
            }
        }

        System.out.printf("Treated patients: %d.", numberPatientsTreated);
        System.out.printf("Untreated patients: %d.", numberPatientsUntreated);
    }
}
