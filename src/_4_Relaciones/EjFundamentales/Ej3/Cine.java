/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej3;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Cine {
    private ArrayList<Espectador>esp=new ArrayList();
    private String [][]sala;
    private Pelicula peli;
    private Double precio;

    public Cine() {
    }

    public Cine(String[][] sala, Pelicula peli, Double precio) {
        this.sala = sala;
        this.peli = peli;
        this.precio = precio;
    }

    public ArrayList<Espectador> getEsp() {
        return esp;
    }

    public void setEsp(ArrayList<Espectador> esp) {
        this.esp = esp;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(int F ,int C) {
        this.sala = new String[F][C];
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "esp=" + esp + ", sala=" + sala + ", peli=" + peli + ", precio=" + precio + '}';
    }
    
    
    
}
