/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_Herencia.EjExtra.Ej1;

/**
 *
 * @author Jorge
 */
public class Velero extends Barco{
    Integer cantMas;

    public Velero() {
    }

    public Velero(Integer cantMas, String matricula, Integer eslora, Integer anioF) {
        super(matricula, eslora, anioF);
        this.cantMas = cantMas;
    }

    public Integer getCantMas() {
        return cantMas;
    }

    public void setCantMas(Integer cantMas) {
        this.cantMas = cantMas;
    }

    @Override
    public String toString() {
        return "Velero{" + "cantMas=" + cantMas + '}';
    }
     @Override
    public void Alquilar(Alquiler a)
    {
        long alquiler=Alquileres(a);
        alquiler=alquiler + getCantMas();
        System.out.println("Se debe pagar un alquiler de:"+alquiler);
     
    }
         public void crearBarcoV()
    {
        //Scanner l=new Scanner (System.in).useDelimiter("\n");
        crearBarco();
        
        System.out.println("Ingrese la potencia del barco");
        setCantMas(l.nextInt());
        if(getCantMas()<0) setCantMas(8);
      
        
    }
}
