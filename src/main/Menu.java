package main;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display options
            System.out.println("1. Add Plane");
            System.out.println("2. Delete Plane");
            System.out.println("3. List All Planes");
            System.out.println("4. Total Capacity");
            System.out.println("5. Sort by Flight Range");
            System.out.println("6. Search by Fuel Consumption");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Execute selected command based on choice
            switch (choice) {
                case 1:
                    // Execute AddPlaneCommand
                    break;
                case 2:
                    // Execute DeletePlaneCommand
                    break;
                case 3:
                    // Execute ListPlanesCommand
                    break;
                case 4:
                    // Execute TotalCapacityCommand
                    break;
                case 5:
                    // Execute SortByFlightRangeCommand
                    break;
                case 6:
                    // Execute SearchByFuelConsumptionCommand
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 7);
    }
}
