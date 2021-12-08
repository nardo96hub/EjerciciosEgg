/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej4;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Rectangulo implements Calculos{
    Integer base,altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    public void crearRec()
    {
         Scanner l=new Scanner(System.in);
           System.out.println("Ingrese altura del rectangulo");
        setAltura(l.nextInt());
          System.out.println("Ingrese base del rectangulo");
        setBase(l.nextInt());
        
        while(getAltura()<0||getBase()<0)
        {
            if(getBase()<0)
            {
                 System.out.println("Ingrese base del rectangulo");
        setBase(l.nextInt()); 
            }
            if(getAltura()<0)
            {
                     System.out.println("Ingrese base del rectangulo");
        setBase(l.nextInt()); 
            }
            
        }
        
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void Area() {
        System.out.println("El perimetro del rectangulo con base="+getBase()+" y altura="+getAltura()+" es de:"+(getAltura()*getBase()));
    }

    @Override
    public void Perimetro() {
        System.out.println("El perimetro del rectangulo con base="+getBase()+" y altura="+getAltura()+" es de:"+(2*(getAltura()+getBase())));
    }
    
    
}
