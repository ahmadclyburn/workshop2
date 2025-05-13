package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Filter {
    public static Scanner input = new Scanner(System.in);

    public static void searchForYear() {
        System.out.println(" ");
        System.out.println("enter the year of car your looking for");
        String yearUserWants = input.nextLine().trim();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String year = tokens[1].toLowerCase();

                    if (year.contains(yearUserWants)) {
                        System.out.printf("\nall cars from that year :\n--------------\nyear: %s | vin: %s " +
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
        System.out.println("enter the car make your looking for");
        String makeUserWants= input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String make = tokens[1].toLowerCase();

                    if (make.contains(makeUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\nmake: %s | vin: %s " +
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
        System.out.println("enter the car model your looking for");
        String modelUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String model = tokens[1].toLowerCase();

                    if (model.contains(modelUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\nmodel: %s | vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[3].toUpperCase(), tokens[0], tokens[1], tokens[2], tokens[4], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchForColor() {
        System.out.println(" ");
        System.out.println("enter the color of car your looking for");
        String colorUserWants = input.nextLine().trim().toLowerCase();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    String color = tokens[1].toLowerCase();

                    if (color.contains(colorUserWants)) {
                        System.out.printf("\nall makes your looking for:\n--------------\ncolor: %s | vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[4].toUpperCase(), tokens[0], tokens[1], tokens[2], tokens[3], tokens[5], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void searchForOdometer() {
        System.out.println(" ");
        System.out.println("enter the min odometer reading your looking for");
        int maxOdometerReadingUserWants = input.nextInt();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    int odometerReading = parseInt(tokens[5]);

                    if (odometerReading <= maxOdometerReadingUserWants) {
                        System.out.printf("\nall makes your looking for:\n--------------\nodometer: %s | vin: %s " +
                                        " |make: %s | model: %s|color: %s|odometer reading: %s| price: %s",
                                tokens[5].toUpperCase(), tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[6]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void searchForPrice() {
        System.out.println(" ");
        System.out.println("enter the max price your looking for");
        double priceUserWants = input.nextFloat();


        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length >= 7) {
                    double price = parseDouble(tokens[6]);

                    if (price <= priceUserWants) {
                        System.out.printf("\nall makes your looking for:\n--------------\nprice: %s | vin: %s " +
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

