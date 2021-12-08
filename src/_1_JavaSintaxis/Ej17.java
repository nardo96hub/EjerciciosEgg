
package _1_JavaSintaxis;

import java.util.Scanner;


public class Ej17 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int bien,mal,tamano;
        String frase;
        bien=mal=0;
        
        System.out.println("Ingrese una frase");
        frase=leer.next();
        while(!frase.equals("&&&&&"))
        {
            
            if(frase.length()<=5 && frase.substring(0,1).equals("X") && frase.substring(frase.length()-1,frase.length()).equals("O"))
                bien++;
            else
                mal++;
            
            System.out.println("Ingrese una frase. &&&&& para terminar");
            frase=leer.next();
        }
        
        System.out.println("El informe de ingresos RS232 es el siguiente:");
        System.out.println("De un total de "+ (bien+mal)+" frases hay un total de "+bien+"correctas y "+mal+" incorrectas");
            
    }
    
}
