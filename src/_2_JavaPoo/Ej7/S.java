/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej7;

/**
 *
 * @author Jorge
 */
public class S {

    void mostrar(int[] a,int b) {
        System.out.println("La cantidad de un total de " + b + " personas que estan por debajo de su peso es " + (a[0] * 100 / b) + "%");
        System.out.println("La cantidad de un total de " + b + " personas que estan en su  peso ideal es " + (a[1] * 100 / b) + "%");
        System.out.println("La cantidad de un total de " + b + " personas que estan por encima de su peso es " + (a[2] * 100 / b) + "%");
        System.out.println("El porcentaje de personas mayores de edad es:" + (a[3] * 100 / (b)) + "%");
        System.out.println("El porcentaje de personas menores de edad es:" + (a[4] * 100 / (b)) + "%");
    }
    void contador(Persona p,int[] a)
    {
           
        switch (p.calcularMC()) {
            case -1:
                a[0]++;
                break;
            case 0:
                a[1]++;
                break;
            case 1:
                a[2]++;
                break;

        }
        if(p.esMayordeEdad()){
            a[3]++;
        }
        else
            a[4]++;
    }
}
