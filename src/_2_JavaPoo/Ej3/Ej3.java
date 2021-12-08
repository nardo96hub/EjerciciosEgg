package _2_JavaPoo.Ej3;

public class Ej3 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones(8,4);
        o.crearOperacion();
        
        System.out.println("La suma de " + o.getNum1() + " y " + o.getNum2() + " es de " + o.suma());
        System.out.println("La resta de " + o.getNum1() + " y " + o.getNum2() + " es de " + o.resta());
        System.out.println("El producto de " + o.getNum1() + " y " + o.getNum2() + " es de " + o.multiplicar());
        System.out.println("La division de " + o.getNum1() + " y " + o.getNum2() + " es de " + o.division());
    }

}
