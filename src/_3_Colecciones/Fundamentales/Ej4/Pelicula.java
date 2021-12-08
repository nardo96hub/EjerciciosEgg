/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Pelicula {
    String titulo,director;
    Double duracion;
 
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
    public Pelicula crearPeli()
    {
        Scanner l=new Scanner(System.in).useDelimiter("\n");
        Pelicula a=new Pelicula();
        System.out.println("Ingrese nombre de pelicula");
        a.setTitulo(l.next());
        System.out.println("Ingrese nombre de director");
        a.setDirector(l.next());
        System.out.println("Ingrese duracion de pelicula");
        Double i=l.nextDouble();
        while(i<0)
        {
            System.out.println("Ingrese duracion de pelicula");
         i=l.nextDouble();
        }
        a.setDuracion(i);
        return a;
    }
     public void mostrar(ArrayList<Pelicula> pe, String forma)
     {
         
         System.out.println("La lista de todas las peliculas por la forma '"+forma.toUpperCase()+"' son las siguientes:");
         for(Pelicula p:pe)
         {
             System.out.println("Nombre:"+p.getTitulo()+" Director:"+p.getDirector()+" Duracion:"+p.getDuracion()+"h");
         }
         System.out.println("------------------------------------------\n\n");
     }
     public void mostrarD(ArrayList<Pelicula> pe)
     {
          System.out.println("La lista de todas las peliculas son las siguientes:");
         for(Pelicula p:pe)
         {
             if(p.getDuracion()>1)
             System.out.println("Nombre:"+p.getTitulo()+" Director:"+p.getDirector()+" Duracion:"+p.getDuracion()+"h");
         }
         System.out.println("------------------------------------------\n\n");
     }
   
    
}
