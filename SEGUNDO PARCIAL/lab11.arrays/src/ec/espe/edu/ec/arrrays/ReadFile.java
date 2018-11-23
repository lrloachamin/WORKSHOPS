/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.arrrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luis Loachamin
 */
public class ReadFile {
    
    
    public void readtxt(String Directory){
        String texto;
        String [] a1 = new String[9];
        String B[] = new String[9];
  
        try{
            BufferedReader bf = new BufferedReader(new FileReader(Directory));
            String temp=" ";
            String bfRead;
           
            
            int cont=0;
            while ((bfRead = bf.readLine())!= null ){
             
             if (cont==0){
                 B[1]=bfRead;
                 
             } 
             else if (cont==1){
                B[2]=bfRead;
             }else if (cont==2){
                B[3]=bfRead;
             }else if (cont==3){
                B[4]=bfRead;
             }else if (cont==4){
                B[5]=bfRead;
             }else if (cont==5){
                B[6]=bfRead;
             }else if (cont==6){
                B[7]=bfRead;
             }else if (cont==7){
                B[8]=bfRead;
             }else if (cont==8){
                B[9]=bfRead;
             }
             
             cont++;
             
              
              
             /*  
              String B[] = new String[9];
              for (int i=0;i<B.length;i++){
              String x1=A[0]; 
              String x2=A[1]; 
              String x3=A[2]; 
              String x4=A[3];
             Person p1 = new Person(x1,x2,x3,x4); 
              B[i]=p1.getDay();
               
            }*/    
            
         }
            
        }catch(IOException e){System.err.println("archivo no encontrado");}
       
            for (String i:B){
                System.out.println(i);
                
            }
    }
    
       
                      
}

