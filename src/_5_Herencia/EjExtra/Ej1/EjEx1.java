/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjExtra.Ej1;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class EjEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ArrayList<Integer> precioEstandar =new ArrayList();
        
        precioEstandar.add(1000);//Precio Velero
        precioEstandar.add(1500);//Precio BarM
        precioEstandar.add(2000);//Precio Yate
        
        */
    /* Barco v=new Velero(8, "matricula", 3, 1);
        System.out.println(v.getClass().getSimpleName());*/
        Servi s=new Servi();
        s.CrearALquiler();
        
        /*Yates y=new Yates(3, 3, "matricula", 8, 8);
        Barco b=new Barco("m", 8, 88);
        Velero v=new Velero(8, "matricula", 3, 1);
        BarcoMotor bm=new BarcoMotor(8, "matricula", 8, 8);
        String nombre=bm.getClass().getSimpleName();
        System.out.println(nombre);
        System.out.println(bm.getClass().getSimpleName());
          System.out.println(b.getClass().getSimpleName());
            System.out.println(y.getClass().getSimpleName());
              System.out.println(v.getClass().getSimpleName());*/
    }
    
}
