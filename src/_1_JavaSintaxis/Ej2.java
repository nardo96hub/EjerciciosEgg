
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
        int a,b,suma;
        System.out.println("Ingrese el primer numero");
        a=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        b=leer.nextInt();
        suma=a+b;
        System.out.println("La suma de "+a +" y "+b +"es de:"+suma);
    }
}
