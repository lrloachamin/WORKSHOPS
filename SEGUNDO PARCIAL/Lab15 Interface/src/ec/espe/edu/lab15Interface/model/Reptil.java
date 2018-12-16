/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab15Interface.model;

import ec.espe.edu.lab15Interface.Interface.Animal;

/**
 *
 * @author Asus
 */
public class Reptil implements Animal {

    @Override
    public void feed() {
        System.out.println("el reptil come hierba ");
        
    }

    @Override
    public void assignmentHabita() {
        System.out.println("el Reptil vive en el rio  ");
        
    }
    
    
}
