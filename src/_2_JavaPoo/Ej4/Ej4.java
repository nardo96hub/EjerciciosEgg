
package _2_JavaPoo.Ej4;


public class Ej4 {

   
    public static void main(String[] args) {
        Rectangulo r=new Rectangulo(8.0,4.0);
        //r.crearRec();
        System.out.println("Dado el rectangulo con base="+r.getBase()+" y altura="+r.getAltura()+" tiene perimetro="+r.perimetro()+" y superficie="+r.superficie());
        r.dibujarR();
    }
    
}
