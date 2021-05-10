package com.jonathan.servicio;

import com.jonathan.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/personas")
@Stateless
public class PersonaServiceRS {

    @Inject
    private PersonaService personaService;

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Persona>listarPersona(){
        return personaService.listarPersonas();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Persona encontrarPersonaPorId(@PathParam("{id}")int id){
        return personaService.encontrarPersonaPorId(new Persona(id));
    }
    

}
