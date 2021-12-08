package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej21 {

    static void conversion(double moneda,String a)
   {
       if(a.equalsIgnoreCase("libra"))
       {
           System.out.println("El cambio de euro a libra es: "+moneda+" euro="+(moneda*0.86)+" libras"); 
       }
       else if(a.equalsIgnoreCase("dolar"))
           System.out.println("El cambio de euro a dolar es: "+moneda+" euro="+(moneda*1.28611)+" dolares");
       else
           System.out.println("El cambio de euro a yenes es: "+moneda+" euro="+(moneda*129.852)+" yenes");
   }
    public static void main(String[] args) {
        double cantidad;
        Scanner leer=new Scanner (System.in);
        cantidad = leer.nextDouble();
     
        conversion(cantidad,"dolar");
        conversion(cantidad,"libra");
        conversion(cantidad,"yenes");
    }
  
}
