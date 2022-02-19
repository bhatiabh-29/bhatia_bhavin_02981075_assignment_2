/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.carsearchapp;

/**
 *
 * @author bhavinbhatia
 */
public class Utility {
     public static boolean isNum(String input){
        try {
            Integer.parseInt(input);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    
}
