/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ec.Lab19;

/**
 *
 * @author Asus
 */
public class BasicOperation {
    private float operand1;
    private float operand2;
    private float result;

    public BasicOperation(float operand1, float operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result=0;
    }

    public float getResult() {
        return result;
    }

    public void setOperand1(float operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(float operand2) {
        this.operand2 = operand2;
    }

public float add(){
    result= operand1+operand2;
    return result;
}
 public float substraction(){
    result= operand1-operand2;
    return result;
}
 public float multyplece(){
    result= operand1*operand2;
    return result;
}
 public float divide(){
    result= operand1/operand2;
    return result;
}
    
}
