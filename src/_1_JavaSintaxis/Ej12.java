
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej12 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i=leer.nextInt();
       
        switch(i)
        {
            case 1:
            {
                System.out.println("La bomba es una bomba de agua");
            }break;
            case 2:
            {
                System.out.println("La bomba es una bomba de gasolina");
            }break;
             case 3:
            {
                System.out.println("La bomba es una bomba de hormigon");
            }break;
             case 4:
            {
                System.out.println("La bomba es una bomba de pasta alimenticia");
            }break;
             default:
             {
                 System.out.println("No existe valor valido para este tipo de bomba");
             }
        }
    }
    
}
