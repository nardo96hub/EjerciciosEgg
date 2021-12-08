
package _1_JavaSintaxis;

import java.util.Scanner;


public class EjEx10 {

   
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int n=(int)(Math.random()*10);
        int num;
        System.out.println("Ingrese un numero entre [1,10]");
        num=l.nextInt();
        while(num!=n)
        {
            System.out.print("Incorrecto. Ingrese un numero nuevamente");
            if(num>n)
                System.out.print(" menor a "+num);
            else
                System.out.println(" mayor a "+num);
            System.out.println("");
            num=l.nextInt();
        }
        System.out.println("Efectivamente encontro el numero "+n);
        
    }
    
}
