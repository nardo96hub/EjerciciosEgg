package _2_JavaPoo.Ej3;

import java.util.Scanner;

public class Operaciones {

    Integer num1, num2;

    public Operaciones(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operaciones() {
    }
    
    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese el num 1");
        Integer n1, n2;
        n1 =(Integer) l.nextInt();
        System.out.println("Ingrese num2");
        n2 =(Integer) l.nextInt();
        Operaciones o = new Operaciones(n1, n2);

    }

    public Integer suma() {
        return (num1 + num2);
    }

    public Integer resta() {
        return num1 - num2;
    }

    public Integer multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return num1 * num2;
        }
    }
    public Integer division()
    {
       if (num1 == 0 || num2 == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return num1 / num2;
        } 
    }
}
