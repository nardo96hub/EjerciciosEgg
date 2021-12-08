
package _7_AccesoBDD.JPA.Ej1.persistencia;

import javax.persistence.*;


public class Conexion {
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("Libreria");
    protected  EntityManager em=emf.createEntityManager();
}
