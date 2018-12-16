/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab10.Inheritance.model;

/**
 *
 * @author Asus
 */
public class Animal {
     protected int id;
     protected int arrivalYear;
     protected String scientificName;
     protected int yearOfSTate;

    public int getYearOfSTate() {
        return yearOfSTate;
    }

    public void setYearOfSTate(int yearOfSTate) {
        this.yearOfSTate = yearOfSTate;
    }
  
      public int computeYearsOfState(int arrivalYear){
        int yearsOfState;
        yearsOfState = 2018 - arrivalYear;
        return yearsOfState;
    }

    public Animal(int id, int arrivalYear, String scientificName) {
        this.id = id;
        this.arrivalYear = arrivalYear;
        this.scientificName = scientificName;
        this.yearOfSTate=computeYearsOfState(arrivalYear);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArrivalYear() {
        return arrivalYear;
    }

    public void setArrivalYear(int arrivalYear) {
        this.arrivalYear = arrivalYear;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }
     
     
      
}
