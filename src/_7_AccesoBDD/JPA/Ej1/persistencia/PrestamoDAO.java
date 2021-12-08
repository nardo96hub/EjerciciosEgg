/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.persistencia;

import _7_AccesoBDD.JPA.Ej1.entidades.Prestamo;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Jorge
 */
public class PrestamoDAO extends Conexion{
     public void crearPrestamo(Prestamo p)
    {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    public Prestamo buscarPrestamoNombre(String n)
    {
        Prestamo p =null;
        try {
              p=(Prestamo)
                em.createQuery("SELECT a FROM Autor a WHERE a.nombre=:cod").
                setParameter("cod", n).getSingleResult();
        return p;
        }catch(NoResultException e){
            System.out.println("No se encontro el autor");
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     
    }
    public List<Prestamo> VerificarPrestamo()
    {
        return em.createQuery("SELECT P FROM Prestamo P ").getResultList();
    }
}
