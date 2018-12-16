/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21;
import ec.espe.edu.ReferentialData.logic.saleslPrice;
/**
 *
 * @author Luis Loachamin
 */
public class Lab21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base=0;
        float tax=12;
        float finalPrice=0;
        base=10;
        saleslPrice salesprice = new saleslPrice(20f,10f,0f);
        System.out.println("the base: "+base+"the tax: "+tax+"final: "+finalPrice);
        computeFinalPrice(base,tax,finalPrice);
        System.out.println("the base: "+base+"the tax: "+tax+"final: "+finalPrice);
        salesprice.stringtoString();
        computeFinalPrice(salesprice);
        Integer num=10;
        System.out.println("num of main "+num);
        computeInteger(num);
        System.out.println("num of main "+num);
    
    }
    public static void computeFinalPrice(float mbase,float  mtax,float mfinalPrice ){
             
        mfinalPrice=mbase*mtax/100+mbase;
        System.out.println("Priting from main-->base: "+mbase+"tax: "+mtax+"finalPrice: "+mfinalPrice);
    }
    public static void computeFinalPrice (saleslPrice msalesPrice){
        msalesPrice.setFinalPrice(msalesPrice.getBase()*msalesPrice.getTax()/100+msalesPrice.getBase());
        System.out.println("Printing from ComputerFinalPrice"+msalesPrice);
    }
    public static void computeInteger (Integer num){
        num=num*num;
        System.out.println("num of method->"+num);
        
        
    }
    
}
