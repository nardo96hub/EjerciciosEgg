/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.servicios;

import _7_AccesoBDD.JPA.Ej1.entidades.Prestamo;
import _7_AccesoBDD.JPA.Ej1.persistencia.PrestamoDAO;
import com.sun.istack.internal.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Jorge
 */
public class PrestamoServicio {

    public static Prestamo CrearPrestamo() {
     
        try {
            Prestamo p = new Prestamo();
            System.out.println("Ingrese datos para crear Prestamo");
            Scanner l = new Scanner(System.in);
            System.out.println("Ingrese fechaPrestamo DD/MM/YYYY");
            Date fp, fd;
            fp=fd=null;
            
            String fecha=l.next();
            try{
                fp=new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            }catch(ParseException ex)
            {
                System.out.println("Error");
            }
            System.out.println("Ingrese fechaDevolucion DD/MM/YYYY");
        
            
          fecha=l.next();
            try{
                fd=new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            }catch(ParseException ex)
            {
                System.out.println("Error");
            }
       

         

            PrestamoDAO ad = new PrestamoDAO();
            /*Prestamo autor = ad.buscarAutorNombre(nombre);*/
            p.setFechaDevolucion(fd);
            p.setFechaPrestamo(fp);
            LibroServicio lib=new LibroServicio();
            p.setLibro(lib.crearLibro());
            ClienteServicio cs=new ClienteServicio();
            p.setCliente(cs.CrearCliente());
            ad.crearPrestamo(p);
        

            return p;
        } catch (Exception e) {
            System.out.println("No se puede acceder a la base de datos");
            return null;
        }

    }

    static boolean VerifBddPrestamo() {
        PrestamoDAO pd=new PrestamoDAO();
        return pd.VerificarPrestamo()==null;
    }

    
}
