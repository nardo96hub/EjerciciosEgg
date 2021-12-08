
package _2_JavaPoo.Ej5;


public class Banco {
    Integer numc,dni;
    Double saldo;

    public Banco() {
    }

    public Banco(Integer numc, Integer dni, Double saldo) {
        this.numc = numc;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Integer getNumc() {
        return numc;
    }

    public void setNumc(Integer numc) {
        this.numc = numc;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
}
