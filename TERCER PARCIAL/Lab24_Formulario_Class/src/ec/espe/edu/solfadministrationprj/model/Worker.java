/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.solfadministrationprj.model;

/**
 *
 * @author Luis Loachamin
 */
public class Worker {
    String lastName;
    float salary;
    int time;
    float totalSalary;

   

    public Worker(String lastName, float salary, int time,float totalSalary) {
        this.lastName = lastName;
        this.salary = salary;
        this.time = time;
        this.totalSalary=totalSalary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
     public float getTotalSalry() {
        return totalSalary;
    }

    public void setTotalSalry(float totalSalry) {
        this.totalSalary = totalSalry;
    }
    
    
    
}
