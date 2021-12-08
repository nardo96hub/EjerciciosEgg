package _2_JavaPoo.Ej6;

import java.util.Scanner;

public class Servicio {

    public Servicio() {
    }

    public Cafeteria crearcafeteria() {
        Scanner l = new Scanner(System.in);
        Integer m, a;
        System.out.println("Ingrese capacidad maxima ");
        m = (Integer) l.nextInt();
        while (m < 0) {
            System.out.println("Ingrese capacidad maxima ");
            m = (Integer) l.nextInt();
        }
        System.out.println("Ingrese cantidad de cafe <= " + m);
        a = (Integer) l.nextInt();
        while (a < 0 || a > m) {
            System.out.println("Ingrese cafe actual ");
            m = (Integer) l.nextInt();
        }
        Cafeteria c = new Cafeteria(m, a);
        return c;
    }

    public void llenarCafeteria(Cafeteria c) {
        c.setCapact(c.getCapmax());
    }

    public void servirTaza(Cafeteria c, Integer s) {
        System.out.println("Se servira cafe en una taza de capacidad:" + s);
        if (c.getCapact() <= s) {
            System.out.println("No alcanza a llenar la taza.Falta una cantidad de " + (s - c.getCapact()));
            c.setCapact(0);
        } else {
            System.out.println("Se lleno la taza");
            c.setCapact(c.getCapact() - s);
        }

    }

    public void vaciarCafetera(Cafeteria c) {
        c.setCapact(0);
    }

    public void agregarCafe(Cafeteria c, Integer i) {
        if (c.getCapact() + i < c.getCapmax()) {
            c.setCapact(i + c.getCapact());
        } else {
            c.setCapact(c.getCapmax());
        }
    }

    public void mostrar(Cafeteria c) {
        System.out.println("La cafetera tiene capacidad maxima de:" + c.getCapmax() + " y la actual es " + c.getCapact());
    }
}
