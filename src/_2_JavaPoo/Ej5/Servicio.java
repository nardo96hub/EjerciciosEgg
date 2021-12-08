/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej5;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servicio {

    public Servicio() {
    }

    public Banco crearCuenta() {
        int c, d;
        double s;
        /*System.out.println("Ingrese cuenta de banco,DNI y saldo");
        Scanner l = new Scanner(System.in);
        c =(Integer) l.nextInt();
        d =(Integer) l.nextInt();
        s =(Double)l.nextDouble();*/
        Banco b = new Banco(123456, 987654321, 200.0);
        return b;

    }

    public void ingresar(Banco b, double i) {

        b.setSaldo(b.getSaldo() + i);
    }

    public void retirar(Banco b, double i) {
        if (b.getSaldo() != 0) {
            b.setSaldo(b.getSaldo() - i);
        }

    }

    public void consultarS(Banco b) {
        System.out.println("El saldo de la cuenta " + b.getNumc() + " es de:" + b.getSaldo());
    }

    public void datos(Banco b) {
        System.out.println("Los datos de la cuenta " + b.getNumc() + " es: DNI=" + b.getDni() + " Saldo=" + b.getSaldo());
    }

    public void extraccinonRapida(Banco b) {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese un monto a retirar");
        double r;
        r=l.nextDouble();
        while(r>b.getSaldo()*0.2)
        {
            System.out.println("Ingrese un monto menor a "+b.getSaldo()*0.2);
            r=l.nextDouble();
        }
        b.setSaldo(b.getSaldo()-r);
    }
}
