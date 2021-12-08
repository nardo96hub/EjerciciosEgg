package _2_JavaPoo.EjEx3;

public class Raices {

    Double a, b, c;

    public Raices(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    private Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    private Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    private double getDiscriminante() {
        return (Math.pow(getB(), 2) - 4 * getA() * getC());
    }

    private boolean tieneRaices() {
        if (getDiscriminante() > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void obtenerRaices() {
        double x1, x2;
        x1 = (-getB() + Math.sqrt(getDiscriminante())) / (2 * getA());
        x2 = (-getB() - Math.sqrt(getDiscriminante())) / (2 * getA());
        System.out.println("Dada la ecuacion: " + getA() + "X^2+" + getB() + "X+" + getC() + "=0 tiene las raices x1=" + x1 + " y x2=" + x2);

    }

   private void obtenerRaiz() {
        double x1 = -getB() / (2 * getA());
        System.out.println("Dada la ecuacion: " + getA() + "X^2+" + getB() + "X+" + getC() + "=0 tiene la raiz x1=" + x1);
    }

    public void calcular() {
        if (getA() != 0) {
            if (getDiscriminante() >= 0) {
                if (tieneRaices()) {
                    obtenerRaices();
                } else {
                    obtenerRaiz();
                }

            } else {
                System.out.println("Dada la ecuacion: " + getA() + "X^2+" + getB() + "X+" + getC() + "=0 si llega a existir raices no son reales ");
            }
        } else {
            if(getB()!=0)
            {
                System.out.println("Dada la ecuacion: " + getA() + "X^2+" + getB() + "X+" + getC() + "=0 x="+(-getC())/getB());
            }
            else
                System.out.println("Dada la ecuacion: " + getA() + "X^2+" + getB() + "X+" + getC() + "=0 No Existe Raices ");

        }
    }
}
