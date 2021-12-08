/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.EjEx2;

import java.util.Scanner;

public class Punto {

    Integer x1, x2, y1, y2;

    public Integer getX1() {
        return x1;
    }

    public void setX1(Integer x1) {
        this.x1 = x1;
    }

    public Integer getX2() {
        return x2;
    }

    public void setX2(Integer x2) {
        this.x2 = x2;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "P1(" + x1 + "," + y1 + ")  P2(" + x2 + "," + y2 + ")";
    }

    public double distancia() {
        System.out.println();
        
        System.out.println(Math.hypot(getX1() - getX2(), getY1() - getY2()));
        return Math.sqrt(Math.pow(getX2() - getX1(), 2) +Math.pow(getY2() - getY1(), 2));
    }

    public void crearpunto() {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese el Primer punto");
        System.out.print("x1=");
        setX1(l.nextInt());
        System.out.print("\ny1=");
        setY1(l.nextInt());
        System.out.println("\nIngrese el Segundo punto");
        System.out.print("x2=");
        setX2(l.nextInt());
        System.out.print("\ny2=");
        setY2(l.nextInt());
        System.out.println("");
    }
}
