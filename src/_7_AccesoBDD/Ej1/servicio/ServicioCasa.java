/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.servicio;

import _7_AccesoBDD.Ej1.entidades.Casa;
import _7_AccesoBDD.Ej1.persistencia.CasaDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ServicioCasa {

    public static ArrayList<Casa> guardarCasaJava() throws Exception {
        CasaDAO casa = new CasaDAO();
        return casa.cargarCasa();
    }

    public static ArrayList<Casa> consultaPunto2() throws Exception {
        CasaDAO casa=new CasaDAO();
        return casa.Punto2();
    }

    public static ArrayList<Casa> consultaPunto5() throws Exception {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese fecha");
        System.out.println("ingrese ano");
        int a = l.nextInt();
        System.out.println("ingrese mes");
        int m = l.nextInt();
        System.out.println("Ingrese dia");
        int d = l.nextInt();
        LocalDate dia = LocalDate.of(a, m, d);
        System.out.println("ingrese dias especificos");
        d = l.nextInt();

        CasaDAO c = new CasaDAO();

        return c.Punto5(dia, d);
    }

    public static void consultaPunto6() throws Exception {
        CasaDAO c = new CasaDAO();
        c.Punto6();
    }

    public static void consultaPunto7() throws Exception {
        CasaDAO c = new CasaDAO();
        c.Punto7();
    }

    public static ArrayList<Casa> consultaPunto8() throws Exception {

        CasaDAO c = new CasaDAO();

        return c.Punto8();
    }

}
