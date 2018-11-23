/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.educ.lab16Exeption.operation;

import ec.espe.edu.ec.Lab16Exception.model.Animal;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args){
       
        Operation operation;
        operation = new Operation();
        float resut1= operation.divide(3,5);
        System.out.println("the quationt is "+resut1);
        float result2=operation.divide(386,897);
        System.out.println("the quationt is "+result2);
        float result = operation.divide(8,0);
        System.out.println("the quationt is "+result);
        System.out.println("the resp is "+operation.add(1.2f,2.9f));
        
     Animal animal = null;
     animal = null;
     //animal = new Animal();
     
    try{
        System.out.println("the firts line run");
        System.out.println("eyes "+animal.eyes);
        System.out.println("The program is a style running");
     
    }catch(Exception ex){
        System.out.println("An error ocurred"+ex);
        System.out.println("the exception "+ex.getMessage());
        if (ex.toString().compareToIgnoreCase("java.lang.NullPointerException")==0){
            System.out.println("No hay animales");
            
        }
        
    }
    }
    
    
}
