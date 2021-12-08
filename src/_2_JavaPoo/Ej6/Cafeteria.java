/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_JavaPoo.Ej6;

/**
 *
 * @author Jorge
 */
public class Cafeteria {
    Integer capmax,capact;

    public Cafeteria() {
    }

    public Cafeteria(Integer capmax, Integer capact) {
        this.capmax = capmax;
        this.capact = capact;
    }

    public Integer getCapmax() {
        return capmax;
    }

    public void setCapmax(Integer capmax) {
        this.capmax = capmax;
    }

    public Integer getCapact() {
        return capact;
    }

    public void setCapact(Integer capact) {
        this.capact = capact;
    }
    
}
