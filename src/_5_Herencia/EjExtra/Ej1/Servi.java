/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjExtra.Ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servi {

    ArrayList<Alquiler> alquiler = new ArrayList();
    Scanner l = new Scanner(System.in).useDelimiter("\n");

    public Servi() {
    }

    public ArrayList<Alquiler> getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(ArrayList<Alquiler> alquiler) {
        this.alquiler = alquiler;
    }

    public void CrearALquiler() {

        String r, n, tipo;
        char t;
        Integer d, m, a;
        r = "";
        long f;//en seg

        do {

            Alquiler al = new Alquiler();
            System.out.println("Ingrese nombre del cliente");
            al.setNombre(l.next());

            System.out.println("Ingrese posicion del amarre");
            al.setPosA(l.nextInt());

            System.out.println("Ingrese fecha de alquiler ");
            System.out.println("Ingrese año");
            a = l.nextInt();
            if (a < 0) {
                a = 2021;
            }
            System.out.println("Ingrese mes");
            m = l.nextInt();
            if (m < 1 || m > 12) {
                m = 7;
            }
            System.out.println("Ingrese dia");
            d = l.nextInt();
            if (d < 1 || d > 31) {
                d = 13;
            }

            f = d * 24 * 60 * 60 + a * 24 * 60 * 60 * 31 * 365 + m * 24 * 60 * 60 * 31;

            al.fechaAlq = f;
            System.out.println("Ingrese fecha de devolucion ");
            System.out.println("Ingrese año");
            a = l.nextInt();
            if (a < 0) {
                a = 2021;
            }
            System.out.println("Ingrese mes");
            m = l.nextInt();
            if (m < 1 || m > 12) {
                m = 12;
            }
            System.out.println("Ingrese dia");
            d = l.nextInt();
            if (d < 1 || d > 31) {
                d = 25;
            }

            f = d * 24 * 60 * 60 + a * 24 * 60 * 60 * 31 * 365 + m * 24 * 60 * 60 * 31;
            al.setFechaDev(f);

            System.out.println("Ingrese el tipo de Barco que desea alquilar (B,M,Y,V)");
            tipo = l.next();
            tipo.toUpperCase();

            while (tipo.charAt(0) != 'B' && tipo.charAt(0) != 'M' && tipo.charAt(0) != 'Y' && tipo.charAt(0) != 'V') {
                System.out.println("Ingrese el tipo de Barco que desea alquilar (B,M,Y,V)");
                tipo = l.next();
                tipo.toUpperCase();
            }
            t = tipo.charAt(0);

            switch (t) {
                case 'B': {
                    Barco b = new Barco();
                    b.crearBarco();
                    al.setB(b);
                }
                break;
                case 'M': {
                    BarcoMotor b = new BarcoMotor();
                    b.crearBarcoM();
                    al.setB(b);
                }
                break;
                case 'Y': {
                    Yates b = new Yates();
                    b.crearBarcoY();
                    al.setB(b);
                }
                break;
                case 'V': {
                    Velero b = new Velero();
                    b.crearBarcoV();
                    al.setB(b);
                }
                break;

            }

            alquiler.add(al);

            System.out.println("Desea agregar otro alquiler?");
            r = l.next();
        } while (r.equalsIgnoreCase("s"));

        CalcAlq();

    }

    public void CalcAlq() {
        Barco b;
        for (Alquiler a : alquiler) {
            b = a.getB();
            b.Alquilar(a);
        }

    }
}
