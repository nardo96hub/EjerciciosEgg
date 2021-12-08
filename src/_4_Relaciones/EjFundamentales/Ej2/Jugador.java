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
public class Jugador {
    Integer id;
    String nombre;
    boolean muerto;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre,boolean muerto) {
        this.id = id;
        this.nombre = nombre;
        this.muerto = muerto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", muerto=" + muerto + '}';
    }
    
    public boolean disparo(Revolver r)
    {
        if(r.morir())
        {
            muerto=true;
            return true;
        }
        else
        {
            muerto = false;
             r.siguienteCamara();
             return false;
        }
           
        
    }
    
}
