/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Persona crearpersona()
    {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.next();
        System.out.println("Ingrese el dia de su nacimiento");
        Integer dia = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        Integer mes = (sc.nextInt()) - 1;
        System.out.println("Ingrese el aÃ±o de nacimiento");
        Integer anio = sc.nextInt() - 1900;
        Date fNac = new Date(anio, mes, dia);
        Persona p = new Persona(nombre, fNac);
        return p;
    }
    public Integer calcularEdad(Persona p)
    {
        Date act=new Date();
        long milC,mila;
        milC=p.getFechan().getTime();
        mila=act.getTime();
        int diac,diah,diaDif;
        diah=(int) (mila/(86400000));
        diac=(int) (milC/(86400000));
        diaDif=diah-diac;
        int ano=Math.round(diaDif/365);
        return ano;
    }
    public void menorQue(Persona p1, Persona p2) {
        if (p1.getFechan().before(p2.getFechan())) {
            System.out.println(p1.getNombre() + " es mayor que "
                    + p2.getNombre());
        } else {
            System.out.println(p2.getNombre() + " es mayor que "
                    + p1.getNombre());
        }
    }

    public void menorQue2(Persona p1, Persona p2) {
        if (calcularEdad(p1) > calcularEdad(p2)) {
            System.out.println("P1 es mayor que P2");
        } else {
            System.out.println("P2 es mayor que P1");
        }
    }
}
