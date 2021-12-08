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
public class Casa {
    private int id;
    private String calle;
    private int num;
    private String codpos;
    private String ciudad;
    private String pais;
    private Date fecha_desde;
    private Date fecha_hasta;
    private int tiempo_min;
    private int timpo_max;
    private double precio_habitacion;
    private String tipo_vivienda;

    public Casa() {
    }

    public Casa(int id, String calle, int num, String codpos, String ciudad, String pais, Date fecha_desde, Date fecha_hasta, int tiempo_min, int timpo_max, double precio_habitacion, String tipo_vivienda) {
        this.id = id;
        this.calle = calle;
        this.num = num;
        this.codpos = codpos;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_min = tiempo_min;
        this.timpo_max = timpo_max;
        this.precio_habitacion = precio_habitacion;
        this.tipo_vivienda = tipo_vivienda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCodpos() {
        return codpos;
    }

    public void setCodpos(String codpos) {
        this.codpos = codpos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public int getTiempo_min() {
        return tiempo_min;
    }

    public void setTiempo_min(int tiempo_min) {
        this.tiempo_min = tiempo_min;
    }

    public int getTimpo_max() {
        return timpo_max;
    }

    public void setTimpo_max(int timpo_max) {
        this.timpo_max = timpo_max;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", calle=" + calle + ", num=" + num + ", codpos=" + codpos + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + ", tiempo_min=" + tiempo_min + ", timpo_max=" + timpo_max + ", precio_habitacion=" + precio_habitacion + ", tipo_vivienda=" + tipo_vivienda + '}';
    }
    
    
}
