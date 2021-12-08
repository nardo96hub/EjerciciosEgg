
package _1_JavaSintaxis;

import java.util.Scanner;

public class Ej13 {

   
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        int nota=leer.nextInt();
        while(nota<0 ||nota>10)
        {
            System.out.println("Ingrese una nota entre [0,10]");
            nota=leer.nextInt();
        }
    }
    
}
