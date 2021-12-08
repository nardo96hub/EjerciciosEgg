/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjFundamentales.Ej1;

/**
 *
 * @author Jorge
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       // Animal perro = new Perro("Stich","Carnivoro",15,"Doberman",false);
       // perro.Alimentarse();
        Perro perro1=new Perro("Teddy", "Croquetas", "Chihuahua",10);
        perro1.Alimentarse();
        
        Animal gato=new Gato("Pelusa","Galletas","Siames",15);
        
        gato.Alimentarse();
        
        Animal caballo=new Caballo("Spirit","Pasto","Fino",25);
        caballo.Alimentarse();
    }
    
}
