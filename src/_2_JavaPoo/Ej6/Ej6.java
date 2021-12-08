
package _2_JavaPoo.Ej6;


public class Ej6 {

  
    public static void main(String[] args) {
       Servicio s=new Servicio();
       Cafeteria c=s.crearcafeteria();
       s.mostrar(c);
       s.llenarCafeteria(c);
       s.mostrar(c);
       s.servirTaza(c, 8);
       s.mostrar(c);
       s.vaciarCafetera(c);
       s.mostrar(c);
       s.agregarCafe(c, 10);
        s.mostrar(c);
    }
    
}
