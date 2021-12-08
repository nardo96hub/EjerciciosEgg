/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EjFundamentales.Ej1;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Servi {

    Scanner l = new Scanner(System.in);

    private Persona crearPersona() {
        String nombre, apellido;
        Integer edad;
        Long dni;
        //Perro perro=null;

        System.out.println("Ingrese nombre de la persona");
        nombre = l.next();
        System.out.println("Ingrese apellido de la persona");
        apellido = l.next();
        System.out.println("Ingrese edad[0,150]");
        edad = l.nextInt();
        while (edad < 0 || edad > 150) {
            System.out.println("Ingrese edad[0,150]");
            edad = l.nextInt();
        }
        System.out.println("Ingrese dni [0,99999999]");
        dni = l.nextLong();
        while (dni < 1 || dni > 99999999) {
            System.out.println("Ingrese dni [1,99999999]");
            dni = l.nextLong();
        }

        return new Persona(nombre, apellido, edad, dni, null);
    }

    private Perro crearPerro() {
        String nombre, raza;
        Double edad, tamano;
        System.out.println("Ingrese nombre del perro");
        nombre=l.next();
        System.out.println("Ingrese raza del perro");
        raza=l.next();
        System.out.println("Ingrese edad del perro");
        edad=l.nextDouble();
        while(edad<0)
        {
                  System.out.println("Ingrese edad del perro");
        edad=l.nextDouble();  
        }
        System.out.println("Ingrese tamano del perro medida en cm<=100");
        tamano=l.nextDouble();
        while(tamano<5||tamano>100)
        {
            System.out.println("Ingrese tamano del perro medida en cm<=100");
        tamano=l.nextDouble();  
        }
        return new Perro(nombre, raza, edad, tamano);
    }

    public void PP() {
        System.out.println("Ingrese los datos de la 1º persona");
        Persona p1 = crearPersona();
        System.out.println("Ingrese los datos de la 2º persona");
        Persona p2 = crearPersona();
        System.out.println("Ingrese los datos del 1º perro");
        Perro per1 = crearPerro();
        System.out.println("Ingrese los datos del 2º perro");
        Perro per2 = crearPerro();
        Adopcion(p1, p2, per1, per2);
        mostrar(p1, p2);

    }

    private void Adopcion(Persona p1, Persona p2, Perro perro1, Perro perro2) {
        
            System.out.println("Dado los perros: ");
            System.out.println(perro1);
            System.out.println(perro2);
            String nombreA;
            System.out.println("La persona de nombre "+p1.getApellido()+" "+p1.getNombre()+" ingrese el nombre del perro que desea adoptar ["+perro1.getNombre()+","+perro2.getNombre()+"]" );                                
            nombreA=l.next();
            while(!nombreA.equalsIgnoreCase(perro1.getNombre())&& !nombreA.equalsIgnoreCase(perro2.getNombre()))
            {
                System.out.println("Ingrese ["+perro1.getNombre()+","+perro2.getNombre()+"]");
                nombreA=l.next();
            }
          if(nombreA.equalsIgnoreCase(perro1.getNombre()))
          {
              p1.setPerro(perro1);
              p2.setPerro(perro2);
          }
          else
          {
                   p1.setPerro(perro2);
              p2.setPerro(perro1);
          }
            
            
            
            
    }

    private void mostrar(Persona p1, Persona p2) {
        System.out.println(p1);
        System.out.println(p2);
    }
}
