/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjExtra.Ej1;

/**
 *
 * @author Jorge
 */
public class Alquiler {
    String nombre;
    Long fechaAlq,fechaDev;
    Barco b;
    Integer posA;

    public Alquiler() {
    }

    public Alquiler(String nombre, Long fechaAlq, Long fechaDev, Barco b, Integer posA) {
        this.nombre = nombre;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.b = b;
        this.posA = posA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getFechaAlq() {
        return fechaAlq;
    }

    public void Long(Long fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Long getFechaDev() {
        return fechaDev;
    }

    public void setFechaAlq(Long fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public void setFechaDev(Long fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Barco getB() {
        return b;
    }

    public void setB(Barco b) {
        this.b = b;
    }

    public Integer getPosA() {
        return posA;
    }

    public void setPosA(Integer posA) {
        this.posA = posA;
    }
    
    
    
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", fechaAlq=" + fechaAlq + ", fechaDev=" + fechaDev + ", b=" + b + ", posA=" + posA + '}';
    }
    
    
    
}
