/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.servicios;

import _7_AccesoBDD.JPA.Ej1.entidades.*;

import java.util.Scanner;

public class ServicioGeneral {

    private Scanner l = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        System.out.println("Ingrese datos ");
        String r = "";
        int o;
        do {

            System.out.println("Ingrese que desea cargar ");
            System.out.println("1_Crear Editorial.\n2_Crear Autor.\n3_Crear Libros.\n"
                    + "4_Crear Cliente.\n5_Crear Prestamo.\n6_Salir.");
            System.out.println("Ingrese una opcion entre [1,6]");
            o = l.nextInt();
            while (o < 1 || o > 6) {
                System.out.println("Ingrese una opcion entre [1,6]");
                o = l.nextInt();
            }
            switch (o) {
                case 1:
                    Editorial e = EditorialServicio.CrearEditorial();
                    break;
                case 2:
                    Autor a = AutorServicio.CrearAutor();
                    break;
                case 3:
                    LibroServicio lis = new LibroServicio();
                    lis.crearLibro();
                    break;
                case 4:
                    Cliente c = ClienteServicio.CrearCliente();
                case 5:
                    Prestamo p = PrestamoServicio.CrearPrestamo();
            }
            if (o < 6) {
                System.out.println("Desea Crear mas informacion?(n para salir)");
                r = l.next();
            } else {
                r = "n";
            }

        } while (r.equalsIgnoreCase("s"));

        consultasSQL();

    }

    public void consultasSQL() {
        int op;
        String r = "";
        VerificarBDD();
        do {
            System.out.println("Menu de consultasSQL");
            
            System.out.println("1_Búsqueda de un Autor por nombre.\n"
                    + "2_Búsqueda de un libro por ISBN.\n"
                    + "3_Búsqueda de un libro por Título.\n"
                    + "4_Búsqueda de un libro/s por nombre de Autor.\n"
                    + "5_Búsqueda de un libro/s por nombre de Editorial.\n6_Dar de baja Libro.\n7_Salir.\n");

            System.out.println("Ingrese una opcion entre [1,7]");
            op = l.nextInt();
            while (op < 1 || op > 7) {
                System.out.println("Ingrese una opcion entre [1,7]");
                op = l.nextInt();
            }
            if (op > 1) {
                LibroServicio.mostrarLibro();

            } else {
                AutorServicio.mostrarAutor();
            }
            switch (op) {
                case 1:
                    AutorServicio.buscarAutorNombre();

                    break;
                case 2:
                    LibroServicio.buscarLibroid();
                    break;
                case 3:
                    LibroServicio.buscarLibroTitulo();
                    break;
                case 4:
                    LibroServicio.buscarLibroAutor();
                    break;
                case 5:
                    LibroServicio.buscarLibroEditorial();
                    break;
                case 6:
                    LibroServicio.darBajaLibro();
            }

            if (op < 7) {
                System.out.println("Desea continuar realizando consultas?(n Salir)");
                r = l.next();
                while (!r.equalsIgnoreCase("s") && !r.equalsIgnoreCase("n")) {
                    System.out.println("Desea continuar realizando consultas?(n Salir)");
                    r = l.next();
                }
            } else {
                r = "n";
            }
        } while (r.equalsIgnoreCase("s"));

    }

    private void VerificarBDD() {//Verifico que exista informacion en alguna de las tablas 
        boolean a, b, c, d, e;

        LibroServicio lis = new LibroServicio();
        a = LibroServicio.VerifBddLibro();
        b = EditorialServicio.VerifBddEstancia();
        c = AutorServicio.VerifBddAutor();
        d = ClienteServicio.VerifBddCliente();
        e = PrestamoServicio.VerifBddPrestamo();
        while (a || b || c || d || e) {
            if (a) {

                lis.crearLibro();
            }
            if (b) {
                EditorialServicio.CrearEditorial();

            }
            if (c) {
                AutorServicio.CrearAutor();
            }
            if(d){
                ClienteServicio.CrearCliente();
            }
            if(e){
                PrestamoServicio.CrearPrestamo();
            }

            a = LibroServicio.VerifBddLibro();
            b = EditorialServicio.VerifBddEstancia();
            c = AutorServicio.VerifBddAutor();
            d = ClienteServicio.VerifBddCliente();
            e = PrestamoServicio.VerifBddPrestamo();
        }
        System.out.println("Hay informacion en las tablas Autor/Editorial/Libro");
    }
}
