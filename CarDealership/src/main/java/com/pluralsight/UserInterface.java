package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static Scanner input = new Scanner(System.in);
    private Dealership dealership;
    public void initialize(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.readInventoryFromFile();
    }
    public void displayAllVehicle(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public static void showMainMenu() {
        System.out.println(" ");
        System.out.println("-------------Main Menu------------");
        System.out.println("------1: Search for specific car-----\n");
        System.out.println("-------view full list of cars-----\n");
        System.out.println("-----------view filters-----------\n");
        System.out.println("====X- Exit===");
    }

    public static void showFiltersMenu() {
        System.out.println(" ");
        System.out.println("select a metric to filter by");
        System.out.println("_______________");
        System.out.println("year\n");
        System.out.println("make\n model\n");
        System.out.println("color\n");
        System.out.println("odometer\n");
        System.out.println("price\n");
        System.out.println("back");
    }

    public static void showInventoryManagementMenu() {
        System.out.println(" ");
        System.out.println("sell a vehicle");
        System.out.println("buy a vehicle");
    }


    public void displayMainMenu() {
        initialize();
        boolean running = true;

        while (running) {
            showMainMenu();
            int selectedMenuOptions = input.nextInt();

            switch (selectedMenuOptions) {
                case 1:
//                    CarSearch.searchForCar();
                    break;
                case 2:
                    displayAllVehicle(dealership.getAllVehicles());
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

