/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab9operators.model;
import java.util.Calendar;
import java.util.Locale;
/**
 *
 * @author Luis Loachamin
 */
public class Lab9 {
int yearCurrent;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation op = new Operation();
        Operation op2 = new Operation();
        op.add(12, 2);
        Person p1 = new Person(22,11,1998);
        op.view();
        Calendar sameDate = Calendar.getInstance();


Locale locale = Locale.getDefault();

Calendar today = Calendar.getInstance();
yearCurrent
System.out.println("Day of Month : " + today.get(Calendar.YEAR));

today.get(Calendar.YEAR);
today.get(Calendar.MONTH);
today.get(Calendar.DAY_OF_WEEK);





       
    }
    
}
