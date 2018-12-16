/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ReferentialData.logic;

/**
 *
 * @author Luis Loachamin
 */
public class saleslPrice {
    private float base;
    private float tax;
    private float finalPrice;

    public saleslPrice(float base, float tax, float finalPrice) {
        this.base = base;
        this.tax = tax;
        this.finalPrice = finalPrice;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }
    
    public void computeFinalPrice(){
        
        finalPrice=base*tax/100+base;
    }
    public void stringtoString(){
        System.out.println("Objects SalesPrixe datos ->base"+base);
        System.out.println("Objects SalesPrixe datos ->tax"+tax);
        System.out.println("Objects SalesPrixe datos ->base"+finalPrice);
    }
    @Override
    public String toString(){
        
        String temp ="Object SalesPrice data ->base: "+base+"-->tax: "+tax+"finalPrice-->: "+finalPrice;
        return temp;
    }    
    
    
    
}
