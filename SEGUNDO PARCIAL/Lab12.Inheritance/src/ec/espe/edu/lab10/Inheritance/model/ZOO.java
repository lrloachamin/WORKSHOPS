/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab10.Inheritance.model;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Luis Loachamin
 */
public class ZOO {
    
    public static void main(String[] args) {
        
        
        for (int i=0;i<1;i++){
        String name;
        int id;
        int arrivalYear;
        int numberOfNipple;
        int size;
        int decicion;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DEL MAMIFERO: ");
        name=sc.nextLine();
        System.out.println("INGRESE EL ID DEL MAMIFERO: ");
        id=sc.nextInt();
        System.out.println("INGRESE El AÑO QUE LLEGO EL MAMIFERO: ");
        arrivalYear=sc.nextInt();
        System.out.println("INGRESE El NUMERO DE PEZONES DEL  MAMIFERO: ");
        numberOfNipple=sc.nextInt();
        System.out.println("INGRESE El TAMAÑO DEL  MAMIFERO: ");
        size=sc.nextInt();
        System.out.println("EL MAMIFERO ESTA EN EPOCA DE LACTANACIA \n DIGITE n 1 = SI \n 0= NO");
        decicion=sc.nextInt();
        
        createFile a = new createFile();
        File f = new File("ArchivoEdades.csv");
        a.writer(name,id,arrivalYear,numberOfNipple,size,decicion,f,i);
       
    }
        
    
    
}
}
