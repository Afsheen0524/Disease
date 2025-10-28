import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Disease Tracker");
        System.out.print("Enter disease name: ");
        String diseaseName = scanner.nextLine();
        System.out.print("Enter number of deaths: ");
        long deaths = scanner.nextLong();
        System.out.print("Enter population: ");
        long population = scanner.nextLong();
        double mortalityRate = (double) deaths / population * 100;
        System.out.println("\n--- Disease Report ---");
        System.out.println("Disease: " + diseaseName);
        System.out.println("Deaths: " + deaths);
        System.out.println("Population: " + population);
        System.out.printf("Mortality Rate: %.4f%%\n", mortalityRate);
        scanner.close();
    }
}
