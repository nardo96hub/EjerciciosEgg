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
public class BarcoMotor extends Barco{
    Integer PCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer PCV, String matricula, Integer eslora, Integer anioF) {
        super(matricula, eslora, anioF);
        this.PCV = PCV;
    }

    public Integer getPCV() {
        return PCV;
    }

    public void setPCV(Integer PCV) {
        this.PCV = PCV;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "PCV=" + PCV + '}';
    }
     @Override
    public void Alquilar(Alquiler a)
    {
        long alquiler=Alquileres(a);
        alquiler=alquiler + getPCV();
        System.out.println("Se debe pagar un alquiler de:"+alquiler);
     
    }
        public void crearBarcoM()
    {
        //Scanner l=new Scanner (System.in).useDelimiter("\n");
        crearBarco();
        
        System.out.println("Ingrese la potencia del barco");
        setPCV(l.nextInt());
        if(getPCV()<0) setPCV(8);
      
        
    }
    
}
