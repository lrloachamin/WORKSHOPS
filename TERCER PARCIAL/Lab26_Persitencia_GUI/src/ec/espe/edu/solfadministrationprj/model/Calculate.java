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
public class Calculate {
    private float Vo;
    private float angulo;
    private float gravite=(float) 9.8;
     private float max;

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }
    public Calculate(float Vo, float angulo,float max) {
        this.Vo = Vo;
        this.angulo = angulo;
         this.max = max;
    }

    public float getVo() {
        return Vo;
    }

    public void setVo(float Vo) {
        this.Vo = Vo;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    public float getGravite() {
        return gravite;
    }

    public void setGravite(float gravite) {
        this.gravite = gravite;
    }
    
    public static float distanceMax(float Vo,float angulo){
        float max;
        float gravite=(float) 9.8;
                angulo=(float) Math.toRadians(angulo);
                
                max=(Vo*Vo*2*angulo)/gravite;
        
        return max;
    }
    
    
    
}
