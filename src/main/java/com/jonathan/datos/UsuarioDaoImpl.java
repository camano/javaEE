package com.jonathan.datos;

import com.jonathan.domain.Usuario;
import java.util.List;
import javax.persistence.*;

public class UsuarioDaoImpl implements IUsuarioDao {

    @PersistenceContext(unitName = "test")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuario() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

}
