
package _1_JavaSintaxis;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) 
    {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String nombre=leer.nextLine();
        System.out.println("Nombre en min: "+nombre.toLowerCase()+ " - nombre en may: " + nombre.toUpperCase());
    }
    
}
