// Eunseo Park (301423139)
package exercise2;

import java.util.Scanner;

public class GameTesterDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter game tester name:");
        String name = scanner.nextLine(); 
        System.out.println("Is the tester full-time? (yes/no):");
        String fullTimeResponse = scanner.nextLine(); 

        GameTester gameTester; // Declare a GameTester object
        if (fullTimeResponse.equalsIgnoreCase("yes")) {
            gameTester = new FullTimeGameTester(name);
        } else {
            System.out.println("Enter worked hours:");
            int hoursWorked = scanner.nextInt();
            gameTester = new PartTimeGameTester(name, hoursWorked);
        }

        // Display game tester information
        System.out.println("Game Tester Name: " + gameTester.getName());
        System.out.println("Full-time status: " + gameTester.isFullTime());
        System.out.println("Salary: $" + gameTester.determineSalary());

        scanner.close();
    }
}
