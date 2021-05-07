package com.jonathan.datos;

import com.jonathan.domain.Persona;
import java.util.*;

public interface IPersonaDao {

    public List<Persona> findAllPersona();

    public Persona findPersonaById(Persona persona);

    public Persona findPersonaByEmail(Persona persona);

    public void insertarPersona(Persona persona);

    public void updatePersona(Persona persona);

    public void deletePersona(Persona persona);
}
