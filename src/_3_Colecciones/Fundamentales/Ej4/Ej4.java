/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej4;

import _3_Colecciones.Fundamentales.Ej3.Comparador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Pelicula> p=new ArrayList();
        Pelicula aux=new Pelicula();
        Scanner l=new Scanner(System.in).useDelimiter("\n");
        String r="";
        do
        {
            p.add(aux.crearPeli());
            
            
            
            System.out.println("Desea seguir agregando informacion (s/n)");
            r=l.next();
            while(!r.equalsIgnoreCase("n")&& !r.equalsIgnoreCase("s"))
            {
               System.out.println("Desea seguir agregando informacion (s/n)");
            r=l.next(); 
            }
        }while(r.equalsIgnoreCase("s"));
        aux.mostrar(p,"total");
        aux.mostrarD(p);
        p.sort(Comparador.DuracionA);
        aux.mostrar(p,"por DuracionA");
         p.sort(Comparador.DuracionD);
        aux.mostrar(p,"por DuracionD");
         p.sort(Comparador.NombreA);
        aux.mostrar(p,"por TituloA");
         p.sort(Comparador.DirectorA);
        aux.mostrar(p,"por DirectorA");
        
    }
    
}
