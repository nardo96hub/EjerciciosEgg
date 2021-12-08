/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        String n, resp = "";
        ArrayList<Alumno> a = new ArrayList();
        Alumno b = new Alumno();
        do {
            a.add(b.crearAlumno());
            
            System.out.println("Desea ingresar otro dato (s/n)");
            resp = l.next();
            while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                System.out.println("Desea ingresar otro dato (s/n)");
                resp = l.next();
            }
            
        } while (resp.equalsIgnoreCase("s"));
        
        System.out.println("La informacion es la siguiente:");
        b.mostrar(a);
        System.out.println("Ingrese nombre de alumno a buscar");
        n=l.next();
        double notaf=b.notaFinal(a, n);
        if(notaf!=0)
        {
            System.out.println("La nota final del alumno: "+n+ " es de:"+notaf);
        }else System.out.println("El alumno no pertenece a la base de datos");
    }
    
}
