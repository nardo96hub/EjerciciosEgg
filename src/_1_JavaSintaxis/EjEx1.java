
package _1_JavaSintaxis;

import java.util.Scanner;


public class EjEx1 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int min;
        System.out.println("Ingrese una cantidad de minutos");
        min=leer.nextInt();
        conversiondia(min);
        System.out.println("Fin del programa.Adios");
        
    }
    public static void conversiondia(int min)
    {
        int d,m,h;
        
        h=(int)min % (60*24)/60;
        m=((int)min % (60*24)) %60;
        d=(int)(min/(60*24));
        System.out.println(min+" minutos equivale a "+d+" dias  "+h+" horas y "+m+" minuto ");
    }
}
