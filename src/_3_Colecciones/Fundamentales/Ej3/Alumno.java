/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.Fundamentales.Ej3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Alumno {

    String nombre;
    ArrayList<Integer> nota;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public double notaFinal(ArrayList<Alumno> a, String alumno) {
        double notaF = 0;
        
        for (Alumno al : a) {

            if (al.getNombre().equalsIgnoreCase(alumno)) {
                for (Integer n : al.getNota()) {
                    notaF += n;

                }
                notaF /= al.getNota().size();
                break;
            }

        }

        return notaF;
    }

    public void mostrar(ArrayList<Alumno> a) {
        for (Alumno al : a) {
            System.out.print("Alumno:" + al.getNombre() + " ");
            int j=0;
            for (Integer i : al.getNota()) {j++;
                System.out.print("Nota "+j+": " + i + " ");
            }
            System.out.println("");
        }

    }

    public Alumno crearAlumno() {

        //Alumno a = new Alumno();
        ArrayList<Integer> not=new ArrayList();
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de alumno");
        //a.setNombre(l.next());
        String nom=l.next();
        Integer n;
        for(int i=1;i<=3;i++)
        {
            System.out.println("Ingrese la nota "+i);
            n=l.nextInt();
            while(n<1||n>10)
            {
                 System.out.println("Ingrese la nota "+i);
            n=l.nextInt();
            }
            not.add(n);
        }
        

        return new Alumno(nom,not);
    }
}
