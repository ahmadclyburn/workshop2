package com.pluralsight;

public class Vehicle {
    private String vin;
    private int year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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

    public Vehicle(String vin, int year, String make, String model, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(vin).append("|").append(year).append("|").append(make).append("|").append(model)
                .append("|").append(color).append("|").append(odometer).append("|").append(price)
                .append("\n");
        return builder.toString();

    }
}
