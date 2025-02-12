// Eunseo Park (301423139)
package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        Mortgage[] mortgages = new Mortgage[3]; // Create an array of Mortgage objects

        System.out.print("Enter the current prime interest rate: ");
        double primeRate = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < mortgages.length; i++) {
            System.out.print("Enter mortgage type (Business/Personal): ");
            String type = scanner.nextLine();
            System.out.print("Enter mortgage number: ");
            String mortgageNumber = scanner.nextLine();
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter amount of mortgage: ");
            double amountOfMortgage = scanner.nextDouble();
            System.out.print("Enter term (1, 3, or 5 years): ");
            int term = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Create mortgage object based on type
            if (type.equalsIgnoreCase("Business")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amountOfMortgage, primeRate, term);
            } else if (type.equalsIgnoreCase("Personal")) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amountOfMortgage, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type. Please try again.");
                i--;
            }
        }

        // Display mortgage information
        System.out.println("\n" + MortgageConstants.BANK_NAME + " Mortgage Information:");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println();
        }

        scanner.close();
    }
}
