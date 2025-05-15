package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class DealershipFileManager {
    public Dealership readInventoryFromFile() {
        Dealership dealership = new Dealership("louis' dealership", "123 main street", "9808988898");

        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("src/main/resources/vehicle_inventory.csv"));
            String headerLine = bufreader.readLine();
            String[] header = headerLine.split("\\|");
            dealership = new Dealership(header[0], header[1], header[2]);
            String line;


            while ((line = bufreader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                Vehicle v = new Vehicle(
                        (tokens[0]),
                        parseInt(tokens[1]),
                        tokens[2],
                        tokens[3],
                        tokens[4],
                        parseInt(tokens[5]),
                        parseDouble(tokens[6]));
                dealership.addVehicle(v);
            }
            bufreader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/vehicle_inventory.csv"))) {
            writer.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            writer.newLine();

            for (Vehicle v : dealership.getAllVehicles()) {
                writer.write(v.getVin() + "|" + v.getYear() + "|" + v.getMake() + "|" + v.getModel() + "|" + v.getColor() + "|" + v.getOdometer() + "|" + v.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

