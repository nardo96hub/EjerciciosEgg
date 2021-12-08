/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej1.Ej1_2MEsa;

import static _3_Colecciones.Fundamentales.Ej1.Ej1_2MEsa.Comparadores.perroString;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class S {
    ArrayList<Perro> raza;
    Scanner l=new Scanner(System.in).useDelimiter("\n");
    public S() {
      this.raza=new ArrayList();
    }

    public ArrayList<Perro> getRaza() {
        return raza;
    }
    
    public void mostrar()
    {
        System.out.println("La lista contiene");
        System.out.print("[");
        for(Perro p: getRaza())
        {
            System.out.print(p.getPerro()+" ");
        }
        System.out.print("]\n");
    }
    public void borrarP()
    {
        boolean borrar=false;
        System.out.println("Ingrese raza de perro");
        String perro=l.next();
        Iterator it=getRaza().iterator();
        while(it.hasNext())
        {
            Perro perroit =(Perro) (it.next());
            String b=perroit.getPerro();
            if(b.equalsIgnoreCase(perro))
            {
                //raza.remove(it);
                it.remove();
                borrar=true;
            }
        }
        
        //mostrar();
        if(borrar)
        {
            System.out.println("Se elimino el elemento "+perro+" de la lista");
        }
        else System.out.println("No se elimino el elemento "+perro+" de la lista");
    }
    public void crearRazas()
    {
        String r="";
        
        do
        { 
            String nombrera;
            System.out.println("Ingrese nombre de raza");
            nombrera=l.next();
            Perro p=new Perro(nombrera);
            //raza.add(p);
            getRaza().add(p);
            //getRaza().add(new Perro(l.next()));
            
            
            
            System.out.println("Ingrese s/n si desea seguir cargando");
            r=l.next();
            while(!r.equalsIgnoreCase("n")&&!r.equalsIgnoreCase("s"))
            {
                 System.out.println("Ingrese s/n si desea seguir cargando");
            r=l.next(); 
            }
        }while(r.equalsIgnoreCase("s"));
           mostrar(); 
           borrarP();
           getRaza().sort(perroString);
           mostrar();
           
    }
    
    
    
}
