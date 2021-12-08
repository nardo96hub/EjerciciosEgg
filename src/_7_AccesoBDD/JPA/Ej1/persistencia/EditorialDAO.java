/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.persistencia;

import _7_AccesoBDD.JPA.Ej1.entidades.Editorial;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Jorge
 */
public class EditorialDAO extends Conexion{
    public  void crearEditorial(Editorial e)
    {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
       // System.out.println("Se creo editorial");
    }
    public Editorial buscarEditorialNombre(String n)
    {
       // System.out.println("h");
        Editorial ed=null;
        try {
               ed=(Editorial)em.createQuery("SELECT E FROM Editorial E WHERE E.nombre=:nom").setParameter("nom", n).getSingleResult();
               return ed;
        
        }catch(NoResultException e)
        {
            System.out.println("No se encontro el editorial");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
             
       
        
       
    }
    public  List<Editorial> VerficarEdi()
    {  return em.createQuery("SELECT l from Editorial l ").getResultList();
        
    }
    public boolean Verificar(String n)
    {
        if(buscarEditorialNombre(n)==null)
        {
            return true;
        }else return false;
    }
   
    
}
