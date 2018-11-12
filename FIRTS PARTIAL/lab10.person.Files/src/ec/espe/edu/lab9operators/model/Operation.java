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
public class Operation {
  
    
   private int operand1;
   private int operand2;
   int result;
   int sub1;
   int mult;
   int i;
   int div;
 
   
   public int add(int operand1,int operand2){
 
       
     result=operand1+operand2;  
      
   return result;
    
}
   public int subtraction(int operand1, int operand2){
       
    sub1=add(operand1,-operand2);
       
       return sub1;
           
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
       if (operand1<0){
          operand1=operand1*(-1);
       i=0;
       while(operand1>0){
           operand1=subtraction(operand1,operand2);
           i=i+1;
       }
       i=i*(-1);
       return (i);
       }  
       else if (operand2<0){
          operand2=operand2*(-1);
       i=0;
       while(operand1>0){
           operand1=subtraction(operand1,operand2);
           i=i+1;
       }
       i=i*(-1);
       return (i);
       }
       else if (operand1<0 && operand2<0){
           i=0;
           operand1=operand1*(-1);
           operand2=operand2*(-1);
       while(operand1>0){
           operand1=subtraction(operand1,operand2);
           i=i+1;
       }
       return (i);
       }
       else {
       i=0;
       while(operand1>0){
           operand1=subtraction(operand1,operand2);
           i=i+1;
       }
       return (i);     
   }
   }
   public int validation(int x ){
       if (x<0){
          System.out.println("ERROR Ingrese un Numero positivo ");
          return 0;
       } 
       else 
           return 1;
   }
  
       
   public void view (){
       
        System.out.println("the sumna es  "+result);
       System.out.println("the subtraccion es  "+sub1);
       System.out.println("the subtraccion es  "+mult);
       System.out.println("the division is "+i);     
   }          
}