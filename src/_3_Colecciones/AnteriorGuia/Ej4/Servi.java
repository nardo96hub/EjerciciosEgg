/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.AnteriorGuia.Ej4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servi {

    Scanner l = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Alumno> curso=new HashSet();

    public HashSet<Alumno> getCurso() {
        return curso;
    }

    private Alumno crearAlumno() {
        String nom, ape, leg, s, cond;
        Double nota;
        System.out.println("Ingrese nombre del alumno");
        nom = l.next();
        System.out.println("Ingrese apellido del alumno");
        ape = l.next();
        System.out.println("Ingrese legajo del alumno:" + nom + " " + ape);
        leg = l.next();
        System.out.println("Ingrese sexo del alumno(M/F/X");
        s = l.next();
        while (!s.equalsIgnoreCase("m") && !s.equalsIgnoreCase("f") && !s.equalsIgnoreCase("x")) {
            System.out.println("Ingrese sexo del alumno(M/F/X");
            s = l.next();
        }
        System.out.println("Ingrese condicion del alumno(libre,regular,promovido)");
        cond = l.next();
        while (!cond.equalsIgnoreCase("libre") && !cond.equalsIgnoreCase("regular") && !cond.equalsIgnoreCase("promovido")) {
            System.out.println("Ingrese condicion del alumno(libre,regular,promovido)");
            cond = l.next();
        }
        System.out.println("Ingrese nota del alumno[1,10]");
        nota = l.nextDouble();
        while (nota < 1 || nota > 10) {
            System.out.println("Ingrese nota del alumno[1,10]");
            nota = l.nextDouble();
        }
        System.out.println(nom+ ape+ leg+ s+ cond+ nota);
      Alumno a=new Alumno(nom, ape, leg, s, cond, nota);
        System.out.println(a);
        return a;
    }

    public void crearCurso() {
        String r;
        int i = 0;
        
        do {
            i++;
            System.out.println("Se cargara la informacion del Alumno " + i);
            curso.add(crearAlumno());
            //curso.add(crearAlumno());
            System.out.println("Desea cargar mas alumnos?");
            r = l.next();
        } while (r.equalsIgnoreCase("s"));
        mostrar();
        mostrarPromovido();
        ordenarHash();

    }

    private void mostrar() {
        int a = 0;
        System.out.println("Lista de alumnos:");
        for (Alumno alumno : getCurso()) {
            a++;
            System.out.println("Alumno " + a + " " + alumno);
        }
    }

    private void mostrarPromovido() {
        int a = 0;
        System.out.println("Lista de alumnos aprobados");
        for (Alumno alumno : getCurso()) {
            if (alumno.getCondicion().equalsIgnoreCase("promovido")) {
                a++;
                System.out.println("Alumno " + a + " " + alumno);
            }

        }
        System.out.println("La cantidad de alumnos promovidos son:" + a + " de " + getCurso().size() + " alumnos");
    }

    private void ordenarHash() {
        ArrayList<Alumno> alumno = new ArrayList();
        for (Alumno alumno1 : getCurso()) {
            alumno.add(alumno1);
        }
        int op;
        System.out.println("Menu\n1_Ordenar NotaFA\n2_Ordenar NotaFD\n3_Ordenar ApellidoA");
        System.out.println("Ingrese opcion entre [1,3]");
        op = l.nextInt();
        switch (op) {
            case 1: {
                alumno.sort(Alumno.NotaM);
            }
            break;
            case 2: {
                alumno.sort(Alumno.NotaMe);
            }
            break;
            case 3: {
                alumno.sort(Alumno.Apellido);
            }
            break;
        }
        mostrarArray(alumno);
    }

    private void mostrarArray(ArrayList<Alumno> a) {
        for (Alumno alumno : a) {
            System.out.println(alumno);
        }
    }
}
