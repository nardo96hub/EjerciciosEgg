
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej9 {

  
    public static void main(String[] args) {
       /*
        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
        */
       Scanner leer=new Scanner(System.in);
       String f;
       boolean i;
        System.out.println("Ingrese una frase");
        f=leer.nextLine();
       
        if(f.equals("eureka"))
        {
            System.out.println("Correcto");
        }
        else
            System.out.println("Incorrecto");
        
        
       
    }
    
}
