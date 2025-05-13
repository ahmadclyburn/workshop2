package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class DealershipFileManager {
    public static ArrayList<Vehicle> readInventoryFromFile(){
       ArrayList<Vehicle> inventory = new ArrayList<>();
        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            bufreader.readLine();
            String line;

            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                String vin = tokens[0];
                String year = tokens[1];
                String make = tokens[2];
                String model = tokens[3];
                String color = tokens[4];
                int odometer = parseInt(tokens[5]);
                double price = parseDouble(tokens[6]);
                Vehicle carInventory = new Vehicle(vin, year, make,model, color,odometer,price);
                inventory.add(carInventory);
                }
            bufreader.close();
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inventory;
    }
}
