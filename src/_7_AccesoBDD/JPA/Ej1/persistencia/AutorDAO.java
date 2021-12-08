/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.persistencia;

import _7_AccesoBDD.JPA.Ej1.entidades.Autor;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Jorge
 */
public class AutorDAO extends Conexion{
    public void crearAutor(Autor a)
    {
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }
    public Autor buscarAutorNombre(String n)
    {
        Autor a =null;
        try {
              a=(Autor)
                em.createQuery("SELECT a FROM Autor a WHERE a.nombre=:cod").
                setParameter("cod", n).getSingleResult();
        return a;
        }catch(NoResultException e){
            System.out.println("No se encontro el autor");
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     
    }
    public boolean Verificar(String n)
    {
        if(buscarAutorNombre(n)==null)
        {
            return true;
        }else return false;
    }

    public List<Autor> VerificarAutor() {
        return em.createQuery("SELECT a from Autor a ").getResultList();
    }
}
