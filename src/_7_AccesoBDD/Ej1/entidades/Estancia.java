/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.entidades;

import java.sql.Date;

/**
 *
 * @author Jorge
 */
public class Estancia {
    private int id;
    private String nombre_huesped;
    private Date fecha_desde;
    private Date fecha_hasta;

    public Estancia() {
    }

    public Estancia(int id, String nombre_huesped, Date fecha_desde, Date fecha_hasta) {
        this.id = id;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public Estancia(int aInt, int aInt0, int aInt1, String string, Date date, Date date0) {
        id=aInt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    @Override
    public String toString() {
        return "Estancia{" + "id=" + id + ", nombre_huesped=" + nombre_huesped + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + '}';
    }
    
    
}
