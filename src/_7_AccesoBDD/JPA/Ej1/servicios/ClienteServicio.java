/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.servicios;



import _7_AccesoBDD.JPA.Ej1.entidades.Cliente;
import _7_AccesoBDD.JPA.Ej1.persistencia.ClienteDAO;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ClienteServicio {
       public  static Cliente CrearCliente() {
      
        System.out.println("Ingrese datos para crear Cliente");
    Scanner l = new Scanner(System.in);
        System.out.println("Ingrese nombre de autor");
        String nombre = l.next();
      
      
      ClienteDAO ad=new ClienteDAO();
      Cliente cliente=ad.buscarClienteNombre(nombre);
      
      if(cliente==null)
       {
           Cliente temp =new Cliente();
           System.out.println("Ingrese dni");
          Long d=l.nextLong();
           System.out.println("Ingrese nombre y apellido.\nIngrese nombre");
           String n=l.next();
           System.out.println("Ingrese apellido");
           String a=l.next();
           System.out.println("Ingrese telefono");String t=l.next();
           temp.setNombre(nombre);
           temp.setDni(d);
           temp.setApellido(a);
           temp.setTelefono(t);
           ad.crearCliente(temp);
        
           return temp;
       }else System.out.println("Ya exista el cliente");
       
    return cliente;
    }
    public static void buscarClienteNombre()
    {
        String n; System.out.println("Ingrese nombre de nombre a buscar");
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        n=l.next();
        ClienteDAO a=new ClienteDAO();
        Cliente au=a.buscarClienteNombre(n);
       if(au==null)
       {
           System.out.println("El Cliente con nombre "+n+" no existe en la base de datos");
       }else System.out.println(au);
        
          
    }

    static boolean VerifBddCliente() {
        ClienteDAO cd=new ClienteDAO();
        
       return  cd.VerificarCliente()==null;
    }
}
