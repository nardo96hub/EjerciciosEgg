/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.AnteriorGuia.Ej3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Test {

    Scanner l = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<CantanteFamoso> crearcantantes() {

        ArrayList<CantanteFamoso> c = new ArrayList();
        CantanteFamoso aux = new CantanteFamoso();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese nombre del " + i + "º cantante");
            aux.setNombre(l.next());
            System.out.println("Ingrese nombre del disco mas vendido del cantante " + i);
            aux.setDiscoCMV(l.next());
            c.add(aux);

        }
        return c;
    }

    private void mostrarFamoso(ArrayList<CantanteFamoso> c) {
        for (CantanteFamoso a : c) {
            System.out.println("Nombre:" + a.getNombre() + " DiscoMV:" + a.getDiscoCMV());
        }
    }

    private void agregar(ArrayList<CantanteFamoso> c) {
        //CantanteFamoso aux=new CantanteFamoso();
        String nombre, NDMV;
        System.out.println("Ingrese nombre del  cantante");
        nombre = (l.next());
        System.out.println("Ingrese nombre del disco mas vendido del cantante ");
        NDMV = (l.next());
        c.add(new CantanteFamoso(nombre, NDMV));

    }

    private void eliminar(ArrayList<CantanteFamoso> a) {
        System.out.println("Ingrese nombre de cantante a eliminar");
        String eli=l.next();
        
        if(buscar(a, eli)){
            Iterator i=a.iterator();
            while(i.hasNext())
            {
                CantanteFamoso aux=(CantanteFamoso) i.next();
                if(aux.getNombre().equalsIgnoreCase(eli)){
                    i.remove();
                }
            }
        }else System.out.println("No se encontro nombre de cantante a eliminar");
    }

    private void editar(ArrayList<CantanteFamoso> a) {
        String cam, nombre, ndmv;
        System.out.println("Ingrese nombre de cantante a cambiar");
        cam = l.next();
        System.out.println("Ingrese nombre del  cantante nuevo");
        nombre = (l.next());
        System.out.println("Ingrese nombre del disco mas vendido del cantante nuevo ");
        ndmv = (l.next());
        if (buscar(a, cam)) {
            
            
            for(CantanteFamoso c:a)
            {
                if(cam.equalsIgnoreCase(nombre))
                {
                    c.setNombre(nombre);
                    c.setDiscoCMV(ndmv);
                    break;
                }
            }
        }
        else{
            a.add(new CantanteFamoso(nombre,ndmv));
        }
    }

    private boolean buscar(ArrayList<CantanteFamoso> a, String s) {
        boolean resultado = false;
        for (CantanteFamoso c : a) {
            if (c.getNombre().equals(s)) {
                resultado = true;
                break;
            }
        }
        return resultado;

    }

    public void cambio(ArrayList<CantanteFamoso> a) {
        System.out.println("La lista es la siguiente:");
        mostrarFamoso(a);
        agregar(a);
        System.out.println("La lista actualizada es la siguiente es la siguiente:");
        mostrarFamoso(a);
        String r;
        System.out.println("Desea realizar algun cambio? (s/n");
        r = l.next();
        while (!r.equalsIgnoreCase("s") && !r.equalsIgnoreCase("n")) {
            System.out.println("Ingrese (s/n");
            r = l.next();
        }
        int op;
        while (r.equalsIgnoreCase("s")) {

            System.out.println("----------MENU----------\n1.Agregar elementos\n2.Editar elementos\n3.Eliminar elemento\n4.Salir");
            System.out.println("Ingrese una opcion entre [1,4]");
            op = l.nextInt();
            while (op < 1 || op > 4) {
                System.out.println("Ingrese una opcion entre [1,4]");
                op = l.nextInt();
            }
            switch (op) {
                case 1: {
                    agregar(a);
                }
                break;
                case 2: {
                    editar(a);
                }
                break;
                case 3: {
                    eliminar(a);
                }
                break;
                default: {
                    r = "n";
                }
                break;

            }
            System.out.println("La lista actualizada es la siguiente:");
            mostrarFamoso(a);
            if (op < 4) {
                System.out.println("Desea realizar algun cambio? (s/n");
                r = l.next();
                while (!r.equalsIgnoreCase("s") && !r.equalsIgnoreCase("n")) {
                    System.out.println("Ingrese (s/n");
                    r = l.next();
                }

            }
        }
    }
}
