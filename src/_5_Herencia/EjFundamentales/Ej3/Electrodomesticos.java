/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej3;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;
 protected Scanner l = new Scanner(System.in).useDelimiter("\n");
    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 65 && letra <= 70) {
            System.out.println("Letra correcta");
        } else {
            setConsumo('F');
        }
    }

    private void comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            System.out.println("Color correcto");
        } else {
            setColor("blanco");
        }
    }

    public void crearElectrodomestico() {
       
        System.out.println("Ingrese los datos del electrodomestico");
        System.out.println("Ingrese color (negro/blanco/azul/gris/rojo)");
        setColor(l.next());
        comprobarColor(getColor());
        System.out.println("Ingrese consumo electrico(A..F)");
        setConsumo(l.next().toUpperCase().charAt(0));
        setConsumo(getConsumo());
        comprobarConsumoEnergetico(getConsumo());
        do {
            System.out.println("Ingrese peso del producto");
            setPeso(l.nextDouble());
        } while (getPeso() < 1);
        setPrecio(1000D);

    }

    public void precioFinal() {
        //Por consumo

        
        switch (getConsumo()) {
            case 'A': {
                setPrecio(getPrecio() + 1000D);
            }
            break;
            case 'B': {
                setPrecio(getPrecio() + 800D);
            }
            break;
            case 'C': {
                setPrecio(getPrecio() + 600D);
            }
            break;
            case 'D': {
                setPrecio(getPrecio() + 500D);
            }
            break;
            case 'E': {
                setPrecio(getPrecio() + 300D);
            }
            break;
            case 'F': {
                setPrecio(getPrecio() + 100D);
            }
            break;
        }
    //Por peso
    if(getPeso()>0&&getPeso()<=19)
    {
        setPrecio(getPrecio()+100D);
    }else if(getPeso()>19 && getPeso()<=49)
    {
        setPrecio(getPrecio()+500D);
    }else if(getPeso()>=50 && getPeso()<=79)
    {
        setPrecio(getPrecio()+800D);
    }else
    {
        setPrecio(getPrecio()+1000D);
    }
    }
    public String getE()
    {
        return "precio:"+getPrecio()+" color:"+getColor()+" consumo:"+getConsumo()+" peso:"+getPeso()+ " ";
    }
  
    
    public void mostrar()
    {
        System.out.println();
    }
}
