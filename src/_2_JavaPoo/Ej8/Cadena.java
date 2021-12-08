/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej8;

/**
 *
 * @author Jorge
 */
public class Cadena {

    String frase;
    int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public int MostrarVocales() {
        int v = 0;
        for (int i = 0; i < getLongitud(); i++) {
            if (!getFrase().substring(i, i + 1).equalsIgnoreCase("a") && !getFrase().substring(i, i + 1).equalsIgnoreCase("e") && !getFrase().substring(i, i + 1).equalsIgnoreCase("i") && !getFrase().substring(i, i + 1).equalsIgnoreCase("o") && !getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                v++;
            }
        }

        return v;
    }

    public void invertirfrase() {
        String f = getFrase();
        String i = "";
        for (int j = (getLongitud() - 1); j >= 0; j--) {
            i += f.charAt(j);
        }

        setFrase(i);
    }

    public void vecesRepetido(String a) {
        int letra = 0;
        String f = getFrase();
        for (int i = 0; i < getLongitud(); i++) {
            if (f.substring(i, i + 1).equals(a)) {
                letra++;
            }
        }
        System.out.println("La letra " + a + " se repite " + letra + " vez en la palabra " + getFrase());

    }

    public void comparar(String b) {
        if (getFrase().compareTo(b) == 0) {
            System.out.println("Las frases son iguales");
        } else {
            System.out.println("Las frases son distintas");
        }
    }

    public void unirfrase(String a) {
        setFrase(getFrase().concat(a));

    }

    public void mostrar() {
        System.out.println("La frase " + getFrase() + " tiene longitud:" + getLongitud());
    }

    public void reemplazar(String l) {

        String f = getFrase().replaceAll("a", l);
        setFrase(f);

    }
    public boolean contiene(String l)
    {
        return getFrase().contains(l);
    }

}
