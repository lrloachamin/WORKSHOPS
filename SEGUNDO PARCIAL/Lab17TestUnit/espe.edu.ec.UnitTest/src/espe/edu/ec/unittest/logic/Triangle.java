/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.unittest.logic;

import java.text.DecimalFormat;

/**
 *
 * @author SAOM
 */
public class Triangle 
{
    public float sideA;
    public float sideB;
    public float sideC;
    
    public int validateTriangle(float side1, float side2, float side3)
    {
        if((side1+side2>side3) && (side2+side3>side1) && (side1+side3>side2) )
        {            
            return 1;
        }
        else
        {
           return -1; 
        }
        
    }
    
    public float calculateArea(float side1, float side2, float side3)
    {
        float semiperimeter,area; 
        semiperimeter=(side1+side2+side3)/2;
        area=(float) Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
        return area;      
    }
    public float perimetero(float side1,float side2, float side3){
        float result;
        float setResult;
        DecimalFormat formate= new DecimalFormat("#.00");
        if (side1<=0 || side2<=0 || side3<=0){
            return -1;
        }else {
            result=side1+side2+side3;
            setResult = Float.parseFloat(formate.format(result));
            return setResult;
        }  
    }
}
