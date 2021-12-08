/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_Relaciones.EJExtra.Ej1;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Persona {
    private String nombre,apellido;
    private Perro perro;
    Long dni;
    Integer edad;
     public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro=null;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", Adopto perro=" + perro + '}';
    }
    
   public void crearPersona() {
        String nombre, apellido;
        Integer edad;
        Long dni;
      
        Scanner l=new Scanner(System.in);
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

        //return new Persona(nombre, apellido, edad, dni);
        setApellido(apellido);
        setDni(dni);
        setEdad(edad);
        setNombre(nombre);
    }
}
