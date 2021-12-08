/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej5;

/**
 *
 * @author Jorge
 */
public class Pais {
    String nombreP;

    public Pais() {
    }

    public Pais(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return  nombreP + ' ';
    }
    
}
