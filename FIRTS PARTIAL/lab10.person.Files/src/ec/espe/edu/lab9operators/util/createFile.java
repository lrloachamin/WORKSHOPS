/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab9operators.util;
import ec.espe.edu.lab9operators.model.Person;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class createFile {
    
    public void writer(Person p1,File f){
        
       try{
           FileWriter fw = null ;
           BufferedWriter bw = null ;
           if (f.exists()){
              fw = new FileWriter(f,true);
               bw = new BufferedWriter(fw);
               bw.newLine();
               bw.write(p1.getName()+";"+p1.getDay()+";"+p1.getMonth()+";"+p1.getYear());
               
               
           }else{
                fw = new FileWriter(f);
               bw = new BufferedWriter(fw);
               bw.write(p1.getName()+";"+p1.getDay()+";"+p1.getMonth()+";"+p1.getYear());
                 
           }
          bw.close();
          fw.close();
      
                    
       }catch (IOException e){
           System.out.println(e);
       }
       
        
    }
    public void delete (File f){
        int decision;
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea borrar el archivo: ");
        decision=sc.nextInt();
        if (decision==1){
            
        try
        {
            if(f.exists())
            {
                 f.delete();
                System.out.println("Ficherro Borrado");
            }
                
        }catch(Exception e)
        {
            System.out.println(e);
        }
 
          
        }

    
}
}  
