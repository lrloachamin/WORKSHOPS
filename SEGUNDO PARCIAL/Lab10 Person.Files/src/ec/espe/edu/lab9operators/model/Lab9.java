/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab9operators.model;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import ec.espe.edu.lab9operators.model.Person;
import ec.espe.edu.lab9operators.util.createFile;
import java.io.File;

/**
 *
 * @author Luis Loachamin
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        Calendar today = Calendar.getInstance();
        Calendar sameDate = Calendar.getInstance();
        Operation op = new Operation();
         int yearPerson = 0;
         int monthPerson = 0;
         int dayPerson = 0;
         int ban;
         int decision;
         int addYearMonth;
         int addYearMonth1;
         int year = 0;
         int month = 0;
         int day = 0; 
         String name;
         int yearCurrent =today.get(Calendar.YEAR);
         int monthCurrent =today.get(Calendar.MONTH)+1;
         int dayCurrent =today.get(Calendar.DAY_OF_MONTH);
        Scanner sc = new Scanner(System.in);
       System.out.println("INGRESE SU NOMBRE: ");
        name=sc.nextLine();
     do{
        try{
            ban=0;
        System.out.println("INGRESE SU AÑO DE NACIMIENTO: ");
        year=sc.nextInt();
        op.validation(year);
        }catch(Exception e){System.out.println("Caracter no valido: ");ban=1;sc.nextLine();}
     }while (ban!=0 || op.validation(year)!=1);
     do{
        try{
            ban=0;
         System.out.println("INGRESE SU MES DE NACIMIENTO: ");
        month=sc.nextInt();
        op.validation(month);
     }catch(Exception e){System.out.println("Caracter no valido: ");ban=1;sc.nextLine();}
     }while (ban!=0 || op.validation(month)!=1);
    do{
        try{
            ban=0; 
         System.out.println("INGRESE SU DIA DE NACIMIENTO: ");
        day=sc.nextInt();
        op.validation(day);
      }catch(Exception e){System.out.println("Caracter no valido: ");ban=1;sc.nextLine();}
     }while (ban!=0 || op.validation(day)!=1);
        Person p1 = new Person(day,month,year,name);
        addYearMonth=op.add(today.get(Calendar.YEAR),today.get(Calendar.MONTH));
        addYearMonth1=op.add(year,month);
        if (addYearMonth<addYearMonth1 && today.get(Calendar.DAY_OF_MONTH)<day ){
            System.out.println("ERROR LA PERSONA NO TIENE EDAD");
            
        }
        else {
        
         if (dayCurrent<p1.getDay()){
             dayCurrent=dayCurrent+30;
             monthCurrent=monthCurrent-1; 
             dayPerson=dayCurrent-p1.getDay();
         }
         else{
             dayPerson=dayCurrent-p1.getDay();
             
         }    
         if (monthCurrent<p1.getMonth()){
             monthCurrent=op.add(monthCurrent,12);
             yearCurrent=op.subtraction(yearCurrent,1);
             monthPerson=op.subtraction(monthCurrent,p1.getMonth());        
         }
         else {
             monthPerson=op.subtraction(monthCurrent,p1.getMonth());
                  
         }
         yearPerson=yearCurrent-p1.getYear();  
         System.out.println(" "+yearPerson+" años con "+monthPerson+" meses y "+dayPerson+" dias");
        }
        createFile a = new createFile();
        File f = new File("Archivo.csv");
        a.writer(new Person(dayPerson,monthPerson,yearPerson,name),f);
        a.delete(f);
        
        
    }
}
