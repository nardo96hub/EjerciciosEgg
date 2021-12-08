/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.entidades;

import _7_AccesoBDD.Ej1.entidades.Generico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jorge
 */
public class ObjArreglo {
    private HashMap<String,Generico> consultas=new HashMap();

    public ObjArreglo(HashMap<String,Generico> consultas) {
        this.consultas = consultas;
    }

    public ObjArreglo() {
    }

    public HashMap<String,Generico> getConsultas() {
        return consultas;
    }

    public void setConsultas(HashMap<String,Generico> consultas) {
        this.consultas = consultas;
    }
    public void mostrar()
    {
         System.out.println("El Map contiene:");
        System.out.print("{");
        for (Map.Entry<String,Generico> e : consultas.entrySet()) {
            System.out.print("<Key:" + e.getKey() );
            
            for (Object o : e.getValue().getResul()) {
                System.out.println(o);
            }
           
        }
        System.out.print("}\n");
    }
    
}
