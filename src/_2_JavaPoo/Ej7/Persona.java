package _2_JavaPoo.Ej7;

import java.util.Scanner;

public class Persona {

    String nombre;
    Integer edad;
    String sexo;
    Double peso;
    Double altura;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Persona crearPersona() {
        String n;
        Integer e;
        String s;
        Double p;
        Double a;

        Scanner l = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de la persona");
        n = l.next();
        System.out.println("Ingrese edad de la persona");
        e = (Integer) l.nextInt();
        while (e < 0) {
            System.out.println("Ingrese edad de la persona");
            e = (Integer) l.nextInt();
        }
        System.out.println("Ingrese sexo de la persona M,F,O");
        s = l.next();
        while (!s.equalsIgnoreCase("M") && !s.equalsIgnoreCase("f") && !s.equalsIgnoreCase("o")) {
            System.out.println("Ingrese sexo de la persona M,F,O");
            s = l.next();
        }
        System.out.println("Ingrese peso de la persona");
        p = (Double) l.nextDouble();
        while (p < 0 || p > 200) {
            System.out.println("Ingrese peso de la persona");
            p = (Double) l.nextDouble();
        }
        System.out.println("Ingrese altura de la persona");
        a = (Double) l.nextDouble();
        while (a < 0 || a > 3) {
            System.out.println("Ingrese altura de la persona");
            a = (Double) l.nextDouble();
        }

        Persona per = new Persona(n, e, s, p, a);
        return per;

    }

    public int calcularMC() {
        double mc = getPeso() / (getAltura() * getAltura());
        if (mc < 20) {
            return -1;
        } else if (mc >= 20 && mc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean esMayordeEdad() {

        if (getEdad() < 18) {
            return false;
        } else {
            return true;
        }
    }

}
