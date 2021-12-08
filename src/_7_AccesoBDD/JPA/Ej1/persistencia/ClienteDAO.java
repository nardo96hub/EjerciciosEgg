/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.persistencia;


import _7_AccesoBDD.JPA.Ej1.entidades.Cliente;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Jorge
 */
public class ClienteDAO extends Conexion{
    public void crearCliente(Cliente c)
    {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
     public Cliente buscarClienteNombre(String n)
    {
       Cliente c =null;
        try {
              c=(Cliente)
                em.createQuery("SELECT a FROM Cliente a WHERE a.nombre:cod").
                setParameter("cod", n).getSingleResult();
        return c;
        }catch(NoResultException e){
            System.out.println("No se encontro el autor");
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     
    }
     public List<Cliente> VerificarCliente() {
         
        return em.createQuery("SELECT a from Cliente a ").getResultList();
    }
   
}
