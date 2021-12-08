/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.EjEx4;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Nif {

    long dni;
    char letra;

    public long getDni() {
        return dni;
    }

    private void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    private void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {

        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese DNI");
        long d = l.nextLong();
        while (d < Math.pow(10, 7)) {
            System.out.println("Ingrese DNI>=" + Math.pow(10, 7));
            d = l.nextLong();
        }
        setDni(d);

        setLetra(letranif());

    }

    private char letranif() {
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letra[(int) (getDni() % 23)];
    }

    public void mostrar() {
        System.out.println(getDni() + "-" + getLetra());
    }

}
