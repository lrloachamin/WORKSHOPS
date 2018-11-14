/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab10.Inheritance.model;

/**
 *
 * @author Luis Loachamin
 */
public class Reptile extends Animal{
    float  weight;
    float numberEggs;

    public float getNumberEggs() {
        return numberEggs;
    }

    public void setNumberEggs(float numberEggs) {
        this.numberEggs = numberEggs;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
     public float calculateEggs(float weigth){
        float  numberEggs;
        numberEggs=(float) (weigth*3/232.87);
        return numberEggs;
    }
     
    public Reptile(int id, int arrivalYear, String scientificName,float weight) {
        super(id, arrivalYear, scientificName);
        this.numberEggs=calculateEggs(weight);
    }
   
    
}
