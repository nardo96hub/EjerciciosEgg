/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Baraja {

    private Scanner l = new Scanner(System.in);
    private ArrayList<Carta> baraja = new ArrayList();
    private Integer PosA = 0;

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public Integer getPosA() {
        return PosA;
    }

    public void setPosA(Integer PosA) {
        this.PosA = PosA;
    }

    public void crearbaraja() {
        String p = "";
        Integer n;
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1: {
                    p = "espadas";
                }
                break;
                case 2: {
                    p = "bastos";
                }
                break;
                case 3: {
                    p = "oros";
                }
                break;
                case 4: {
                    p = "palo";
                }
                break;
            }
            for (int j = 1; j <= 10; j++) {
                if (j < 8) {
                    n = j;
                } else {
                    n = j + 2;
                }
                baraja.add(new Carta(n, p));
            }
        }
        //mostrarTodaLaBaraja();
        barajar();
        mostrarTodaLaBaraja();

        String resp = "";
        do {
            DarCarta();
            Mostrarmonton();
            MostrarBaraja();

            System.out.println("Desea retirar mas cartas? S/..");
            resp = l.next();
        } while (resp.equalsIgnoreCase("s") && PosA < baraja.size());

    }

    private void mostrarTodaLaBaraja() {
        System.out.println("\n\nLas cartas que contiene la baraja completa :\n");
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }

    private void barajar() {
        Collections.shuffle(baraja);
    }

    private void siguienteCarta() {
        System.out.println("Se retira de la baraja la carta:" + baraja.get(PosA));
        PosA++;
        System.out.println("Hay un total de cartas Disponibles =" + cartaDisponible() + "\n");
        if (PosA == baraja.size()) {
            System.out.println("No hay mas cartas en la baraja");
        }

    }

    private Integer cartaDisponible() {
        Integer cd = baraja.size() - PosA;
        //System.out.println("Hay un total de cartas Disponibles ="+cd);
        return cd;
    }

    public void Mostrarmonton() {
        if (PosA == 0) {
            System.out.println("No se retiraron cartas de la baraja");
        } else {
            System.out.println("Las cartas que salieron son:");
            for (int i = 0; i < PosA; i++) {
                System.out.println(baraja.get(i));
            }
        }
    }

    public void MostrarBaraja() {
        if (PosA != baraja.size()) {
            System.out.println("\n\nLas cartas que quedan en la baraja son:");
            for (int i = PosA; i < baraja.size(); i++) {
                System.out.println(baraja.get(i));
            }
        } 

    }

    public void DarCarta() {
        int retirar;
        System.out.println("Ingrese cantidad a cartas a retirar [1,40]");
        retirar = l.nextInt();
        while (retirar < 0 || retirar > 40) {
            System.out.println("Ingrese cantidad a cartas a retirar [1,40]");
            retirar = l.nextInt();
        }
        if (retirar > cartaDisponible()) {
            System.out.println("No se puede retirar las cartas");
        } else {
            for (int i = 0; i < retirar; i++) {
                siguienteCarta();
            }
        }

    }
}
