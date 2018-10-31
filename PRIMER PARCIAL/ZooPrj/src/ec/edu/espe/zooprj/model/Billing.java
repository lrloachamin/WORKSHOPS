/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zooprj.model;

/**
 *
 * @author Luis Loachamin
 */
public class Billing {
    private  int codeSaleProduct;
    private String quantityProductSold;
    private  int iva; 

    public int getCodeSaleProduct() {
        return codeSaleProduct;
    }

    public String getQuantityProductSold() {
        return quantityProductSold;
    }

    public int getIva() {
        return iva;
    }

    public void setCodeSaleProduct(int codeSaleProduct) {
        this.codeSaleProduct = codeSaleProduct;
    }

    public void setQuantityProductSold(String quantityProductSold) {
        this.quantityProductSold = quantityProductSold;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
    
    public Billing(int codeSaleProduct, String quantityProductSold, int iva) {
        this.codeSaleProduct = codeSaleProduct;
        this.quantityProductSold = quantityProductSold;
        this.iva = iva;
    }
    public static void main(String[] args) {
   Billing billing1=new Billing (10,"20",11);
    System.out.println("el codigo del producto es: "+billing1.getCodeSaleProduct()+"");
    System.out.println("la cantidad de producto es "+billing1.getQuantityProductSold()+"");
    System.out.println("El email del estudiante es: "+billing1.getIva()+"");
}
       
}
