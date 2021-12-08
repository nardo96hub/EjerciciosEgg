/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej5;

/**
 *
 * @author Jorge
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio s=new Servicio();
        Banco b=s.crearCuenta();
        s.datos(b);
        s.ingresar(b, 10.5);
        s.consultarS(b);
        s.retirar(b, 5.5);
        s.consultarS(b);
        s.extraccinonRapida(b);
        s.consultarS(b);
        
    }
    
}
