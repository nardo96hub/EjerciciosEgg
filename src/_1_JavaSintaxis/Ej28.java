/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_JavaSintaxis;


public class Ej28 {

   
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int[][] b = new int[3][3];
        carga(a, 10);
        carga(b, 3);

        //mostrar(a,10,"M");
        mostrar(b,3,"P");
        
        submatriz(a,10,b,3);
        Mostrar(a,10,b[0][0]);

    }
    static void mostrar(int[][] m, int t,String a) {
        System.out.println("La matriz "+a+" es la siguiente:");
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    static void carga(int[][] m, int t) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    static void submatriz(int[][] m, int tm, int[][] p, int tp) {
        //Boolean p=false;
        int pe = 0;
        int auxi, auxj;
        auxi = auxj = 0;

        for (int i = 0; i < tm - 3; i++) 
        {
            for (int j = 0; j < tm - 3; j++) 
            {
                if (m[i][j] == p[0][0]) 
                {
                    pe = 1;
                    auxi = i;
                    auxj = j;
                }
            }
        }
        if (pe != 0) {
            System.out.print("La matriz P se encuentra en los indice: ");
            for (int i = 0; i < tp; i++) {
                for (int j = 0; j < tp; j++) {
                    m[auxi+i][auxj+j]=p[i][j];
                    System.out.print("("+(auxi+i)+","+(auxj+j)+")");
                }
            }
        } else {
            System.out.println("La matriz P no se encuentra en m");
        }
    }
    static void Mostrar(int[][]m,int t,int p)
    {
        System.out.println("\nLa matriz M es la siguiente:");
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if(p==m[i][j])
                    
                    System.out.print("\u001B[31m"+m[i][j]+"\u001B[0m ");
                else
                    System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}
