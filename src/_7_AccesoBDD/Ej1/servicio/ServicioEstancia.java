/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.servicio;

import _7_AccesoBDD.Ej1.entidades.Estancia;
import _7_AccesoBDD.Ej1.persistencia.EstanciaDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ServicioEstancia {

    public static ArrayList<Estancia> guardarEstanciaJava() throws Exception {
        EstanciaDAO est = new EstanciaDAO();
        return est.cargarEstancia();
    }

    public static void consultaPunto9() throws Exception {
        EstanciaDAO e = new EstanciaDAO();
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        String nombre, fecha;
        LocalDate fechad, fechah;
        System.out.println("Ingrese nombre de huesped");
        nombre = l.next();
        System.out.println("Ingrese fecha_desde 'YYYY-MM-DD");
        fecha = l.next();
        
        fechad = LocalDate.parse(fecha);
        System.out.println("Ingrese fecha_hasta 'YYYY-MM-DD");
        fecha = l.next();
        // fecha = "2020-08-13";
        fechah = LocalDate.parse(fecha);
        e.Punto9(nombre,fechad,fechah);
    }
}
