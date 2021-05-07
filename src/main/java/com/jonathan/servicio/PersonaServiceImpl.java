package com.jonathan.servicio;

import com.jonathan.datos.IPersonaDao;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import com.jonathan.domain.Persona;
import javax.inject.Inject;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {

    @Inject
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersona();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertarPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }

}
