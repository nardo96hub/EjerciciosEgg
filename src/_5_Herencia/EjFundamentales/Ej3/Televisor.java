/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej3;

/**
 *
 * @author Jorge
 */
public class Televisor extends Electrodomesticos {

    private Integer resolucion;
    private boolean sintTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintTDT, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();

        do {
            System.out.println("Ingrese resolucion de pantalla");
            setResolucion(l.nextInt());
        } while (getResolucion() < 1);

        System.out.println("Esta sincronizado? true/false");
        setSintTDT(l.nextBoolean());

        preciofinal();
    }

    private void preciofinal() {
        precioFinal();
        if (getResolucion() >= 40) {
            setPrecio(getPrecio() + getPrecio() * 0.3);

        }
        if (isSintTDT()) {
            setPrecio(getPrecio() + 500D);
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +getE()+ "resolucion=" + resolucion + ", sintTDT=" + sintTDT + '}';
    }

}
