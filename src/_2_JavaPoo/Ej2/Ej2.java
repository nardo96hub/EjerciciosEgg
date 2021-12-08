
package _2_JavaPoo.Ej2;


public class Ej2 {

  
    public static void main(String[] args) {
       Circunferencia c1=new Circunferencia(8);
       Circunferencia c2=new Circunferencia(3);
       
       Circunferencia c3=new Circunferencia();
       Circunferencia c4=new Circunferencia();
       //c2.setRadio(8);
       c3.setRadio(7);
       c4.crearCircunferencia();
       
       //c4.crearCircunferencia();
        System.out.println("El radio del objeto es:"+c1.getRadio()+" tiene area="+c1.area()+" y perimetro="+c1.perimetro());
        System.out.println("El radio del objeto es:"+c2.getRadio()+" tiene area="+c2.area()+" y perimetro="+c2.perimetro());
        System.out.println("El radio del objeto es:"+c3.getRadio()+" tiene area="+c3.area()+" y perimetro="+c3.perimetro());
        System.out.println("El radio del objeto es:"+c4.getRadio()+" tiene area="+c4.area()+" y perimetro="+c4.perimetro());
        System.out.println("-------------------------------------");
        
        
       
    }
    
}
