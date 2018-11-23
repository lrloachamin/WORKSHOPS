/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.educ.lab16Exeption.operation;

/**
 *
 * @author Asus
 */
public class Operation {
    
    public float divide(float operand1,float operand2){
        float cocient;
        cocient=operand1/operand2;
        return cocient;      
    }
    public short add(short operand1,short operand2){
        short add;
        add=(short) (operand1+operand2);
        
        return add;
    }
    public float add(float operand1,float operand2){
        float add;
        add=operand1+operand2;
        return add;      
    }
    
}
