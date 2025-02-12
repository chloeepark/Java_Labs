// Eunseo Park (301423139)
import java.util.Scanner;

public class InsuranceDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        Insurance[] insurances = new Insurance[2]; // Create an array of Insurance objects

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter type of insurance (Health/Life):");
            String type = scanner.nextLine();
            System.out.println("Enter monthly cost:");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            if (type.equalsIgnoreCase("Health")) {
                insurances[i] = new Health();
            } else if (type.equalsIgnoreCase("Life")) {
                insurances[i] = new Life();
            } else {
                System.out.println("Invalid type, try again.");
                i--;
                continue;
            }

            insurances[i].setInsuranceCost(cost); // Set the monthly cost
        }

        // Display insurance information
        System.out.println("\nInsurance Information:");
        for (Insurance insurance : insurances) {
            insurance.displayInfo();
        }

        scanner.close();
    }
}
