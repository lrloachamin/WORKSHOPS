/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab13.ClassAbstract.model;

/**
 *
 * @author Luis Loachamin
 */
public class Lab13ClassAbstrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal;
        animal = new Mammal();
        animal.giveBirth();
        System.out.println("Animal is a type of -->"+animal.getClass().toString());//qualifile name :
    }
    
}
