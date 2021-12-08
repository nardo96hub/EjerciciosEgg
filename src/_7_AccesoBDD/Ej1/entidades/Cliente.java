/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.entidades;

/**
 *
 * @author Jorge
 */
public class Cliente {
    private int id;
    private String nombre;
    private String calle;
    private int num;
    private String cod_postal;
    private String ciudad;
    private String pais;
    private String email;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String calle, int num, String cod_postal, String ciudad, String pais, String email) {
        this.id = id;
        this.nombre = nombre;
        this.calle = calle;
        this.num = num;
        this.cod_postal = cod_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", calle=" + calle + ", num=" + num + ", cod_postal=" + cod_postal + ", ciudad=" + ciudad + ", pais=" + pais + ", email=" + email + '}';
    }
    
    
}
