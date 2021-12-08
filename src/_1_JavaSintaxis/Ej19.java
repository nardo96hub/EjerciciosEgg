
package _1_JavaSintaxis;

import java.util.Scanner;

public class Ej19 {

  
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese tamaño");
        int i=leer.nextInt();
        if(i<0) i*=(-1);
        for(int j=0;j<i;j++)
        {
            for(int k=0;k<i;k++)
            {
                if(k==0 || k==i-1|| j==0 || j==i-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}
