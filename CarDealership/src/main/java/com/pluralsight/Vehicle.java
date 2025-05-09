package com.pluralsight;

import java.time.format.DateTimeFormatter;

public class Vehicle {
    private String vin;
    private String year;
    private String make;
    private String model;
    private String color;
    private int odometer;
    private double price;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(String vin, String year, String make, String model, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    public String display() {
        StringBuilder builder = new StringBuilder();
        builder.append(vin).append("\n").append(year).append("\n").append(make).append(model)
                .append("\n").append(color).append("\n").append(odometer).append("\n").append(price)
                .append("__________________________________________________________________________");
        return builder.toString();

    }
}
