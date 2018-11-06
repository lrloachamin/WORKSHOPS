/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author G403
 */
public class Operacion {
  
    
   private int operand1;
   private int operand2;
   private int result;
   int resta;
   int mult;
   int i;
   int div;
   
   
   
   
   
   public int add(int operand1,int operand2){
       
     result=operand1+operand2;  
      
   return result;
    
}
   public int subtraction(int operand1, int operand2){
       
    resta=add(operand1,-operand2);
       
       return resta;
           
   }
   public int multpilication (int operand1 ,int operand2){
     
       if (operand2<0){
           operand2=operand2*(-1);
            while (operand2 != 0){
           
           mult= add(mult,operand1);
           
                   operand2--;    
       }
     mult=mult*(-1);
   
       return  mult;
                
       }
       else if (operand1==0 || operand2==0){
           
           return 0;
       }
          
       else {
       while (operand2 != 0){
           
           mult= add(mult,operand1);
           
                   operand2--;    
       }
     
       return  mult;
       }   
   }
   
   public int division (int operand1,int operand2){
       i=0;
       while(operand1>0){
           operand1=subtraction(operand1,operand2);
           i=i+1;
       }
       return i;
   }
  
       
   public void view (){
       
        System.out.println("the sumna es  "+result);
       System.out.println("the subtraccion es  "+resta);
       System.out.println("the subtraccion es  "+mult);
       System.out.println("the division is "+i);
       
       
       
       
       
   }
       
   
           
           
}