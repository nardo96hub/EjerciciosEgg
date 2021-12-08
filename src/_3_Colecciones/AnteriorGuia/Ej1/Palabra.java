/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_Colecciones.AnteriorGuia.Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Palabra {
    ArrayList<String> pal=new ArrayList();
    
    Scanner l=new Scanner(System.in).useDelimiter("\n");
    public Palabra() {
    }

    public ArrayList<String> getPal() {
        return pal;
    }

    public void setPal(ArrayList<String> pal) {
        this.pal = pal;
    }
    
    public void CrearFrase()
    {
        /*String p,resp;
        resp = "n";
        do
        {
            System.out.println("Ingrese una palabra para agregar");
            p=l.next();
            pal.add(p);
            
            
            System.out.println("Desea ingresar otra palabra? (S/N)");
            resp=l.next();
            while(!resp.equalsIgnoreCase("s")&&!resp.equalsIgnoreCase("n"))
            {
              System.out.println("Desea ingresar otra palabra? (S/N)");
            resp=l.next();  
            }
        }while(resp.equalsIgnoreCase("s"));
*/
        pal.add("hola");
        pal.add("mundo");
        pal.add("cruel");
        pal.add("destino");
        pal.add("horrible");
        
    }
    public void mostrar(int i)
    {
        Collections.sort(pal);
        if(i<pal.size())
        {   for(int j=0;j<i;j++)
            {
                System.out.print(pal.get(j)+" _ ");
            }
            
        }
        else
        {
            System.out.println("Desea ver mas elementos de lo que existe en el arreglo de igual forma se mostrara todos los elementos");
            System.out.println("Array:");
            for(String n:pal)
            {
                System.out.print(n+" _ "); 
            }
            System.out.println("");
        }
        
    }
}
