package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
private String name;
private String address;
private String phone;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    ArrayList inventory = new  ArrayList<Vehicle>();
    public List<Vehicle> getVehicleByPrice(double min, double max){
        return new ArrayList<>();
    }
    public List <Vehicle> getVehicleByMake(String make ,String model){
        return new ArrayList<>();
    }
    public List <Vehicle> getVehicleByYear(String min,String max){
        return new ArrayList<>();
    }
    public List <Vehicle> getVehicleByColor(String color){
        return  new ArrayList<>();
    }
    public List <Vehicle>getVehicleByMileage(int min,int max){
        return new ArrayList<>();
    }
    public List <Vehicle>getVehicleByType(String vehicleType){
    return new ArrayList<>();
    }
    public List <Vehicle>getAllVehicle(){
        return inventory;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }
}
