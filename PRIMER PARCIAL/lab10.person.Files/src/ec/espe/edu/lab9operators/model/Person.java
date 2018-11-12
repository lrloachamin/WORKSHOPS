/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab9operators.model;
/**
 *
 * @author Luis Loachamin
 */
public class Person {
    
    private int day;
    private int month;
    private int year;
    private String name;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int day, int month, int year, String name) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
    }

   
   
    
    
}
