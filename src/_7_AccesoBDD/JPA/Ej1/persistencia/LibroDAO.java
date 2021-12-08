/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.JPA.Ej1.persistencia;

import _7_AccesoBDD.JPA.Ej1.entidades.Autor;
import _7_AccesoBDD.JPA.Ej1.entidades.Editorial;
import _7_AccesoBDD.JPA.Ej1.entidades.Libro;

import java.util.List;

/**
 *
 * @author Jorge
 */
public class LibroDAO extends Conexion {

    public void crearLibro(Libro l) {
        try {
            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }

    }
    public void EliminarLibro(Libro l)
    {
        try {
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
        } catch (Exception e) {
       
            throw e;
        }
    }

    public Libro buscarLibroId(Long id) {
        /* Libro l=(Libro) em.createQuery("select l from libro l where l.ISBN=:id")
                .setParameter("id", id).getSingleResult();*/
        Libro l = em.find(Libro.class, id);

        return l;
    }

    public Libro buscarLibroTitulos(String t) {
        Libro l = (Libro) em.createQuery("select l from Libro l where l.titulo:tit")
                .setParameter("tit", t).getSingleResult();
        return l;
    }

    public List<Libro> buscarLibrosAutor(String t) {
        AutorDAO ad = new AutorDAO();
        Autor a = ad.buscarAutorNombre(t);
        List<Libro> li = em.createQuery("select l from Libro l where l.autor.id=:au")
                .setParameter("au", a.getId()).getResultList();
        return li;
    }

    public List<Libro> buscarLibrosEditorial(String t) {
        EditorialDAO ed = new EditorialDAO();
        Editorial e = ed.buscarEditorialNombre(t);
        List<Libro> li = em.createQuery("select e from Libro e where e.editorial.id=:edi")
                .setParameter("edi", e.getId()).getResultList();
        return li;

    }
    public List<Libro> verificarBDD()
    {
      return em.createQuery("SELECT l from Libro l ").getResultList();
    }
}
