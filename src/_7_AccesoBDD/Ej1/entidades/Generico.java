/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.entidades;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Generico<T>{
    
    private T obj=null;
    private ArrayList<T> resul;

    public Generico() {
        resul=new ArrayList();
    }

    public Generico(T obj, ArrayList<T> resul) {
        this.obj = obj;
        this.resul = resul;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public ArrayList<T> getResul() {
        return resul;
    }

    public void setResul(ArrayList<T> resul) {
        this.resul = resul;
    }

    public void mostrar()
    {
        for (T t : resul) {
            System.out.println(t);
        }
    }
   
}
