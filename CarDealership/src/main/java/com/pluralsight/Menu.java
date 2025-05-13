package com.pluralsight;

public class Menu {
    public static void showMainMenu() {
        System.out.println(" ");
        System.out.println("Welcome to Louise Pastels Dealership");
        System.out.println("-------------Main Menu------------");
        System.out.println("------Search for specific car-----\n");
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
    public static void showInventoryManagementMenu(){
        System.out.println(" ");
        System.out.println("sell a vehicle");
        System.out.println("buy a vehicle");
    }



}
