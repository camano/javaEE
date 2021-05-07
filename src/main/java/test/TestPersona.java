/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.*;
import com.jonathan.domain.Persona;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jonathan
 */
public class TestPersona {
    
  
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Persona persona = new Persona("Maricela5", "Romero5", "no tengo5", "23657675");
        log.debug("Objeto a persistir:" + persona);
        em.persist(persona);

        tx.commit();
        log.debug("Objeto persistido" + persona);
        em.close();
    }
}
