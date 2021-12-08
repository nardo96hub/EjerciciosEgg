/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej2;

/**
 *
 * @author Jorge
 */
public class Lavadora extends Electrodomesticos {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        setCarga(l.nextInt());

        preciofinal();
    }

    @Override
    public String toString() {
        return "Lavadora{" +getE() +"carga=" + carga  +'}';
    }

    private void preciofinal() {
        precioFinal();
        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500D);
        }
    }
}
