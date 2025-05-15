package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CarSearch {
//    public static Scanner input = new Scanner(System.in);
//    public static void searchForCar() {
//        System.out.println(" ");
//        System.out.println("enter vin. if you dont have a vin press x.");
//        String carUserWants = input.nextLine().trim().toLowerCase();
//
//        try {
//            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
//            bufreader.readLine();
//            String line;
//            boolean found = false;
//
//            while ((line = bufreader.readLine()) != null) {
//                String[] parts = line.split("\\|");
//
//                if (parts.length >=7) {
//                    String vin = parts[0].toLowerCase();
//
//                    if (vin.equals(carUserWants)) {
//                        found = true;
//                        System.out.printf("\nYour car info\n--------------\nvin: %s | year: %s | make: %s | model: %s | color: %s|odometer: %s| price %s",
//                                parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
//                    }
//                }
//            }
//            if (!found) {
//                System.out.println("No matching car found.");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
//}
