
package _7_AccesoBDD.JPA.Ej1.servicios;

import _7_AccesoBDD.JPA.Ej1.entidades.Autor;
import _7_AccesoBDD.JPA.Ej1.persistencia.AutorDAO;

import java.util.Scanner;


public class AutorServicio {
   // private Scanner l = new Scanner(System.in);
  
    public static Autor CrearAutor() {
       /* Autor a = new Autor();
        a.setAlta(true);*/
        System.out.println("Ingrese datos para crear Autor");
    Scanner l = new Scanner(System.in);
        System.out.println("Ingrese nombre de autor");
        String nombre = l.next();
       // a.setNombre(nombre);
      
       AutorDAO ad=new AutorDAO();
       Autor autor=ad.buscarAutorNombre(nombre);
       if(autor==null)
       {
           Autor temp =new Autor();
           temp.setAlta(true);
           temp.setNombre(nombre);
           ad.crearAutor(temp);
           return temp;
       }else System.out.println("Ya exista el autor");
       
    return autor;
    }
    public static void buscarAutorNombre()
    {
        String n; System.out.println("Ingrese nombre de nombre a buscar");
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        n=l.next();
        AutorDAO a=new AutorDAO();
        Autor au=a.buscarAutorNombre(n);
       if(au==null)
       {
           System.out.println("El autor con nombre "+n+" no existe en la base de datos");
       }else System.out.println(au);
        
          
    }

    public static boolean VerifBddAutor() {
        AutorDAO a =new AutorDAO();
        return a.VerificarAutor()==null;
        
    }
    public static void mostrarAutor()
    {
       AutorDAO a =new AutorDAO();
        System.out.println("LA lista de autores en la base de datos es:");
        for (Autor au : a.VerificarAutor()) {
            System.out.println(au);
            
        }
    }
}
