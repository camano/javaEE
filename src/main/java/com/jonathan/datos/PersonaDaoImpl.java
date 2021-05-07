package com.jonathan.datos;

import com.jonathan.domain.*;
import java.util.*;
import javax.ejb.*;
import javax.persistence.*;

@Stateless
public class PersonaDaoImpl implements IPersonaDao {

    @PersistenceContext(unitName = "test")
    EntityManager em;

    @Override
    public List<Persona> findAllPersona() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email=:email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertarPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona));

    }

}
