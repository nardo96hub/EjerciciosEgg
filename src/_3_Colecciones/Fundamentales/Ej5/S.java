/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Jorge
 */
public class S {

    HashSet<Pais> pais;
 
    Scanner l = new Scanner(System.in).useDelimiter("\n");

    public S() {
        this.pais = new HashSet();
    }

    public HashSet<Pais> getPais() {
        return pais;
    }

    public void setPais(HashSet<Pais> pais) {
        this.pais = pais;
    }

    public void crearPais() {
        String r;
        do {
            System.out.println("Ingrese nombre de pais");
           
            Pais p =new Pais(l.next()) ;
            System.out.println(p);
          
            pais.add(p);

            System.out.println("Desea seguir agregando informacion (s/n)");
            r = l.next();
            while (!r.equalsIgnoreCase("n") && !r.equalsIgnoreCase("s")) {
                System.out.println("Desea seguir agregando informacion (s/n)");
                r = l.next();
            }
        } while (r.equalsIgnoreCase("s"));

    }
    public void mostrarP()
    {
        System.out.println("La lista de todos los paises es la siguiente:");
        System.out.print("[");
        for(Pais p:getPais())
        {
            System.out.print(p+" ");
        }
        System.out.print("]\n");
    }
    public void borrar()
    {
        System.out.println("Ingrese palabra a buscar");
        boolean eli=false;
        String p=l.next();
        Iterator it=getPais().iterator();
        while(it.hasNext())
        {
            Pais aux=(Pais) it.next();
            String b=aux.getNombreP();
            if(b.equalsIgnoreCase(p))
            {
                it.remove();
                eli=true;
            }
        }
        if(eli)System.out.println("Se elimino el elemento "+p+" del arbol");
        else
            System.out.println("No se encontro el elemento "+p+" en el arbol");
        mostrarP();
        
    }
}
