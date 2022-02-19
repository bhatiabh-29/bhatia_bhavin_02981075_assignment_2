/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


Find the first available passenger car.
How many cars are currently available.
List all cars that are made by Toyota, GM, etc.
List all cars that were manufactured in a given year, ‘x’.
List all cars with a minimum of x seats but no more than y seats.
Find a car with the given serial number. List the attributes of the found car.
List all cars given the model number.
List all the car manufacturers used by (this) Uber.
When was the last time the fleet catalog was updated
List all cars that are available in a given city.
List all cars that have expired maintenance certificates.

 */





package com.learningjava.carsearchapp.model;

import com.learningjava.carsearchapp.model.Car;
import com.sun.jdi.ThreadGroupReference;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bhavinbhatia
 */
public class VehicleFleet {

    //initialized a new array list
    ArrayList<Car> fleetOfCars;
    
    public VehicleFleet (){
        this.fleetOfCars = new ArrayList<Car>();
    }

    public ArrayList<Car> getFleetOfCars() {
        return fleetOfCars;
    }

    public void setFleetOfCars(ArrayList<Car> fleetOfCars) {
        this.fleetOfCars = fleetOfCars;
    }
    
    public Car addNewCar(Car newCar){
        fleetOfCars.add(newCar);
        return newCar;
    }
    
    public void deleteCar(Car car){
        fleetOfCars.remove(car);
    }
    
    
    public ArrayList<Car> getCarsByType(String typeOfCar){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getCarsByType(cars, typeOfCar);
    }
    
    
    public static ArrayList<Car> getCarsByType(ArrayList<Car> cars, String typeOfCar){
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getType().equals(typeOfCar)){
                filteredCars.add(cars.get(i));
            }
        }
        return filteredCars;
    }
   
    
    public ArrayList<Car> getCarsByManufacturer (String manufacturer){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getCarsByManufacturer(cars, manufacturer);
    }
    
    public static ArrayList<Car> getCarsByManufacturer(ArrayList<Car> cars, String manufacturer){
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getManufacturer().equals(manufacturer)){
                filteredCars.add(cars.get(i));
            }
        }
        return filteredCars;
    }
    
    
    
   public ArrayList<Car> getCarsByMakeYear(int makeYear){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getCarsByMakeYear(cars, makeYear);
    }
   
    public static ArrayList<Car> getCarsByMakeYear (ArrayList<Car> cars,int makeYear){
    ArrayList<Car> filteredCars = new ArrayList<>();
    for(int i = 0; i < cars.size(); i++){
        if(cars.get(i).getMakeYear() == makeYear){
            filteredCars.add(cars.get(i));
        }
    }
    return filteredCars;
}
    
    
    public ArrayList<Car> getCarsByNumOfSeats(int noOfSeats){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getCarsByNumOfSeats(cars, noOfSeats);
    }
   
    public static ArrayList<Car> getCarsByNumOfSeats (ArrayList<Car> cars,int noOfSeats){
    ArrayList<Car> filteredCars = new ArrayList<>();
    for(int i = 0; i < cars.size(); i++){
        if(cars.get(i).getNoOfSeats() == noOfSeats){
            filteredCars.add(cars.get(i));
        }
    }
    return filteredCars;
}
   
    public ArrayList<Car> getCarBySerialNum(int carSerialNum){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getCarBySerialNum(cars, carSerialNum);
    }
   
    public static ArrayList<Car> getCarBySerialNum (ArrayList<Car> cars,int carSerialNum){
    ArrayList<Car> filteredCars = new ArrayList<>();
    for(int i = 0; i < cars.size(); i++){
        if(cars.get(i).getSerialNum()== carSerialNum){
            filteredCars.add(cars.get(i));
        }
    }
    return filteredCars;
}
    
    public ArrayList<Car> getCarsByModelNum (String modelNum){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getCarsByModelNum(cars, modelNum);
    }
    
    public static ArrayList<Car> getCarsByModelNum(ArrayList<Car> cars, String modelNum){
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getModelNo().equals(modelNum)){
                filteredCars.add(cars.get(i));
            }
        }
        return filteredCars;
    }
    
    
    
    public ArrayList<Car> getCarsByCity (String city){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getCarsByCity(cars, city);
    }
    
    public static ArrayList<Car> getCarsByCity(ArrayList<Car> cars, String city){
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getCity().equals(city)){
            filteredCars.add(cars.get(i));
            }
        }
        return filteredCars;
    }
 
    
    public ArrayList<Car> getAvailableCars (Boolean isavailable){
        ArrayList<Car> cars = getFleetOfCars();
        return VehicleFleet.getAvailableCars(cars, isavailable);
    }
    
    public static ArrayList<Car> getAvailableCars(ArrayList<Car> cars, Boolean isavailable){
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).isAvailable){
                filteredCars.add(cars.get(i));
            }
        }
        return filteredCars;
    }
    
//    getCarsByExpiredMaintenance
            
    public static ArrayList<Car> getCarsByExpiredMaintenance(ArrayList<Car> cars) {
        
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++){
            Car car = cars.get(i);
           Date expiryDate =  car.getCarMaintainanceDate();
           if (expiryDate == null) {
               continue;
           }
           Date todaysDate = new Date();
           if (todaysDate.compareTo(expiryDate) > 0) {
               filteredCars.add(car);
           }
            
        }
        return filteredCars;
    }
}
