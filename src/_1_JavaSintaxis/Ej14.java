
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej14 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int limite,num,sum;
        sum=0;
        System.out.println("Ingrese un limite");
        limite=leer.nextInt();
        while(sum<limite)
        {
            System.out.println("Ingrese una numero hasta que la suma="+sum+" de todos los numeros sea="+limite);
            num=leer.nextInt();
            sum=sum+num;
        }
    }
    
}
