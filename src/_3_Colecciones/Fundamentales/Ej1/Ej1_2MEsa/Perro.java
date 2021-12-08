/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej1.Ej1_2MEsa;

/**
 *
 * @author Jorge
 */
public class Perro {
    String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getPerro() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    
}
