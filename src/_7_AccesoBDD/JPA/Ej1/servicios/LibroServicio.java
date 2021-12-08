/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.servicios;

import _7_AccesoBDD.JPA.Ej1.entidades.Libro;
import _7_AccesoBDD.JPA.Ej1.persistencia.LibroDAO;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class LibroServicio {

    private Scanner l = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        try {
            Libro li = new Libro();
            Integer anio, ej, ejP;
            System.out.println("Ingrese datos para crear Libro");
            System.out.println("Ingrese año que se publico el libro");
            anio = l.nextInt();
            System.out.println("Ingrese cantidad de libros");
            ej = l.nextInt();
            System.out.println("Ingrese cantidad de libros prestados");
            ejP = l.nextInt();
            System.out.println("Ingrese nombre de libro");
            String n = l.next();
            li.setAlta(true);
            li.setAnio(anio);
            li.setEjemplares(ej);
            li.setEjemplaresPrestados(ejP);
            li.setEjemplaresRestantes(li.getEjemplares() - li.getEjemplaresPrestados());
            li.setAutor(AutorServicio.CrearAutor());
            li.setEditorial(EditorialServicio.CrearEditorial());
            li.setTitulo(n);
            LibroDAO dao = new LibroDAO();
            dao.crearLibro(li);
            return li;

        } catch (InputMismatchException e) {
            System.out.println("numero mal colocado");
            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }

    }

    public static void buscarLibroid() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese id");
        LibroDAO li = new LibroDAO();
        Libro libro = li.buscarLibroId(leer.nextLong());
        if (libro == null) {
            System.out.println("Id ingresado invalido");

        } else {
            System.out.println("Libro encontrado " + libro);

        }

    }

    public static void buscarLibroTitulo() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese titulo de libro a buscar");
        LibroDAO li = new LibroDAO();
        Libro libro = li.buscarLibroTitulos(leer.next());
        if (libro == null) {
            System.out.println("Titulo de libro ingresado invalido");

        } else {
            System.out.println("Libro encontrado " + libro);

        }

    }

    public static void buscarLibroAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de autor para buscar sus libros creados");
        LibroDAO li = new LibroDAO();
        List<Libro> libro = li.buscarLibrosAutor(leer.next());
        if (libro == null) {
            System.out.println("No hay libros creados por el autor ingresado");
        } else {
            System.out.println("Los libros del autor son:");
            for (Libro L : libro) {
                System.out.println(L);
            }
        }
    }

    public static void buscarLibroEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de editorial para buscar sus libros publicados");
        LibroDAO li = new LibroDAO();
        List<Libro> libro = li.buscarLibrosEditorial(leer.next());
        if (libro == null) {
            System.out.println("No hay libros creados por el editorial ingresado");
        } else {
            System.out.println("Los libros que publico la  editorial son:");
            for (Libro L : libro) {
                System.out.println(L);
            }
        }
    }

    public static boolean VerifBddLibro() {
        LibroDAO li = new LibroDAO();

        if (li.verificarBDD() == null) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarLibro() {

        LibroDAO a = new LibroDAO();
        System.out.println("LA lista de libro en la base de datos es:");
        for (Libro au : a.verificarBDD()) {
            System.out.println(au);

        }
    }

    public static void darBajaLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de libro a dar de baja");
        String n=leer.next();
        LibroDAO ld=new LibroDAO();
       
        Libro libro=ld.buscarLibroTitulos(n);
        if(libro!=null){
           libro.setAlta(false); 
           ld.EliminarLibro(libro);
        }else System.out.println("no se encontro libro");
        
        
        
        
    }
}
