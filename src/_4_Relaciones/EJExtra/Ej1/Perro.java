
package _4_Relaciones.EJExtra.Ej1;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Perro {
    private String nombre,raza;
  private  Double edad,tamano;
  private boolean adoptado;

    public Perro(String nombre, String raza, Double edad, Double tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        adoptado=false;
    }

    public Perro() {
    }
    public void setAdopcion(boolean p)
    {
        this.adoptado=p;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getEdad() {
        return edad;
    }
     public boolean getAdopcion()
     {
         return adoptado;
     }
    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano +" adoptado:"+adoptado+ '}';
    }
 public void crearPerro() {
      Scanner l=new Scanner(System.in).useDelimiter("\n");
        String nombre, raza;
        Double edad, tamano;
        System.out.println("Ingrese nombre del perro");
        nombre=l.next();
        System.out.println("Ingrese raza del perro");
        raza=l.next();
        System.out.println("Ingrese edad del perro");
        edad=l.nextDouble();
        while(edad<0)
        {
                  System.out.println("Ingrese edad del perro");
        edad=l.nextDouble();  
        }
        System.out.println("Ingrese tamano del perro medida en cm<=100");
        tamano=l.nextDouble();
        while(tamano<5||tamano>100)
        {
            System.out.println("Ingrese tamano del perro medida en cm<=100");
        tamano=l.nextDouble();  
        }
        setEdad(edad);
        setAdopcion(false);
        setNombre(nombre);
        setRaza(raza);
        setTamano(tamano);
  
    }
}
