/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.EjExtras.Ej2.EjMesa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servi {

    Scanner l = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Cantante> cantFamoso = new ArrayList<Cantante>();

    public ArrayList<Cantante> getCantFamoso() {
        return cantFamoso;
    }

    public Cantante cambio(Cantante c) {

        System.out.println("Ingrese el nombre del cantante");
        // String n,d;

        c.setNombre(l.next());
        System.out.println("Ingrese el disco con mas ventas ");
        c.setDiscoMV(l.next());

        return c;
    }

    private void agregarcante() {
        //Cantante c = new Cantante();
        for (int i = 1; i <= 5; i++) {
            agregar();
            //Otra forma cantFamoso.add(cambio(c));
        }

    }

    private void mostrar() {
        int op;
        System.out.println("1_Ordenar por NombreA\n2_Ordenar por NombreD\n3_Ordenar por NombreDiscA\n4_Ordenar por NombreDiscD\n5_Sin orden");
        System.out.println("Ingrese opcion entre [1,4]");
        op = l.nextInt();
        while (op < 1 || op > 5) {
            System.out.println("Ingrese opcion entre [1,4]");
            op = l.nextInt();
        }
        switch(op)
        {
            case 1:
            {
                cantFamoso.sort(Cantante.ordenNombreA);
            }break;
             case 2:
            {
                 cantFamoso.sort(Cantante.ordenNombreD); 
            }break;
             case 3:
            {
                  cantFamoso.sort(Cantante.ordenNombreDiscA);
            }break;
             case 4:
            {
                  cantFamoso.sort(Cantante.ordenNombreDidscD);
            }break;
            default:System.out.println("No hay orden establecido");
        }
        System.out.println("Los cantantes son:");
        for (Cantante cantante : cantFamoso) {
            System.out.println(cantante);
        }
    }

    private void agregar() {
        Cantante c = new Cantante();
        System.out.println("Ingrese el nombre del cantante");
        // String n,d;

        c.setNombre(l.next());
        System.out.println("Ingrese el disco con mas ventas ");
        c.setDiscoMV(l.next());

        cantFamoso.add(c);
    }

    private void eliminar() {
        System.out.println("Que cantante desea eliminar");
        String eliminar = l.next();
        Iterator it = cantFamoso.iterator();
        boolean eli = false;

        while (it.hasNext()) {
            Cantante c = (Cantante) it.next();
            /*Otra Forma:
              if(eliminar.equalsIgnoreCase(((Cantante)it.next()).getNombre()))
              {
                  
              }
             */
            if (eliminar.equalsIgnoreCase(c.getNombre())) {

                it.remove();
                eli = true;

            }
        }
        if (eli) {
            System.out.println("Se borro el elemento " + eliminar);
        } else {
            System.out.println("No se borro el elemento " + eliminar+" o no existe en la lista.");
        }

    }

    public void menu() {

        //agregarcante();
        String r = "";
        int op;
        do {
            System.out.println("--------MENU--------");
            System.out.println("1_Agregar cantante\n2_Mostrar todos\n3_Eliminar cantante\n4_Salir");
            System.out.println("Ingrese una opcion entre [1,4]");
            op = l.nextInt();
            while (op < 1 || op > 4) {
                System.out.println("Error ingrese una opcion entre [1,4]");
                op = l.nextInt();
            }
            switch (op) {
                case 1: {
                    agregar();
                }
                break;
                case 2: {
                    mostrar();
                }
                break;
                case 3: {
                    eliminar();
                }
                break;
                default:
                    r = "n";
            }

            if (op < 4) {
                System.out.println("Desea salir del programa (s/n)");
                r = l.next();
                while (!r.equalsIgnoreCase("s") && !r.equalsIgnoreCase("n")) {
                    System.out.println("Error desea salir del programa (s/n)");
                    r = l.next();
                }
            }

        } while (!r.equalsIgnoreCase("s"));

        /*cantFamoso.sort(Cantante.ordenNombreA);
        mostrar();
        cantFamoso.sort(Cantante.ordenNombreDidscD);
        mostrar();*/

    }

}
