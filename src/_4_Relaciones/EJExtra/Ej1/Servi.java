/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EJExtra.Ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servi {
    Scanner l = new Scanner(System.in);
   private ArrayList<Persona>personas =new ArrayList();
   private ArrayList<Perro>perros =new ArrayList();
    

    private void crearPERS()
    {
        
        String r="";
        System.out.println("Carga de personas ");
        do
        {
           Persona p=new Persona();
            p.crearPersona();
            personas.add(p);
            System.out.println("Crear otra persona?");
            r=l.next();
            
        }while(r.equalsIgnoreCase("s"));
    }
    private void crearPERRO()
    {
                String r="";
        System.out.println("Carga de perros ");
        do
        {
           Perro p=new Perro();
            p.crearPerro();
            perros.add(p);
            System.out.println("Crear otra persona?");
            r=l.next();
            
        }while(r.equalsIgnoreCase("s"));
    }

    public void PP() {
       crearPERS();
       crearPERRO();
        mostrar();
        Adopcion();
        mostrar();
    }
    public void eliminarPA()
    {
        Iterator it=perros.iterator();
        while(it.hasNext())
        {
            Perro p=(Perro)it.next();
            if(p.getAdopcion())
            {
                it.remove();
            }
        }
    }

    private void Adopcion() {
     
        for (Persona p : personas) {
            if(perros.size()>0)
            {
                mostrarPERRO();
                
                System.out.println("\nIngrese el nombre de un perro");
                String nomp=l.next();
                Perro perro;
                if(buscarnombre(nomp))
                {
                    
                    p.setPerro(buscarPerro(nomp));
                    eliminarPA();
                    System.out.println("La persona:"+p);
                }
            }else
            {
                System.out.println("No se puede adoptar mas perros ");
                break;
            }
        }
   
        
        
//            System.out.println("Dado los perros: ");
//            System.out.println(perro1);
//            System.out.println(perro2);
//            String nombreA;
//            System.out.println("La persona de nombre "+p1.getApellido()+" "+p1.getNombre()+" ingrese el nombre del perro que desea adoptar ["+perro1.getNombre()+","+perro2.getNombre()+"]" );                                
//            nombreA=l.next();
//            while(!nombreA.equalsIgnoreCase(perro1.getNombre())&& !nombreA.equalsIgnoreCase(perro2.getNombre()))
//            {
//                System.out.println("Ingrese ["+perro1.getNombre()+","+perro2.getNombre()+"]");
//                nombreA=l.next();
//            }
//          if(nombreA.equalsIgnoreCase(perro1.getNombre()))
//          {
//              p1.setPerro(perro1);
//              p2.setPerro(perro2);
//          }
//          else
//          {
//                   p1.setPerro(perro2);
//              p2.setPerro(perro1);
//          }
            
            
            
            
    }
    private boolean buscarnombre(String n)
    {
        boolean per=false;
        Iterator i=perros.iterator();
        while(i.hasNext())
        {
            Perro p=(Perro)i.next();
            if(p.getNombre().equalsIgnoreCase(n))
            {
                per=true;
                break;
            }
        }
        return per;
    }
    private Perro buscarPerro(String n)
    {
        int i=-1;
        Perro per=null;
         Iterator it=perros.iterator();
        while(it.hasNext())
        {
            i++;
            Perro p=(Perro)it.next();
            if(p.getNombre().equalsIgnoreCase(n))
            {
                perros.get(i).setAdopcion(true);
                per=p;
                break;
            }
        } 
        return per;
    }
    private void mostrar()
    {
        mostrarPERSONA();
        mostrarPERRO();
    }
    private void mostrarPERSONA() {
        System.out.println("LA lista de personas es:");
        for (Persona p : personas) {
            System.out.println(p);
        }
        System.out.println("");
    }
    private void mostrarPERRO()
    {
        System.out.println("La lista de perros no adoptados es:");
        for (Perro p : perros) {
            System.out.println(p);
        }
        System.out.println("");
    }
}
