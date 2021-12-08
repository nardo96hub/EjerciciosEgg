
package _2_JavaPoo.Ej2;

import java.util.Scanner;


public class Circunferencia {
    double radio;
    public Circunferencia(double radio){
        this.radio=radio;
    }
     Circunferencia(){}
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia()
    {
        Scanner l=new Scanner(System.in);
        System.out.println("Ingrese radio");
        double r=l.nextDouble();
        radio=r;
    }
    public double area(){
        return 3.14*radio*radio;
    }
    public double perimetro(){
        return 3.14*radio*2;
    }
    
    
}
