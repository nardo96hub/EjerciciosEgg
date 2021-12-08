
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej26 {

   
    public static void main(String[] args) {
       
       int[][] a = new int[3][3];
       int[][] b = new int[3][3];
       
        System.out.println("Carga de la matriz");
        carga(a);
        transpuesta(a,b);
        mostrar(a,"A");
        mostrar(b,"B");
        if(antisimetrica(a,b)==9)
        {
            System.out.println("La matriz es antisimetrica");
        }
        else
            System.out.println("La matriz no es antisimetrica");
    }
    static void carga(int [][] a)
    { Scanner leer=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Ingrese el elemento de la matriz de pos: ("+i+","+j+")");
                a[i][j]=leer.nextInt();
            }
        }
    }
    static void mostrar(int [][] a,String A)
    {
        System.out.println("Dada la matriz "+A+":");
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
    static void transpuesta(int[][]a,int [][]b)
    {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                b[i][j]=a[j][i];
    }
    static int antisimetrica(int[][]a,int [][]b)
    {
        
        int cont=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 if(a[i][j]== (-1)*b[i][j])
                    cont++;
            }
        }
            
               
        return cont;
    }
    
}
