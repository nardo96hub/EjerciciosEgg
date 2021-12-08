
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej23 {

  
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int N=leer.nextInt();
        int[] v=new int[N];
        for(int j=0;j<N;j++)
        {
            v[j]=((int)(Math.random()*100))-50;
        }
        System.out.println("El vector es el siguiente:");
        for(int i=0;i<N;i++)
            System.out.print(v[i]+" ");
        System.out.println("Ingrese un numero a buscar entre[-50,50]");
        int buscar=leer.nextInt();
        int cont,pos;cont=pos=0;
        for(int j=0;j<N;j++)
        {
           
            if(v[j]==buscar)
            {
                if(cont==0)
                    pos=j;
               
                cont++;
            }
        }
        if(cont==0)
            System.out.println("El elemento "+buscar+" no se encuentra en el vector");
        else
            System.out.println("El elemento "+buscar+" se encuentra en la posicion "+pos+" y se repitio "+cont+" veces");
       
    }
    
}
