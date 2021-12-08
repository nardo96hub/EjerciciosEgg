/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.EjExtras.Ej2.EjMesa;

import java.util.Comparator;

/**
 *
 * @author Jorge
 */
public class Cantante {
    String nombre,DiscoMV;

    public Cantante(String nombre, String DiscoMV) {
        this.nombre = nombre;
        this.DiscoMV = DiscoMV;
    }

    public Cantante() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMV() {
        return DiscoMV;
    }

    public void setDiscoMV(String DiscoMV) {
        this.DiscoMV = DiscoMV;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombre=" + nombre + ", DiscoMV=" + DiscoMV + '}';
    }
    
    public static Comparator<Cantante> ordenNombreA=new Comparator<Cantante>()
    {
        @Override
        public int compare(Cantante c1, Cantante c2) {
            return c1.getNombre().compareTo(c2.getNombre());
        }
        
    };
       public static Comparator<Cantante> ordenNombreD=new Comparator<Cantante>()
    {
        @Override
        public int compare(Cantante c1, Cantante c2) {
            return c2.getNombre().compareTo(c1.getNombre());
        }
        
    };
       public static Comparator<Cantante> ordenNombreDiscA=new Comparator<Cantante>()
       {
        @Override
        public int compare(Cantante c1, Cantante c2) {
           return c1.getDiscoMV().compareTo(c2.getDiscoMV());
        }
           
       };
            public static Comparator<Cantante> ordenNombreDidscD=new Comparator<Cantante>()
       {
        @Override
        public int compare(Cantante c1, Cantante c2) {
           return c2.getDiscoMV().compareTo(c1.getDiscoMV());
        }
           
       };
}
