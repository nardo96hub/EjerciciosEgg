/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.EjEx6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ahorcado {

    char[] v;
    char[] l;//Guarda las letras de la palagra distintas 

    int cantle, cantjm;

    public Ahorcado(char[] v, int cantle, int cantjm) {
        this.v = v;
        this.cantle = cantle;
        this.cantjm = cantjm;
    }

    public Ahorcado() {
    }

    public void setL(char le) {
        System.out.println("Entre");
        for (int i = 0; i < l.length; i++) {
            if (l[i] == ' ') {
                l[i] = le;
                break;
            }
        }
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.println("");

    }

    private int buscarl(char le) {
        int c = 0;
        for (int i = 0; i < l.length; i++) {

            if (l[i] == le) {
                c++;
            }

        }
        return c;
    }

    private void setV(String p) {
        this.v = new char[p.length()];

        v = p.toCharArray();

        //this.v = new char[p.length() + 1];
    }

    private int getCantle() {
        return cantle;
    }

    public char[] getV() {
        return v;
    }

    private void setCantle(int cantle) {
        this.cantle = cantle;
    }

    public void setTamanol(String p) {
        char[] aux = p.toCharArray();
        int t = 0;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                if (i != j) {
                    if (aux[i] == aux[j]) {
                        aux[j] = ' ';
                    }
                }
            }
        }
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] != ' ') {
                t++;
            }
        }
        l = new char[t];
        for (int i = 0; i < l.length; i++) {
            l[i] = ' ';
        }

    }

    private int getCantjm() {
        return cantjm;
    }

    private void setCantjm(int cantjm) {
        this.cantjm = cantjm;
    }

    private void crearjuego() {
        String palabra;
        int cm;
        Scanner le = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra");
        palabra = le.nextLine();

        while (palabra.contains(" ")) {
            System.out.println("Ingrese nueva frase");
            palabra = le.nextLine();
        }
        setV(palabra);
        /*System.out.println("Ingrese cantidad de jugadas maximas");
        cm = le.nextInt();*/cm=7;
        while (cm < 1) {
            System.out.println("Ingrese cantidad de jugadas maximas");
            cm = le.nextInt();
        }
        setCantle(0);
        setCantjm(cm);
        setTamanol(palabra);
        System.out.println("Frase: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    private int longitud() {
        return v.length;
    }

    private boolean buscar(char a) {
      int j=0;
        for(int i=0;i<v.length;i++)
        {
            if(v[i]==a)j++;
        }
        return j>0;

    }

    private boolean encontradas(char a) {
        if (buscar(a)) {

            if (buscarl(a)==0) {
                int c = 0;

                for (int i = 0; i < v.length; i++) {
                    if (v[i] == a) {
                        c++;
                    }
                }
                setCantle((getCantle() + c));
            
                setL(a);
            }

            return true;
        } else {
            setCantjm((getCantjm() - 1));
            return false;
        }

    }

    private int intento() {
        return getCantjm();
    }
    private void dibujo(int a)
    {
        switch (a)
        {
            case 0:
            {
                
            }break;
            case 1:
            {
                
            }break;
            case 2:
            {
                
            }break;
            case 3:
            {
                
            }break;
            case 4:
            {
                
            }break;
            case 5:
            {
                
            }break;
            case 6:
            {
                
            }break;
            case 7:
            {
                for(int i=1;i<30;i++)
                {
                    //palo arriba
                    if(i>1){
                        System.out.print("║");
                    }
                    for(int j=1;j<20;j++)
                    {
                        //Palo horizontal
                        if(i==1)
                        {
                            
                            switch (j) {
                                case 1:
                                    System.out.print("╔");
                                    break;
                                case 15:
                                    System.out.print("╦");
                                    break;
                                default:
                                    System.out.print("═");
                                    break;              
                            }
                        }
                        else if((i>1&&i<8)&& j==12)
                        {
                            //if(i==8)System.out.print("╩");else
                                System.out.print("║");
                        }
                        else System.out.print("  ");
                        
                        
                    }
                    
                    System.out.println("");
                }
                System.out.println("\n");
            }break;
            
        }
    }
    public void juego() {

        char letra;
        Scanner leer = new Scanner(System.in);
        crearjuego();

        System.out.println("");
        System.out.println("Longitud de palabra: " + longitud());
        System.out.println("");
        System.out.println("Ingrese una letra");

        letra = leer.nextLine().charAt(0);
        while (getCantjm() > 0 && getCantle() < longitud()) {
            dibujo(getCantjm());
            if (encontradas(letra)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
                System.out.println("Numero de letras( encontradas,faltantes): (" + getCantle() + "," + (longitud() - getCantle()) + ")");
                System.out.println("Numero de oportunidades restantes: " + intento());
                System.out.println("---------------------------------------------");
                
                System.out.println("");
                System.out.println("");
            } else {
                System.out.println("Mensaje: La letra no  pertenece a la palabra");
                System.out.println("Numero de letras( encontradas,faltantes): (" + getCantle() + "," + (longitud() - getCantle()) + ")");
                System.out.println("Numero de oportunidades restantes: " + intento());
                System.out.println("---------------------------------------------");
                System.out.println("");
                System.out.println("");
            }

            
            
                System.out.println("Ingrese una letra");

            letra = leer.nextLine().charAt(0); 
            
           
        }
        System.out.println("Juego terminado");

    }

}


