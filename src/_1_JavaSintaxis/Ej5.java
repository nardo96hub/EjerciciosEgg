
package _1_JavaSintaxis;

import java.util.Scanner;

public class Ej5 {

  
    public static void main(String[] args) 
    {
        Scanner leer= new Scanner(System.in);
        double C=leer.nextDouble();
        System.out.println("La temperatura en C="+C +" es equivalente a la temperatura F="+ (32+(9*C/5)));
    }
    
}
