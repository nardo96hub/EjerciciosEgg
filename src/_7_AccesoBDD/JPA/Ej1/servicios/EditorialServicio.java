/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.servicios;

import _7_AccesoBDD.JPA.Ej1.entidades.Editorial;
import _7_AccesoBDD.JPA.Ej1.persistencia.EditorialDAO;
import java.util.Scanner;


/**
 *
 * @author Jorge
 */
public class EditorialServicio {
    public static Editorial CrearEditorial()
    {
        System.out.println("Ingrese Datos para crear Editorial");
        Scanner l=new Scanner(System.in);
        System.out.println("Ingrese nombre de editorial");
        String nombre=l.next();
       
        EditorialDAO edD=new EditorialDAO();
        Editorial ed=edD.buscarEditorialNombre(nombre);
       /* ed.setNombre(nombre);
        ed.setAlta(true);*/
        
        
        
        if(ed==null)
        {
            Editorial temp=new Editorial();
            temp.setAlta(true);
            temp.setNombre(nombre);
             edD.crearEditorial(temp);
             return temp;
        }
        else System.out.println("Ya existe la editorial en la base de datos ");
       
        
       
       // System.out.println("Se agrego la editorial: "+ed+" en la base de datos");
        return ed;
    }
    public static void BuscarEditorialNombre(String t)
    {
        EditorialDAO edi=new EditorialDAO();
        Editorial ed=edi.buscarEditorialNombre(t);
    }

  

   public static boolean VerifBddEstancia() {
           EditorialDAO edi=new EditorialDAO();
        return edi.VerficarEdi()==null;
    }
   public static void mostrarEstancia()
   {
       
       EditorialDAO a =new EditorialDAO();
        System.out.println("LA lista de editoriales en la base de datos es:");
        for (Editorial au : a.VerficarEdi()) {
            System.out.println(au);
            
        }
   }
}
