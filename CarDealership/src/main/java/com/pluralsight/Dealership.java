package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private List<Vehicle> inventory;
    private String name;
    private String address;

    public List<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
//    ArrayList inventory = new  ArrayList<Vehicle>();
    public List<Vehicle> getVehicleByPrice(double min, double max){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v: inventory){
            if (v.getPrice()>= min && v.getPrice()<=max){
                result.add(v);
            }
        }
        return result;
    }
    public List <Vehicle> getVehicleByMake(String make ,String model){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v: inventory){
            if (v.getMake().equalsIgnoreCase(make)){
                result.add(v);
            }
        }
        return result;
    }
    public List <Vehicle> getVehicleByYear(int min,int max){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v: inventory){
             if (v.getYear()>= min && v.getYear()<=max){
                    result.add(v);
             }
        }
        return result;
    }
    public List <Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v: inventory){
            if (v.getColor().equalsIgnoreCase(color)){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> getVehicleByMileage(int min,int max){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v: inventory){
            if (v.getOdometer()>= min && v.getOdometer()<=max){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
    return new ArrayList<>();
    }
    public List<Vehicle> getAllVehicles(){
        return inventory;
    }
    public void addVehicle(Vehicle v){
        inventory.add(v);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }
}
