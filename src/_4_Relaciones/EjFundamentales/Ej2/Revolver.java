/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej2;

/**
 *
 * @author Jorge
 */
public class Revolver {

    Integer PosAC, PosB;

    public Revolver() {

    }

    public Integer getPosAC() {
        return PosAC;
    }

    public void setPosAC(Integer PosAC) {
        this.PosAC = PosAC;
    }

    public Integer getPosB() {
        return PosB;
    }

    public void setPosB(Integer PosB) {
        this.PosB = PosB;
    }

    @Override
    public String toString() {
        return "Revolver{" + "PosAC=" + PosAC + ", PosB=" + PosB + '}';
    }

    public void llenarREvolver() {
        this.PosAC = (Integer) (int) (Math.random() * 6+1);
        this.PosB = (Integer) ((int) (Math.random() * 6+1));
       
    }
    public boolean morir()
    {
        return PosAC==PosB;
    }
    public void siguienteCamara()
    {
        PosAC++;
        if(PosAC>6){PosAC=1;}
    }
}
