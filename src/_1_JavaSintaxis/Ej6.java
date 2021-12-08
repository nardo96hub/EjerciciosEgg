
package _1_JavaSintaxis;


import java.util.Scanner;


public class Ej6 {

   
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese un numero");
      int num=leer.nextInt();
      System.out.println("Dado el numero:"+num+" Su doble es:"+(num*2)+". Su triple:"+(num*3)+ " y su raiz cuadrada:"+Math.sqrt(num));
    }
    
}
