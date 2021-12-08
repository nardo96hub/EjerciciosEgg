/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.AnteriorGuia.Ej3;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test t=new Test();
        ArrayList<CantanteFamoso> c=t.crearcantantes();
        t.cambio(c);
        
    }
    
}
