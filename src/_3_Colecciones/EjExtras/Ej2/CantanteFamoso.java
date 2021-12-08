/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.EjExtras.Ej2;

/**
 *
 * @author Jorge
 */
public class CantanteFamoso {
    String nombre,discoCMV;

    public CantanteFamoso() {
    }

    
    public CantanteFamoso(String nombre, String discoCMV) {
        this.nombre = nombre;
        this.discoCMV = discoCMV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoCMV() {
        return discoCMV;
    }

    public void setDiscoCMV(String discoCMV) {
        this.discoCMV = discoCMV;
    }
    
}
