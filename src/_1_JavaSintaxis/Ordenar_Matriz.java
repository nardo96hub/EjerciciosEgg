
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ordenar_Matriz {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int m,n;
        System.out.println("Ingrese el tamaño de la matriz");
        System.out.print("Ingrese cantidad de filas: ");
        m=leer.nextInt();
        m=validar(m,2);
        /*
        while(m<2)
        {
            System.out.print("Ingrese un valor mayor a 2");
            m=leer.nextInt();
        }*/
        System.out.print("Ingrese cantidad de columnas: ");
        n=leer.nextInt();
        n=validar(n,2);
         /* while(n<2)
        {
            System.out.print("Ingrese un valor mayor a 2");
            n=leer.nextInt();
        }*/
         int[][]matriz=new int[m][n];
         carga(matriz,m,n);
         mostrar(matriz,m,n,"A");
         ordenar(matriz,m,n);
         mostrar(matriz,m,n,"A ordenada");
    
        System.out.println("Fin del programa.Adios");
 
    }
    
    static int validar(int a,int b)
    {
        Scanner l=new Scanner(System.in);
        int r=a;
        while(r<b)
        {
            System.out.print("Ingrese un valor mayor a "+b+" ");
        r=l.nextInt();
        }
       return r;
    }
    static void carga(int[][]a,int m,int n)
    {
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=(int)(Math.random()*100)-50;
    }
    static void mostrar(int[][]a,int m,int n,String mensaje)
    {
        System.out.println("La matriz "+mensaje+" es la siguiente:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
            
    }
    static void ordenar(int[][]a,int m,int n)
    {
        int[]b=new int[m*n];
        //Cargo vector
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               b[n*i+j]=a[i][j];
            }
            
        }
        //Metodo burbuja para ordenar
        int aux;
        for(int i=0;i<m*n-1;i++)
        {
            for(int j=i+1;j<m*n;j++)
            {
                if(b[i]>b[j])
                {
                    aux=b[i];
                    b[i]=b[j];
                    b[j]=aux;
                }
            }
        }
        //Cargo matriz ordenada
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=b[n*i+j];
            }
        }
    }
}
