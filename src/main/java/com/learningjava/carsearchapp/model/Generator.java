
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Generator to edit this template
 */
package com.learningjava.carsearchapp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

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
    
    public static Date between(Date startInclusive, Date endExclusive) {
        
            // Taken from : https://www.baeldung.com/java-random-dates
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
          .current()
          .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
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
        
        long today = new Date().getTime();
        long aDay = TimeUnit.DAYS.toMillis(1);
        Date startDate = new Date(today - aDay * 365 * 2);
        Date endDate = new Date(today + aDay * 365 * 2);
        Date randomDate = Generator.between(startDate, 
               endDate);
        Car car = new Car(
                type,manufacturer, makeYear, numSeats, serialNumber,
                model, city,
                randomDate, random.nextBoolean()
        );
        return car;
    }
}
