/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej3;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servi {

    Scanner l = new Scanner(System.in).useDelimiter("\n");
    private Cine cine = new Cine();

    private void crearEspectador() {
        String res = "";
        String n;
        Integer e;
        double d;
        System.out.println("Ingrese los espectadores que ingresaron al cine");
        do {
            System.out.println("Ingrese nombre");
            n = l.next();
            System.out.println("Ingrese edad");
            e = l.nextInt();

            System.out.println("Ingrese dinero del espectador " + n);
            d = l.nextDouble();
            while (d < 0 || e < 0) {
                if (d < 0) {
                    System.out.println("Ingrese dinero del espectador " + n);
                    d = l.nextDouble();
                } else {
                    System.out.println("Ingrese edad");
                    e = l.nextInt();

                }
            }
            cine.getEsp().add(new Espectador(n, e, d));

            System.out.println("Desea ingresar otro espectador?");
            res = l.next();

        } while (res.equalsIgnoreCase("s"));

        /* crearPelicula();
        crearSala();*/
    }

    private void crearPelicula() {

        System.out.println("Se ingresara informacion de la pelicula");
        System.out.println("Ingrese nombre de pelicula");
        String t = l.next();
        System.out.println("Ingrese duracion de pelicula");
        String du = l.next();
        System.out.println("Ingrese edad min para ver pelicula");
        Integer e = l.nextInt();
        System.out.println("Ingrese nombre director");
        String di = l.next();
        cine.setPeli(new Pelicula(t, du, e, di));

    }

    private void crearSala() {
        int F, C;
        System.out.println("Ingrese filas de la sala");
        F = l.nextInt();
        System.out.println("Ingrese columnas de la sala");
        C = l.nextInt();
        while (F < 1 || C < 1) {
            if (F < 1) {
                System.out.println("Ingrese filas de la sala");
                F = l.nextInt();
            } else {
                System.out.println("Ingrese columnas de la sala");
                C = l.nextInt();
            }
        }
        cine.setSala(F, C);
        for (int i = 0; i < cine.getSala().length; i++) {
            for (int j = 0; j < cine.getSala()[0].length; j++) {
                cine.getSala()[i][j] = " ";
            }

        }
    }

    public void comienzo() {

        crearEspectador();
        crearPelicula();
        crearSala();
        PonerPrecio();
        System.out.println("Comienzo de ingreso");
        int F, C;
        for (Espectador e : cine.getEsp()) {
            if (e.getDinero() >= cine.getPrecio() && cine.getPeli().getEdadmin() <= e.getEdad()) {
                F = (int) Math.random() * cine.getSala().length;
                C = (int) Math.random() * cine.getSala()[0].length;

                while (!cine.getSala()[F][C].equalsIgnoreCase(" ")) {
                    F = (int) Math.random() * cine.getSala().length;
                    C = (int) Math.random() * cine.getSala()[0].length;
                }
                cine.getSala()[F][C] = "X";
            }
        }
        mostrar();

    }

   private void PonerPrecio() {
        System.out.println("Ingrese precio de la sala");
        double p = l.nextDouble();
        while (p < 0) {
            System.out.println("Ingrese precio de la sala");
            p = l.nextDouble();

        }
        cine.setPrecio(p);

    }

    private void mostrar() {
        System.out.println("Los espectadores de la sala son los Siguientes:\n");
        for (int i = 0; i < cine.getSala().length; i++) {
            for (int j = 0; j < cine.getSala()[0].length; j++) {
                System.out.print((cine.getSala().length - i));
                System.out.print((char) (65 + j));
                System.out.print(cine.getSala()[i][j] + "|");
            }
            System.out.println("");
        }

    }
}
