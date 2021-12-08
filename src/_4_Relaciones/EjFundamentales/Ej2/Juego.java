/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Juego {

    private Scanner l = new Scanner(System.in);
    private ArrayList<Jugador> jugadores;
    private Revolver arma;

    public Juego() {
        /*  jugadores=new ArrayList();
        arma=new Revolver();*/
    }

    private boolean buscarid(int id) {
        boolean pertenece = false;
        for (Jugador jugar : jugadores) {
            if (id == jugar.getId()) {
                pertenece = true;
                break;
            }
        }
        return pertenece;
    }

    public void mostrarjugadores() {
        System.out.println("Los jugadores son:");
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
    }

    public void mostrarid() {
        System.out.print("[");
        for (Jugador jugadore : jugadores) {
            System.out.print(jugadore.getId() + " ");

        }
        System.out.print("]\n");
    }

    public void llenarJuego(ArrayList<Jugador> jugad, Revolver r) {
        arma = r;
        jugadores = jugad;

        String re, nombre;
        //Jugador j = new Jugador();
        int id;

        System.out.println("Se creara los jugadores ");
        do {
            System.out.println("Ingrese un id de jugador");
            id = l.nextInt();
            while ((id < 1 || id > 6) || buscarid(id)) {

                if (id < 1 || id > 6) {
                    id = 6;
                } else {
                    System.out.print("Error ,se ingreso un numero entre[1,6] pero debe ingresar un num distinto a:");

                    mostrarid();
                    id = l.nextInt();
                }

            }
            System.out.println("Ingrese nombre de jugador");
            nombre = l.next();
            nombre = nombre + " " + id;
            /* j.setId(id);
            j.setNombre(nombre);
            j.setMuerto(false);*/

            jugadores.add(new Jugador(id, nombre, false));

            System.out.println("Desea ingresar otro jugador? ");
            re = l.next();
        } while (re.equalsIgnoreCase("s") && jugadores.size() != 6);
       mostrarjugadores();
        ronda();

    }

    private void ronda() {
        //System.out.println(arma.getPosB());
        
        while (arma.getPosB() != 0) {
            for (Jugador jugadore : jugadores) {
                System.out.println("La bala se encuentra en la recamara:"+arma.getPosB());
                System.out.println("La recamara actual es:"+arma.getPosAC());
                if (!jugadore.disparo(arma)) {
                    System.out.println(jugadore.getNombre() + " se salvo por lo que sigue vivo");
                } else {
                    System.out.println("El "+jugadore + " se murio");
                   
                    System.out.println("\n\n");
                    jugadoresVivos();
                    arma.setPosB(0);
                    break;
                }
            }
        }

        System.out.println("Fin del Programa adios");
    }

    private void jugadoresVivos() {
        System.out.println("Los jugadores que siguen vivo son:");
        for (Jugador jugadore : jugadores) {
            if (!jugadore.getMuerto()) {
                System.out.println(jugadore);
            }

        }
    }

}
