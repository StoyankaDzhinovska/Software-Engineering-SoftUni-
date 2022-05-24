import java.lang.annotation.IncompleteAnnotationException;
import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numProjects = Integer.parseInt(scanner.nextLine());
        int hours = numProjects *3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
        name, hours, numProjects);
    }
}
