
package _3_Colecciones.EjExtras.Ej1.Ej1Mesa;

import java.util.ArrayList;
import java.util.Scanner;


public class Servi {

    ArrayList<Integer> numeros;
    Scanner l = new Scanner(System.in);

    public Servi() {
        numeros = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void crearList() {
        Integer num = 8;
        System.out.println("Ingrese un numero");
        num = l.nextInt();
        
        while (num != -99) {
            getNumeros().add(num);
            System.out.println("Ingrese un numero");
            num = l.nextInt();
        }
        mostrar();
        suma();
    }
    private void suma()
    {
        Integer sum=0;
        double p;
        for (Integer numero : numeros) {
            sum+=numero;
            sum=sum+numero;
            sum=+numero;
         
        }
        p=(double)sum/getNumeros().size();
        System.out.println("El tamaño del array es:"+getNumeros().size()+" la suma da: "+sum+" el promedio es:"+p);
    }
    private void mostrar()
    {
        
        System.out.print("La lista contiene: [");
        for (Integer n : getNumeros()) {
            System.out.print(n+" ");
       
        }
        System.out.print("]\n");
 
    }

}
