/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_JavaSintaxis;

/**
 *
 * @author Jorge
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector= new int[100];
        
        for(int i=0;i<vector.length;i++)
            vector[i]=i+1;
        for(int j=vector.length-1;j>=0;j--)
            System.out.print(vector[j]+" ");
        
        System.out.println("");
    }
    
}
