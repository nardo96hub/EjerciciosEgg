
package _1_JavaSintaxis;


import java.util.Scanner;


public class Ej11 {

    /*
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
    */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String f=leer.nextLine();
        String a=f.substring(0,1);
        if(a.equals("A"))
        {
            System.out.println("Corrento");
        }
        else
            System.out.println("Incorrecto");
    }
    
}
