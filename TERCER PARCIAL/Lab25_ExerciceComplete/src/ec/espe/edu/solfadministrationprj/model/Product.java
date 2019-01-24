/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.solfadministrationprj.model;

/**
 *
 * @author Luis Loachamin
 */
public class Product {
  private int id;
  private     String name;
  private      float cost;
  private      int porcentaje;
   private     float pvp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public Product(int id, String name, float cost, int porcentaje, float pvp) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.porcentaje = porcentaje;
        this.pvp = pvp;
    }

   

    
    
    
}
