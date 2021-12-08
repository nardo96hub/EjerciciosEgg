
package _3_Colecciones.Fundamentales.Ej6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S {

    HashMap<String, Double> tienda; 
    Scanner l = new Scanner(System.in).useDelimiter("\n");

    public S() {
        this.tienda = new HashMap();
    }

    public HashMap<String, Double> getTienda() {
        return tienda;
    }

    private void agregar() {
        String nombreP;
        Double precio;
        System.out.println("Ingrese nombre del producto a agregar");
        nombreP = l.next();
        System.out.println("Ingrese precio del producto a agregar");
        precio = l.nextDouble();
        getTienda().put(nombreP, precio);

    }

    private void editar() {
        String nombreP;
        Double precio;
        System.out.println("Ingrese nombre del producto a editar");
        nombreP = l.next();
        System.out.println("Ingrese precio del producto a editar");
        precio = l.nextDouble();

        for (Map.Entry<String, Double> e : getTienda().entrySet()) {
            if (e.getKey().equalsIgnoreCase(nombreP)) {
                e.setValue(precio);
            }
        }
    }

    private void eliminar() {
        String nombreP;
        System.out.println("Ingrese nombre del producto a eliminar");
        nombreP = l.next();
        boolean p=false;
        
        for (Map.Entry<String, Double> e : getTienda().entrySet()) {
            if (e.getKey().equalsIgnoreCase(nombreP)) {
                p=true;
            }
        }
        if(p)
        {System.out.println("El producto "+nombreP+" pertenece a la tienda por lo que se eliminara");
          getTienda().remove(nombreP);  
        }
        else
            System.out.println("El producto "+nombreP+" no pertenece a la tienda por lo que no se eliminara");
        

    }

    private void mostrar() {
        System.out.println("El Map contiene:");
        System.out.print("{");
        for (Map.Entry<String, Double> e : getTienda().entrySet()) {
            System.out.print("<" + e.getKey() + "," + e.getValue() + ">  ");
        }
        System.out.print("}\n");
    }

    public void Menu() {
        //Scanner l=new Scanner(System.in).useDelimiter("\n");
        String r = "";
        int op;

        do {

            System.out.println("------------MENU-------------");
            System.out.println("1_Agregar elemento\n2_Editar Elemento\n3_Borrar Elemento\n4.Mostrar informacion\n5.Salir");
            System.out.println("Ingrese una opcion entre [1,5]");
            op = l.nextInt();
            while (op < 1 || op > 5) {
                System.out.println("Ingrese una opcion entre [1,5]");
                op = l.nextInt();
            }
            switch (op) {
                case 1: {
                    agregar();
                }
                break;
                case 2: {
                    if(getTienda().size()>0)
                    {
                       editar(); 
                    }
                    else
                    {
                        System.out.println("No se puede editar ya que no contiene nada el map");
                    }
                    
                }
                break;
                case 3: {
                    if(getTienda().size()>0)
                    {
                        eliminar();
                    }else
                    {
                        System.out.println("No se puede eliminar ya que no contiene nada el map");
                    }
                    
                }
                break;
                case 4: {
                    mostrar();

                }
                break;
                default: {
                    r = "n";
                }
                break;
            }

            if (op < 5) {
                System.out.println("Desea seguir agregando informacion (s/n)");
                r = l.next();
                while (!r.equalsIgnoreCase("n") && !r.equalsIgnoreCase("s")) {
                    System.out.println("Desea seguir agregando informacion (s/n)");
                    r = l.next();
                }
            }
     

        } while (r.equalsIgnoreCase("s"));

    }

}
