/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> raza=new ArrayList();
        Scanner l=new Scanner(System.in).useDelimiter("\n");
        String nombre,resp="";
        do
        {
            System.out.println("Ingrese raza de perro");
            raza.add(l.next());
            System.out.println("Desea ingresar otra raza (s/n");
            resp=l.next();
            while(!resp.equalsIgnoreCase("s")&& !resp.equalsIgnoreCase("n"))
            {
               System.out.println("Desea ingresar otra r (s/n)?");
            resp=l.next(); 
            }
            
        }while(resp.equalsIgnoreCase("s"));
        System.out.println("Las razas de los perros son:");
        for(String s:raza)
        {
            System.out.println(s+" ");
        }
        System.out.println("");
        
        System.out.println("Ingrese nombre de raza a eliminar");
        nombre=l.next();
        Iterator i=raza.iterator();
        while(i.hasNext())
        {
            String aux=(String)i.next();
            if(nombre.equalsIgnoreCase(aux))
            {
                System.out.println("Se eliminara la raza de perro:"+aux);
                raza.remove(i);
            }
        }
        System.out.println("Las razas de los perros actualizados son:");
        for(String s:raza)
        {
            System.out.println(s+" ");
        }
        System.out.println("");
    }
    
}
