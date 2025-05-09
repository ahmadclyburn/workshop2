package com.pluralsight;
import java.util.List;
import java.util.Scanner;

public class Switch {
    public static Scanner input = new Scanner(System.in);
    public static void mainMenu() {
        boolean running = true;

        while (running) {
            Menu.showMainMenu();
            int selectedReportsOptions = input.nextInt();

            switch (selectedReportsOptions) {
                case 1:
                    ();
                    break;
                case 2:
                    Dealership.<Vehicle> getAllVehicle();
                    break;
                case 3:
                    ();
                    break;
                case 4:
                    ();
                    break;
                case 5:
                    ();
                    break;
                case 0:
                    ();
                    running =false;
                    break;

                default:
                    System.out.println("****invalid option****");
            }
        }
    }
    public static void filterMenu() {
        boolean running = true;

        while (running) {
            Menu.showMainMenu();
            int selectedReportsOptions = input.nextInt();

            switch (selectedReportsOptions) {
                case 1:
                    Filter.searchForVin();
                    break;
                case 2:
                    Filter.searchForYear();
                    break;
                case 3:
                    Filter.searchForMake();
                    break;
                case 4:
                    Filter.searchForModel();
                    break;
                case 5:
                    Filter.searchForColor();
                    break;
                case 6:
                    Filter.searchForOdometer();
                    break;
                case 7:
                    Filter.searchForPrice();
                    break;
                case 8:
                    running =false;
                    break;

                default:
                    System.out.println("****invalid option****");
            }
        }
    }


}
