/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab15Interface.model;

import ec.espe.edu.lab15Interface.Interface.Animal;

/**
 *
 * @author Luis Loachamin
 */
public class Lab15Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal;
        animal = new Mammal();
        animal.assignmentHabita();
        animal.feed();
        animal = new Reptil();
        animal.assignmentHabita();
        animal.feed();

        
            
        
        
    }
    
}
