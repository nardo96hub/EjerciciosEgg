
package _1_JavaSintaxis;

import java.util.Scanner;

public class EjEx16 {

   
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int num;
        System.out.println("Ingrese un numero");
        num=l.nextInt();
        System.out.print("El numero "+num+" ");
        if(primo(num))
        {
            System.out.print("es primo");
        }else
        {
            System.out.print("no es primo");
        }
        System.out.println("");
    }
    public static boolean primo(int a)
    {
        int c=0;
        boolean p=false;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c<3)
            p=true;
        return p;
    }
    
}
