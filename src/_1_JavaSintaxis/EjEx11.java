
package _1_JavaSintaxis;

import java.util.Scanner;


public class EjEx11 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero ");
        Scanner l=new Scanner(System.in);
        int num=l.nextInt();
        System.out.println("La cantidad de digitos de "+num+" es de "+digito(num));
        
    }
    public static int digito(int n)
    {
        int d=1;
        while(n>9)
        {
            d++;
            n=(int)(n/10);
        }
        return d;
    }
    
}
