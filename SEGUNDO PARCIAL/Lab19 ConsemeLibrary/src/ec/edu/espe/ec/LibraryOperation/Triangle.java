/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ec.LibraryOperation;

/**
 *
 * @author Asus
 */
public class Triangle extends Figures {
    private float base;
    private float height;
    
    @Override
    public float computeArea() {
       area=(base*height)/2;
        return area;
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }
    
    
}
