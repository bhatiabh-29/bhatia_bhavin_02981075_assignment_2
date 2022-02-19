/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.carsearchapp.model;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bhavinbhatia
 */

public class Car {
    
    private String type;
    private int noOfAvailableCars;
    private String manufacturer;
    private int makeYear;
    private int noOfSeats;
    private int serialNum;
    private String modelNo;
    private String city;
    private Date carMaintainanceDate;
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
        Date carMaintainanceDate, boolean isAvailable){
        
        
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

    public Date getCarMaintainanceDate() {
        return carMaintainanceDate;
    }

    public void setCarMaintainanceDate(Date carMaintainanceDate) {
        this.carMaintainanceDate = carMaintainanceDate;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }
    
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
    public static  boolean validateNotNull( String type, 
            String manufacturer, 
            String makeYear, 
            String noOfSeats,
            String serialNum, 
            String modelNo,
            String city) {
    
          if (type == null || type.isEmpty() ||
                manufacturer == null || manufacturer.isEmpty() ||
                     makeYear == null || makeYear.isEmpty() ||
                        noOfSeats == null || noOfSeats.isEmpty() ||
                            serialNum == null || serialNum.isEmpty() ||
                                modelNo == null || modelNo.isEmpty() ||
                                    city == null || city.isEmpty()){
            
            return false;
        }
        return true;
    }
    
}








