/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjExtra.Ej1;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Barco {
   protected String matricula;
   protected Integer eslora,anioF;
 protected Scanner l=new Scanner(System.in).useDelimiter("\n");
    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioF) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioF = anioF;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioF() {
        return anioF;
    }

    public void setAnioF(Integer anioF) {
        this.anioF = anioF;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioF=" + anioF + '}';
    }
    
    public void crearBarco()
    {
       // Scanner l=new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese matricula");
        setMatricula(l.next());
        System.out.println("Ingrese eslora");
        setEslora(l.nextInt());
        if(getEslora()<0)setEslora(8);
        System.out.println("Ingrese año del barco");
        setAnioF(l.nextInt());
        if(getAnioF()<0) setAnioF(2021);
        
    }
    
    public long Alquileres(Alquiler a)
    {
        
     long p= a.getFechaDev()- a.getFechaAlq();
      if(p<0)p=-p;
      p=p/(24*60*60);
       return (long)(p*(getEslora()*10));
    }
    protected  void Alquilar(Alquiler a)
    {
        System.out.println("Se debe pagar un alquiler de:"+Alquileres(a)); 
    }
}
