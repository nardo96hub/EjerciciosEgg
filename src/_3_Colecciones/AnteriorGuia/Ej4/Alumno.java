/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.AnteriorGuia.Ej4;

import java.util.Comparator;

/**
 *
 * @author Jorge
 */
public class Alumno {

    String nombre, apellido, legajo, sexo, condicion;
    Double notaF;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String legajo, String sexo, String condicion, Double notaF) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sexo = sexo;
        this.condicion = condicion;
        this.notaF = notaF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Double getNotaF() {
        return notaF;
    }

    public void setNotaF(Double notaF) {
        this.notaF = notaF;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + ", sexo=" + sexo + ", condicion=" + condicion + ", notaF=" + notaF + '}';
    }

    public static Comparator<Alumno> NotaM = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a, Alumno a1) {
            return a1.getNotaF().compareTo(a.getNotaF());
        }

    };
    public static Comparator<Alumno> NotaMe = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a, Alumno a1) {
            return a.getNotaF().compareTo(a1.getNotaF());
        }

    };
       public static  Comparator<Alumno> Apellido=new Comparator<Alumno>()
   {
        @Override
        public int compare(Alumno a, Alumno a1) {
            return a.getNombre().compareTo(a1.getNombre());
        }
       
   };
}
