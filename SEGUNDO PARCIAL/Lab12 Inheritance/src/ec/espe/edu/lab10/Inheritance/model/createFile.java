/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab10.Inheritance.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class createFile{


public void writer(String name,int id,int arrivalYear,int numberOfNipple,int size,int decicion,File f,int i){
    
    Mammal A[] = new Mammal[2];
    
    A[i] = new Mammal(id,arrivalYear,name,numberOfNipple,size,decicion);
      try{
           FileWriter fw = null ;
           BufferedWriter bw = null ;
           if (f.exists()){
               
              fw = new FileWriter(f,true);
               bw = new BufferedWriter(fw);
               bw.newLine();
               bw.write(A[i].getNumberOfNipple());
               
               
           }else{
               
                fw = new FileWriter(f,true);
               bw = new BufferedWriter(fw);
               bw.write(A[i].getNumberOfNipple());
                 
           }
          bw.close();
          fw.close();
      
                    
       }catch (IOException e){
           System.out.println(e);
       }
       
    
}
}
