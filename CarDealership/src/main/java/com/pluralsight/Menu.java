package com.pluralsight;

public class Menu {
    public static void showMainMenu() {
        System.out.println(" ");
        System.out.println("Welcome to Loise Pastels Dealership");
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
        System.out.println("vin\n");
        System.out.println("year\n");
        System.out.println("make / model\n");
        System.out.println("color");
        System.out.println("odometer");
        System.out.println("price");
        System.out.println("back");
    }



}
