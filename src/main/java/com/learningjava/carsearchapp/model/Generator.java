
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Generator to edit this template
 */
package com.learningjava.carsearchapp.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bhavinbhatia
 */
public class Generator {
  
    
    static final String[] MANUFACTURES = {"Toyota", "Hyundai", 
                            "Ford", "Tesla", "BMW", "Mazda", "Audi"};
    static final String[] CITIES = {"Boston", "Cambridge", "New York", "San francisco", "Texas", "California", "Seattle"};
    static final String[] MODELS = {"X", "Y", "Z", "Green"};
    static final int[] NUM_OF_SEATS = {4, 6, 8};
    static final String[] TYPES = {"TypeA", "TypeB", "TypeC"};
    static final int MAKE_YEAR_START = 2010;
    static final int MAKE_YEAR_END = 2022;


    
    public ArrayList<Car> generateCars(int number) {
        ArrayList<Car> cars = new ArrayList<Car>();
        for(int i = 0; i < number; i++) {
            Car car = generateCar();
            cars.add(car);
        }
        
     return cars;
        
     
    }
    
    public Car generateCar() {
        Random random = new Random();
        String manufacturer = MANUFACTURES[random.nextInt(0, 
                                MANUFACTURES.length)];
        String city = CITIES[random.nextInt(0, CITIES.length)];
        String model = MODELS[random.nextInt(0, MODELS.length)];
        int numSeats = NUM_OF_SEATS[random.nextInt(0, 
                NUM_OF_SEATS.length)];
        int makeYear = random.nextInt(MAKE_YEAR_START, MAKE_YEAR_END);
        String type = TYPES[random.nextInt(0, TYPES.length)];
        int serialNumber = random.nextInt(1111, 9999);
        Car car = new Car(
                type,manufacturer, makeYear, numSeats, serialNumber,
                model, city,
                1231, random.nextBoolean()
        );
        return car;
    }
}
