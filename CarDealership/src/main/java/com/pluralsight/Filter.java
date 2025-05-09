package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Filter {
    public static Scanner input = new Scanner(System.in);

    public static void searchForVin() {
        System.out.println(" ");
        System.out.println("enter the vin your looking for");
        input.nextLine();
        String vinUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String vin = tokens[0].toLowerCase();

                    if (vin.contains(vinUserWants)) {
                        System.out.printf("\nyour vin and other car information:\n--------------\n \\033[3m\"vin: %s\\033[3m\" | year: %s " +
                                        "| make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchForYear() {
        System.out.println(" ");
        System.out.println("enter the vin your looking for");
        input.nextLine();
        String yearUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String year = tokens[1].toLowerCase();

                    if (year.contains(yearUserWants)) {
                        System.out.printf("\nall cars from that year :\n--------------\n\\033[3m\"year: %s\\033[3m\" | vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[1], tokens[0], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchForMake() {
        System.out.println(" ");
        System.out.println("enter the vin your looking for");
        input.nextLine();
        String makeUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String make = tokens[1].toLowerCase();

                    if (make.contains(makeUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\n\\033[3m\"make: %s \\033[3m\"| vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[2].toUpperCase(), tokens[0], tokens[1], tokens[3], tokens[4], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchForModel() {
        System.out.println(" ");
        System.out.println("enter the vin your looking for");
        input.nextLine();
        String makeUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String make = tokens[1].toLowerCase();

                    if (make.contains(makeUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\n\\033[3m\"make: %s \\033[3m\"| vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[2].toUpperCase(), tokens[0], tokens[1], tokens[3], tokens[4], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchForColor() {
        System.out.println(" ");
        System.out.println("enter the vin your looking for");
        input.nextLine();
        String makeUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String make = tokens[1].toLowerCase();

                    if (make.contains(makeUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\n\\033[3m\"make: %s \\033[3m\"| vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[2].toUpperCase(), tokens[0], tokens[1], tokens[3], tokens[4], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void searchForOdometer() {
        System.out.println(" ");
        System.out.println("enter the vin your looking for");
        input.nextLine();
        String makeUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String make = tokens[1].toLowerCase();

                    if (make.contains(makeUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\n\\033[3m\"make: %s \\033[3m\"| vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[2].toUpperCase(), tokens[0], tokens[1], tokens[3], tokens[4], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void searchForPrice() {
        System.out.println(" ");
        System.out.println("enter the vin your looking for");
        input.nextLine();
        String priceUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String price = tokens[1].toLowerCase();

                    if (price.contains(priceUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\n\\033[3m\"price: %s \\033[3m\"| vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[6].toUpperCase(), tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}

