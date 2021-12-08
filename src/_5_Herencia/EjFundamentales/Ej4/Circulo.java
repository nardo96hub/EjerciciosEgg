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
public class Circulo implements Calculos{
    Integer radio,diametro;

    public Circulo(Integer radio) {
        this.radio = radio;
        diametro=radio*2;
    }

    public Circulo() {
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }
    
    public void crearCirculo()
    {
     
        Scanner l=new Scanner(System.in);
           System.out.println("Ingrese radio del circulo");
        setRadio(l.nextInt());
        while(getRadio()<0)
        {
                    System.out.println("Ingrese radio del circulo");
        setRadio(l.nextInt());  
        }
        setDiametro(getRadio()*2);
    }
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    
    @Override
    public void Area() {
        System.out.println("El area del circulo con Radio="+getRadio()+ " es:"+(pi*getRadio()*getRadio()));
    }

    @Override
    public void Perimetro() {
        System.out.println("El perimetro del circulo con Radio="+getRadio()+" es:"+(pi*getDiametro()));
    }
    
    
}
