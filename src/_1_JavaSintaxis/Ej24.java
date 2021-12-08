
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej24 {

 
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N=leer.nextInt();
        int[]v=new int[N];
        int[]digito=new int[5];
        for(int i=0;i<digito.length;i++)digito[i]=0;
        
        int d;
        for(int i=0;i<v.length;i++)
        {
            System.out.println("Ingrese el valor "+(i+1)+"de "+v.length+":");
            v[i]=leer.nextInt();
            d=Digito(v[i])-1;
            digito[d]++;
        }
        System.out.println("Informe:");
        for(int i=0;i<digito.length;i++)
            System.out.println("Cantidad de digitos:"+(i+1)+" se repite:"+digito[i]);
    }
    static int Digito(int a)
    {
        int d=1;
        while(a>9)
        {
            a/=10;
            d++;
        }
        return d;
    }
}
