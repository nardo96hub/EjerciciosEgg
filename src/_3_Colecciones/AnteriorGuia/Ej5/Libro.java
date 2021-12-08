/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.AnteriorGuia.Ej5;

/**
 *
 * @author Jorge
 */
public class Libro {
    String titulo,autor;
    Integer numE,numEP;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numE, Integer numEP) {
        this.titulo = titulo;
        this.autor = autor;
        this.numE = numE;
        this.numEP = numEP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumE() {
        return numE;
    }

    public void setNumE(Integer numE) {
        this.numE = numE;
    }

    public Integer getNumEP() {
        return numEP;
    }

    public void setNumEP(Integer numEP) {
        this.numEP = numEP;
    }

    @Override
    public String toString() {
        return "{ titulo:" + titulo + ", autor:" + autor + ", numE:" + numE + " y numE:" + numEP + '}';
    }
    
}
