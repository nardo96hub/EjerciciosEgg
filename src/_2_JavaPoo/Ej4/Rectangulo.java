package _2_JavaPoo.Ej4;

import java.util.Scanner;

public class Rectangulo {

    Double base, altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void crearRec() {
        Scanner l = new Scanner(System.in);
        Double b, a;
        System.out.println("Ingrese base de rectangulo");
        b =(Double) l.nextDouble();
        System.out.println("Ingrese altura de rectangulo");
        a =(Double) l.nextDouble();
        Rectangulo r = new Rectangulo(b, a);
    }

    public Double superficie() {
        return base * altura / perimetro();
    }

    public Double perimetro() {
        return (Double)(2 *(base + altura));
    }

    public void dibujarR() {
        System.out.println("El rectangulo es el siguiente:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j == 0 || j == base - 1 || i == 0 || i == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
