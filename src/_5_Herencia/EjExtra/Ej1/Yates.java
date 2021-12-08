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
public class Yates extends Barco{
    Integer PCV,numCam;

    public Yates() {
    }

    public Yates(Integer PCV, Integer numCam, String matricula, Integer eslora, Integer anioF) {
        super(matricula, eslora, anioF);
        this.PCV = PCV;
        this.numCam = numCam;
    }

    public Integer getPCV() {
        return PCV;
    }

    public void setPCV(Integer PCV) {
        this.PCV = PCV;
    }

    public Integer getNumCam() {
        return numCam;
    }

    public void setNumCam(Integer numCam) {
        this.numCam = numCam;
    }

    @Override
    public String toString() {
        return "Yates{" + "PCV=" + PCV + ", numCam=" + numCam + '}';
    }
    
   @Override
    public void Alquilar(Alquiler a)
    {
        long alquiler=Alquileres(a);
        alquiler=alquiler + getPCV()+getNumCam();
        System.out.println("Se debe pagar un alquiler de:"+alquiler);
     
    }
         public void crearBarcoY()
    {
        //Scanner l=new Scanner (System.in).useDelimiter("\n");
        crearBarco();
        
        System.out.println("Ingrese la potencia del barco");
        setPCV(l.nextInt());
        if(getPCV()<0) setPCV(8);
        System.out.println("Ingrese la cantidad de camarotes ");
        setNumCam(numCam);
        if(getNumCam()<0)setNumCam(8);
        
    }
}
