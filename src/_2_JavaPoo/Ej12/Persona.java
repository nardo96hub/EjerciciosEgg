/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej12;

import java.util.Date;

//import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Persona {
    String nombre;
    Date fechan;

    public Persona() {
    }

    public Persona(String nombre, Date fechan) {
        this.nombre = nombre;
        this.fechan = fechan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechan() {
        return fechan;
    }

    public void setFechan(Date fechan) {
        this.fechan = fechan;
    }
   
  
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechan=" + fechan + '}';
    }
}
