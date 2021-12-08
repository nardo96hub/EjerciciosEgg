/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej3;

/**
 *
 * @author Jorge
 */
public class Pelicula {
    private String titulo;
    private String duracion;
    private Integer edadmin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, String duracion, Integer edadmin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadmin = edadmin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(Integer edadmin) {
        this.edadmin = edadmin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadmin=" + edadmin + ", director=" + director + '}';
    }
    
    
}
