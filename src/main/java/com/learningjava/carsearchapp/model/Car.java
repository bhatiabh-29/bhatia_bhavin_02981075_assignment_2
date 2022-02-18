/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.carsearchapp.model;

/**
 *
 * @author bhavinbhatia
 */
//
//car class 
//attributes car isavailabe 
// car manufacturer 
//year maf 
//
//no of seats 
//serial num
//model num
//city 
//maintainance exp date 
//getters setters 
//helper function 
//
//class city fleet 
//listofcars 
//last updated date for fleet 
//
//helper function  manufactureer,  seat, getcar serial number, getcar modelnumber, getcars cityname,
//getexpiremaintaiance



//Attributes of the car class 
//typeOfCar;
//noOfAvailableCars;
//manufacturer;
//makeYear;
//noOfSeats;
//carSerialNum;
//carModel;
//city;
//carMaintainanceDate;
//boolean isAvailable;



public class Car {
    
    private String type;
    private int noOfAvailableCars;
    private String manufacturer;
    private int makeYear;
    private int noOfSeats;
    private int serialNum;
    private String modelNo;
    private String city;
    private int carMaintainanceDate;
    boolean isAvailable;
    
    /*
    types = [ "sedan", "suv", "muv"]
    makeYear = []
    
    
    for 
    */
    
    
    //Created a constructer so that everytime a object of car is created, all t
    //hese values have to be passed.
    
    public Car(String type, String manufacturer, 
    int makeYear, int noOfSeats, int serialNum, String modelNo, String city, 
        int carMaintainanceDate, boolean isAvailable){
        
        
        this.type = type;
        this.manufacturer = manufacturer;
        this.makeYear = makeYear;
        this.noOfSeats = noOfSeats;
        this.serialNum = serialNum;
        this.modelNo= modelNo;
        this.city = city;
        this.carMaintainanceDate = carMaintainanceDate;
        this.isAvailable = isAvailable;
       
        
        

       }
    //default constructor
    public Car() {
        
    }
    
    //getters and setters of the car class
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public int getNoOfAvailableCars() {
//        return noOfAvailableCars;
//    }
//
//    public void setNoOfAvailableCars(int noOfAvailableCars) {
//        this.noOfAvailableCars = noOfAvailableCars;
//    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int carSerialNum) {
        this.serialNum = carSerialNum;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String carModel) {
        this.modelNo = carModel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCarMaintainanceDate() {
        return carMaintainanceDate;
    }

    public void setCarMaintainanceDate(int carMaintainanceDate) {
        this.carMaintainanceDate = carMaintainanceDate;
    }

    boolean isAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}








