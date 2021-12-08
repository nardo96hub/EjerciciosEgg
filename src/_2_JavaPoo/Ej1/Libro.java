
package _2_JavaPoo.Ej1;

import java.util.Scanner;


public class Libro {
    String ISBN,Titulo,Autor;
    Integer Numpag;

    

    public Libro() {
      ISBN="hola";
      Titulo="Analista de Sistema";
      Autor="Nardelli pedro";
      Numpag=88;
    }

    public Libro(String ISBN, String Titulo, String Autor, Integer Numpag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numpag = Numpag;
    }
    public void carga(){
        Scanner l=new Scanner(System.in);
       
        System.out.println("Ingrese ISBN");
        ISBN=l.next();
        System.out.println("Ingrese titulo");
        Titulo=l.next();
        System.out.println("Ingrese autor");
        Autor=l.next();
        System.out.println("Ingrese num pag");
        Numpag=l.nextInt();
        
        
        
    }
    public void muestra(){
        System.out.println("ISBN="+ISBN);
        System.out.println("tITULO="+Titulo);
        System.out.println("autor="+Autor);
        System.out.println("pag="+Numpag);
    }

   
    
    
   
}
