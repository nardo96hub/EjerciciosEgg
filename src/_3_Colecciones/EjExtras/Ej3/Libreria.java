/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.EjExtras.Ej3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Libreria {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> biblioteca;

    public Libreria() {
        biblioteca = new HashSet();
    }

    public HashSet<Libro> getBiblioteca() {
        return biblioteca;
    }
    public Integer validarInt(Integer a)
    {
        Integer r=a;
        
        while(r<0)
        {
            System.out.println("Ingrese un numero>=0");
            r=leer.nextInt();
        }
        return r;
    }
    public void crearBiblioteca() {
        String r;
        do {
            System.out.println("Ingrese nombre de Libro");
            Libro aux = new Libro();
            aux.setTitulo(leer.next());
            System.out.println("Ingrese autor del Libro");
            aux.setAutor(leer.next());
            System.out.println("Ingrese cantidad de ejemplares");
            aux.setNumE(validarInt(leer.nextInt()));
            System.out.println("Ingrese cantidad de ejemplares prestados ");
            aux.setNumEP(validarInt(leer.nextInt()));

            getBiblioteca().add(aux);
            System.out.println("Ingrese (s/n) si desea agregar libros a la biblioteca.");
            r = leer.next();
            while (!r.equalsIgnoreCase("n") && !r.equalsIgnoreCase("s")) {
                System.out.println("Ingrese (s/n) ");
                r = leer.next();
            }
        } while (r.equalsIgnoreCase("s"));
        int op;
        do {
            System.out.println("-----------------MENU-----------------\n1_Ver libros de biblioteca\n2_Prestar Libros\n3_Regresar Libros\n4_Salir");
            System.out.println("Ingrese una opcion entre [1,4]");
            op = leer.nextInt();
            while (op < 1 || op > 4) {
                System.out.println("Ingrese una opcion entre [1,4]");
                op = leer.nextInt();
            }
            switch (op) {
                case 1: {
                    mostrar();
                }
                break;
                case 2: {
                    if (!prestamo()) {
                        System.out.println("No se encontro libro o no se pudo realizar prestamo");
                    }
                }
                break;
                case 3: {
                    if (!devolver()) {
                        System.out.println("No se encontro libro o no se pudo realizar devolucion ");
                    }
                }
                break;
                default: {
                    r = "n";
                }
            }

            if (op != 4) {
                System.out.println("Ingrese (s/n) si desea ver el menu.");
                r = leer.next();
                while (!r.equalsIgnoreCase("n") && !r.equalsIgnoreCase("s")) {
                    System.out.println("Ingrese (s/n) si desea ver el menu.");
                    r = leer.next();
                }
            }

        } while (r.equalsIgnoreCase("s"));

      
    }

    private void mostrar() {
        int i=0;
        System.out.println("El contenido de la Biblioteca es:");
        for (Libro l : biblioteca) {
            i++;
            System.out.println("Libro "+i+" "+l);
        }
    }

    private boolean prestamo() {
        System.out.println("Ingrese titulo del libro que desea realizar un prestamo");
        String tb = leer.next();
        boolean per = false;
        Integer prestar;
        Libro a = new Libro("8", "8", 8, 8);

        Iterator itb = biblioteca.iterator();

        while (itb.hasNext()) {
            a = (Libro) itb.next();
            if (a.getTitulo().equalsIgnoreCase(tb)) {
                if (a.getNumE() > 0) {
                    per = true;
                    System.out.println("Ingrese cuantos libros desea llevar <" + a.getNumE());
                    prestar = leer.nextInt();
                    while (prestar > a.getNumE()) {
                        System.out.println("Ingrese cuantos libros desea llevar <=" + a.getNumE());
                        prestar = leer.nextInt();
                    }
                    a.setNumE(a.getNumE() - prestar);
                    a.setNumEP(a.getNumEP() + prestar);
                    itb.remove();
                    
                    System.out.println("Se realizo el prestamo exitosamente");

                } else {
                    System.out.println("No se puede prestar libro");
                }
            }
        }
        if (per) {
            biblioteca.add(a);
        }

        return per;
    }

    private boolean devolver() {
        System.out.println("Ingrese titulo del libro que desea realizar una devolucion");
        String tb = leer.next();
        boolean pert = false;
        Integer regresar;
        Libro a ;

        Iterator itb = biblioteca.iterator();

        while (itb.hasNext()) {
            a = (Libro) itb.next();
            if (a.getTitulo().equalsIgnoreCase(tb)) {
                if (a.getNumEP() > 0) {
                    pert = true;
                    System.out.println("Ingrese cuantos libros desea llevar <" + a.getNumEP());
                    regresar = leer.nextInt();
                    while (regresar > a.getNumEP()) {
                        System.out.println("Ingrese cuantos libros desea regresar <=" + a.getNumEP());
                        regresar = leer.nextInt();
                    }
                    a.setNumE(a.getNumE() + regresar);
                    a.setNumEP(a.getNumEP() - regresar);
                    itb.remove(); biblioteca.add(a);
                    System.out.println("Se realizo la devolucion exitosamente");
                } else {
                    System.out.println("No se puede prestar libro");
                }
            }
        }
      

        return pert;
    }
}
