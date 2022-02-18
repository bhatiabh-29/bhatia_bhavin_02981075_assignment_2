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
    
    public Car addNewCar(){
        Car newCar = new Car();
        fleetOfCars.add(newCar);
        return newCar;
    }
    
    public void deleteCar(Car car){
        fleetOfCars.remove(car);
    }
    
    
    /* 1. Find the first available passenger car.
    This function checks the list of cars and returns cars of particular type
    
    Eg: getCarsByType("Sedan")
    returns: Arraylist of cars of type sedan*/
    
    public ArrayList<Car> getCarsByType(String typeOfCar){
        ArrayList<Car> cars = new ArrayList<Car>();
        for (int i = 0; i < cars.size(); i++){
            if ( cars.get(i).equals(typeOfCar)){
                cars.add(cars.get(i));
            }
        }
        return cars;
    }
    
    /* 2. How many cars are currently available.
   
    Returns the number of available cars.
    Ex: getNumOfAvailableCars()
    Retruns : Count of available cars.
    */
    
    public int getNumOfAvailableCars() {
        int count = 0;
        for(Car car : fleetOfCars) {
            if (car.isAvailable()) {
                count += 1;
            }
        }
         return count;
    }
    
    
    
    /* 3. List all cars that are made by Toyota, GM, etc.
    
    Given the manufacturer returns the cars by the manufacturer
    
    Ex: getCarsByManufacturer ("Toyota")
    Returns: ArrayList of fleetOfCars made by Tyota
    */
    public ArrayList<Car> getCarsByManufacturer (String manufacturer){
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i ++ ){
            if (cars.get(i).getManufacturer().equals(manufacturer)){
                cars.add(cars.get(i));
            }
        }
        return cars;
    }
        
    
    
    /* 4.List all cars that were manufactured in a given year, ‘x’.
    
    Ex: getCarsByMakeYear(2022)
    Returns: ArrayList of fleetOfCars made in the year 2022*/
    
   
    public ArrayList<Car> getCarsByMakeYear (int makeYear){
    ArrayList<Car> cars = new ArrayList<>();
    for(int i = 0; i < cars.size(); i++){
        if(cars.get(i).getMakeYear() == makeYear){
            cars.add(cars.get(i));
        }
    }
    return cars;
}
    
    /* 5.List all cars with a minimum of minNum seats but no more than maxNum seats.
    
    Given minNum, maxNum this function returns the list of cars whose seat number
    is between minNum and maxNum
    
    Ex: getCarsByNumOfSeats(3,5)
    Returns: ArrayList of fleetOfCars which has min 3 seats and max 5 seats

    */
    
    public ArrayList<Car> getCarsByNumOfSeats(int minNum  , int maxNum){
    ArrayList<Car> cars = new ArrayList();
    for(int i = 0; i < cars.size(); i++){
        if(cars.get(i).getNoOfSeats() <= maxNum &&
        cars.get(i).getNoOfSeats() >= minNum){
            cars.add(cars.get(i));
        }
    }
      return cars;

}
   
    
    /* 6. Find a car with the given serial number. 
 
    
    Ex: getCarsBySerialNum(123)
    Returns: car with serial number 123
    */
    public Car getCarBySerialNum(int carSerialNum){
       for (Car car: fleetOfCars){
           if(car.getSerialNum() == carSerialNum){
               return car;
           }
       }
       return null;
    }
    
    
    /* 7. List all cars given the model number.

    
    Ex: getCarsByModelNum("Model-X")
    Returns: cars with model number Model-X
    */
    public ArrayList<Car> getCarsByModelNum(String modelNum){
    ArrayList<Car> cars = new ArrayList<>();
    for (int i =0; i < cars.size(); i++){
        if (cars.get(i).getModelNo().equals(modelNum)){
            cars.add(cars.get(i));
        }
            
        }
    return cars;
    }
    
    
    /* 8. List all the car manufacturers used by (this) Uber*/
    
    /* 9. When was the last time the fleet catalog was updated*/
    
    
    /* 10. Given the city , this fgunction returns all the cars in the
    city
    
    Ex: getCarsByCity("boston")
    Returns: cars within the city boston*/
    
    
    public  ArrayList<Car> getCarsByCity (String city){
      ArrayList<Car> cars = new ArrayList<>();
      for (int i = 0; i < cars.size(); i++){
        if (cars.get(i).getCity().equals(city)){
            cars.add(cars.get(i));
        }
        
    }
      return cars;
}
    
    /* 11. List all cars that have expired maintenance certificates.
    This function checks the cars with expired maintaiance certificate and returns
    the list of cars who are obsolute*/
    
//public  ArrayList<Car> getCarsByMaintainanceDate(int date){
//      ArrayList<Car> cars = new ArrayList<>();
//      for (int i = 0; i < cars.size(); i++){
//        if (cars.get(i).getCity() == (date)){
//            cars.add(cars.get(i));
//        }
//        
//    }
//      return cars;
//}
    
    
    
    
    /*
    Return all the cars that are available
    
    Example: getAvailableCars()
    Returns : List of available cars
    
    */
    
    public ArrayList<Car> getAvailableCars() {
        
        return null;
        
    }
    
    /*
    Return all the cars that are available in the city
    
    Example: getAvailableCars("NY")
    Returns : List of available cars in newyork 
    
    */
    public ArrayList<Car> getAvailableCars(String cityName) {
        
        return null;
        
    }
    
    
}

/*
Find the first available passenger car.
How many cars are currently available.
- getAvailableCars


List all cars that are made by Toyota, GM, etc.
getCarsByManufactorer


List all cars that were manufactured in a given year, ‘x’.
getCarsByMakeYear


List all cars with a minimum of x seats but no more than y seats.
getCarsByNumOfSeats(int minNum  , int maxNum


Find a car with the given serial number. List the attributes of the found car.
getCarBySerialNum



List all cars given the model number.
getCarsByModelNum


When was the last time the fleet catalog was updated
????



List all cars that are available in a given city.
getAvailableCars(cityName)


List all cars that have expired maintenance certificates.
getExpiredCertificateCars

Car field -. Date mantainanceExpiryDate


manu

List all the car manufacturers used by (this) Uber.

*/