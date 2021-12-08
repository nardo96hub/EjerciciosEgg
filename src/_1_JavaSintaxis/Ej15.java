
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej15 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String resp="S";
        int op,a,b;
        a=b=0;
        do
        {
            System.out.println("MENU\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
            System.out.println("Ingrese una opcion entre [1,5]");
            op=leer.nextInt();
            while(op<1||op>5)
            {
                System.out.println("Ingrese una opcion entre [1,5]");
                op=leer.nextInt();
            }
            if(op<5)
            {
               System.out.println("Ingrese 2 numeros");
                a=leer.nextInt();
                b=leer.nextInt();
                resp="n";
            }
            
            switch(op)
            {
                case 1:
                {
                    System.out.println(a+b);
                }break;
                case 2:
                {
                   System.out.println(a-b); 
                }break;
                case 3:
                {
                    System.out.println(a*b);
                }break;
                case 4:
                {
                    System.out.println(a/b);
                }break;
                default:
                {
                    System.out.println("Desea salir? (S/N");
                    resp=leer.next();
                }
            }
           
        }while(resp.equals("n") || resp.equals("N"));
         
    }
    
}
