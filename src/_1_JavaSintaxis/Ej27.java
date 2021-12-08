
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej27 {

   
    public static void main(String[] args) {
        int [][]a=new int[3][3];
        Scanner leer=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++) 
           {
               System.out.println("Ingrese un numero entre [1,9]");
               a[i][j]=leer.nextInt();
               while(a[i][j]<1||a[i][j]>9)
               {System.out.println("Ingrese un numero entre [1,9]");
                a[i][j]=leer.nextInt();
                   
               }
           }
        }
        mostrar(a);
        sumacubo(a);
    }
    static void mostrar(int[][] a)
    {
        System.out.println("La matriz es:");
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++) 
           {
               System.out.print(a[i][j]+" ");
           }
            System.out.println("");
        }
    }
    
     static void sumacubo(int[][] a)
    {
        int sumaA,sumaF,sumaC,sumaD1,sumaD2,contado;
        sumaA=contado=sumaD1=sumaD2=0;
        for(int i=0;i<3;i++)sumaA+=a[0][i];
        
        for(int i=0;i<3;i++)
        {
            sumaF=sumaC=0;
           for(int j=0;j<3;j++) 
           {sumaF+=a[i][j];sumaC+=a[i][j];
           if(i==j)sumaD1+=a[i][j];
           if(i+j==2)sumaD2+=a[i][j];
               
           }
           if(sumaF==sumaA)contado++;
           if(sumaC==sumaA)contado++;
           
        }
        if(sumaD1==sumaA&&sumaD2==sumaA)contado+=2;
        
        if(contado==8) System.out.println("La matriz es un cubo magico y su suma es: "+sumaA);
        else
            System.out.println("La matriz no es un cubo magico");
        
        
        
    }
    
}
