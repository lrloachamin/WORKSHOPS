/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab10.Inheritance.model;
import java.util.Scanner;

/**
 *
 * @author Luis Loachamin
 */
public class Mammal extends Animal{
    private int numberOfNipple;
    private  int size;
    private int TimeOfGestation;
    private final boolean lactationTime;
    private int decicion;

    
     public int computeTimeOfGestation(int size){
        int timeOfGestation=0;
        timeOfGestation=(int) (size*4/0.20);
        return timeOfGestation;
    }
public boolean lactationTime(int temp){
        
        boolean lactation=false;
        if(temp == 1){
            lactation = true; 
            return lactation;
        }else{
            lactation = false;
            return lactation;
        }
        
    }

    public Mammal(int id, int arrivalYear, String scientificName,int numberOfNipple,int size,int decicion) {
        super(id, arrivalYear, scientificName);
        this.TimeOfGestation=computeTimeOfGestation(size);
        this.lactationTime=lactationTime(decicion);
    }

    public int getTimeOfGestation() {
        return TimeOfGestation;
    }

    public void setTimeOfGestation(int TimeOfGestation) {
        this.TimeOfGestation = TimeOfGestation;
    }

    public int getNumberOfNipple() {
        return numberOfNipple;
    }

    public void setNumberOfNipple(int numberOfNipple) {
        this.numberOfNipple = numberOfNipple;
    }

    public boolean getLactationTime() {
        return lactationTime;
    }

    
    
   

    
}
