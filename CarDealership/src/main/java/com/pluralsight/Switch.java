package com.pluralsight;
import java.util.List;
import java.util.Scanner;

public class Switch {
    public static Scanner input = new Scanner(System.in);

    public static void mainMenu() {
        boolean running = true;

        while (running) {
            Menu.showMainMenu();
            int selectedMenuOptions = input.nextInt();

            Dealership dealership = new Dealership("louis' dealership", "123 main street", "9808988898");
            switch (selectedMenuOptions) {
                case 1:
                    CarSearch.searchForCar();
                    break;
                case 2:
                    List<Vehicle> vehicles = DealershipFileManager.readInventoryFromFile();
                    if (vehicles.isEmpty()) {
                        System.out.println("no cars found");
                    } else {
                        System.out.println("All vehicls:");
                        vehicles.forEach(System.out::println);
                    }
                    break;
                case 3:
                    filterMenu();
                    break;
                case 4:
                    buyOrSellMenu();
                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("****invalid option****");
            }
        }
    }

    public static void filterMenu() {
        boolean running = true;

        while (running) {
            Menu.showFiltersMenu();
            int selectedFilterOptions = input.nextInt();

            switch (selectedFilterOptions) {
                case 1:
                    Filter.searchForYear();
                    break;
                case 2:
                    Filter.searchForMake();
                    break;
                case 3:
                    Filter.searchForModel();
                    break;
                case 4:
                    Filter.searchForColor();
                    break;
                case 5:
                    Filter.searchForOdometer();
                    break;
                case 6:
                    Filter.searchForPrice();
                    break;
                case 7:
                    running = false;
                    break;

                default:
                    System.out.println("****invalid option****");
            }
        }
    }

    public static void buyOrSellMenu() {
        boolean running = true;

        while (running) {
            Menu.showFiltersMenu();
            int selectedFilterOptions = input.nextInt();

            switch (selectedFilterOptions) {
                case 1:
                    InverntoryManagement.sellVehicle();
                    break;
                case 2:
                    InverntoryManagement.buyVehicle();
                    break;
                case 3:
                    running = false;
                    break;
            }
        }

    }
}
