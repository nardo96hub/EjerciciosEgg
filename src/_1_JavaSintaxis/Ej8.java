

package _1_JavaSintaxis;

import java.util.Scanner;

public class Ej8 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a=leer.nextInt();
        if((a % 2)==0)
        {
            System.out.println(a+" es un numero par");
        }
        else
            System.out.println(a+" es un numero impar");
            
        
    }
    
}
